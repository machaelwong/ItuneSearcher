package mako.application.itunesearcher.home

import android.app.Activity
import android.text.TextUtils
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.widget.AppCompatEditText
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import mako.application.itunesearcher.BR
import mako.application.itunesearcher.R
import mako.application.itunesearcher.api.ItuneAPI
import mako.application.itunesearcher.base.BaseBindingFragment
import mako.application.itunesearcher.databinding.FragmentHomeBinding
import mako.application.itunesearcher.units.Utils


class HomeFragment: BaseBindingFragment<FragmentHomeBinding>(), AdapterView.OnItemSelectedListener {
    private lateinit var viewModel: HomeViewModel
    private lateinit var adapter: HomeListAdapter
    private lateinit var llm: LinearLayoutManager

    private var userInput = ""
    private var spinnerSelectedId = 0
    private var filterCategory: String = "song"
    private var hasNextPage = true
    private var hasInit = false

    override fun getLayoutResources(): Int { return R.layout.fragment_home }

    override fun onViewCreated(viewBinding: FragmentHomeBinding)
    {
        viewBinding.apply {

            // init spinner
            ArrayAdapter.createFromResource(
                requireContext(),
                R.array.home_filter,
                android.R.layout.simple_spinner_item
            ).also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                homeSpinner.adapter = adapter
                homeSpinner.onItemSelectedListener = this@HomeFragment
            }

            // list view
            llm = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
            adapter = HomeListAdapter(requireContext())
            homeResultList.layoutManager = llm
            homeResultList.adapter = adapter
            homeResultList.addOnScrollListener(object : RecyclerView.OnScrollListener() {
                override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                    super.onScrolled(recyclerView, dx, dy)
                    if (hasNextPage && !isProcessing!! && llm.findLastVisibleItemPosition() == adapter.itemCount - 1) {
                        actionSearch(false)
                    }
                }
            })

            // input field
            homeInput.setOnEditorActionListener { v, actionId, event ->
                if (actionId == EditorInfo.IME_ACTION_DONE && !viewBinding.isProcessing!!) {
                    submit(homeInput)
                }
                false
            }

            // view model init
            viewModel = ViewModelProviders.of(requireActivity())[HomeViewModel::class.java]

            // receive live data
            viewModel.getLiveData().observe(requireActivity())
            {
                it?.apply {
                    if(results.size < ItuneAPI.REQUEST_LIMIT) hasNextPage = false
                    adapter.refresh(response = results, filterCategory)
                }

                viewBinding.setVariable(BR.showMainProgress, false)
                viewBinding.setVariable(BR.isProcessing, false)
                viewBinding.executePendingBindings()
            }

            viewModel.isFavouriteRemoved().observe(requireActivity()) {
                refreshFavourite()
            }

            viewBinding.setVariable(BR.showMainProgress, false)
            viewBinding.setVariable(BR.isProcessing, false)
            viewBinding.executePendingBindings()
        }
    }

    override fun onStop() {
        super.onStop()
        viewModel.getLiveData().removeObservers(this@HomeFragment)
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        spinnerSelectedId = position
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {}

    fun refreshFavourite() {
        adapter.resetFavourite()
        adapter.notifyDataSetChanged()
    }

    private fun submit(homeInput: AppCompatEditText) {

        // check if empty or not
        if(!TextUtils.isEmpty(homeInput.text.toString())) {
            hasNextPage = true

            // get user input
            userInput = homeInput.text.toString().replace(" ", "+")

            // reset adapter data
            adapter.reset()

            // get filter
            filterCategory = viewBinding.homeSpinner.adapter.getItem(spinnerSelectedId)!!.toString()
            filterCategory = filterCategory.lowercase()

            if(filterCategory == Utils.WRAPPER_TYPE_ARTIST) {
                filterCategory = Utils.FILTER_TYPE_ARTIST
            }

            viewBinding.setVariable(BR.showMainProgress, true)
            viewBinding.executePendingBindings()
            homeInput.setText("")

            actionSearch(true)

        } else {
            Snackbar.make(requireContext(), homeInput, resources.getString(R.string.error_empty_input), Snackbar.LENGTH_SHORT).show()
        }

        homeInput.clearFocus()
        val imm = requireContext().getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(homeInput.windowToken, 0)
    }

    fun actionSearch(resetOffset: Boolean) {
        if(viewBinding.isProcessing!!) return

        viewBinding.setVariable(BR.isProcessing, true)
        viewBinding.executePendingBindings()
        viewModel.search(userInput, filterCategory, resetOffset)
    }
}
