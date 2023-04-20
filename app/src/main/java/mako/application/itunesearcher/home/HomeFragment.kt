package mako.application.itunesearcher.home

import android.app.Activity
import android.content.Context
import android.text.TextUtils
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.ContextCompat.getSystemService
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import mako.application.itunesearcher.BR
import mako.application.itunesearcher.R
import mako.application.itunesearcher.base.BaseBindingFragment
import mako.application.itunesearcher.databinding.FragmentHomeBinding


class HomeFragment: BaseBindingFragment<FragmentHomeBinding>(), AdapterView.OnItemSelectedListener {
    private lateinit var viewModel: HomeViewModel
    private lateinit var adapter: HomeListAdapter
    private lateinit var llm: LinearLayoutManager

    private var userInput = "";
    private var filterCategory: String = "song"

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
                    if (!isProcessing!! && llm.findLastVisibleItemPosition() == adapter.itemCount - 1) {
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
            viewModel = ViewModelProviders.of(requireActivity())
                .get(HomeViewModel::class.java)

            // receive live data
            viewModel.getLiveData()
                .observe(requireActivity()) {
                    it?.apply {
                        adapter.refresh(response = results, filterCategory)
                        adapter.notifyDataSetChanged()
                    }

                    viewBinding.setVariable(BR.showMainProgress, false)
                    viewBinding.setVariable(BR.isProcessing, false)
                    viewBinding.executePendingBindings()
                }

            viewBinding.setVariable(BR.showMainProgress, false)
            viewBinding.setVariable(BR.isProcessing, false)
            viewBinding.executePendingBindings()
        }
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        parent?.apply {
            filterCategory = getItemAtPosition(position)!!.toString()
            filterCategory = filterCategory.lowercase()

            if(filterCategory == "artist") {
                filterCategory = "musicArtist"
            }
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {}

    fun submit(homeInput: AppCompatEditText) {
        // get user input
        userInput = homeInput.text.toString()
        homeInput.setText("")

        // reset adapter data
        adapter.reset()

        if(!TextUtils.isEmpty(userInput)) {
            userInput = userInput.replace(" ", "+")
            viewBinding.setVariable(BR.showMainProgress, true)
            viewBinding.executePendingBindings()
            actionSearch(true)

        } else {
            Snackbar.make(requireContext(), homeInput, resources.getString(R.string.error_empty_input), Snackbar.LENGTH_SHORT).show()
        }

        val imm = requireContext().getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(homeInput.windowToken, 0)
    }

    fun actionSearch(resetOffset: Boolean) {
        if(viewBinding.isProcessing!!) return

        Log.d("machael", "trigger")
        viewBinding.setVariable(BR.isProcessing, true)
        viewBinding.executePendingBindings()
        viewModel.search(userInput, filterCategory, resetOffset)
    }
}
