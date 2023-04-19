package mako.application.itunesearcher.fragment

import mako.application.itunesearcher.R
import mako.application.itunesearcher.databinding.FragmentHomeBinding


class HomeFragment: BaseBindingFragment<FragmentHomeBinding>() {
    override fun getLayoutResources(): Int {
        return R.layout.fragment_home
    }

    override fun onViewCreated(viewBinding: FragmentHomeBinding) {
        viewBinding.apply {

        }
    }

}
