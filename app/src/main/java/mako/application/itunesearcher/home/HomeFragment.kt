package mako.application.itunesearcher.home

import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.lifecycle.ViewModelProviders
import mako.application.itunesearcher.BR
import mako.application.itunesearcher.R
import mako.application.itunesearcher.base.BaseBindingFragment
import mako.application.itunesearcher.databinding.FragmentHomeBinding

class HomeFragment: BaseBindingFragment<FragmentHomeBinding>(), AdapterView.OnItemSelectedListener {
    private lateinit var viewModel: HomeViewModel

    override fun getLayoutResources(): Int {
        return R.layout.fragment_home
    }

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

            viewModel = ViewModelProviders.of(requireActivity())
                .get(HomeViewModel::class.java)

            viewModel.getLiveData()
                .observe(requireActivity()) {
                    it?.apply {

                    }

                    viewBinding.setVariable(BR.isProcessing, false)
                    viewBinding.executePendingBindings()
                }

            viewBinding.setVariable(BR.isProcessing, false)
            viewBinding.executePendingBindings()
        }
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        parent?.apply {
            // todo keyword
            // todo filter

            val key = "jack+johnson"
            val filter = getItemAtPosition(position)

            // todo temp
            viewBinding.setVariable(BR.isProcessing, true)
            viewBinding.executePendingBindings()
            viewModel.search(key)
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

}
