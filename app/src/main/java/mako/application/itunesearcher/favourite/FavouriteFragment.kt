package mako.application.itunesearcher.favourite

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mako.application.itunesearcher.R
import mako.application.itunesearcher.base.BaseBindingFragment
import mako.application.itunesearcher.databinding.FragmentFavouriteBinding

class FavouriteFragment: BaseBindingFragment<FragmentFavouriteBinding>() {
    private lateinit var llm: LinearLayoutManager

    override fun getLayoutResources(): Int {
        return R.layout.fragment_favourite
    }

    override fun onViewCreated(viewBinding: FragmentFavouriteBinding) {
        viewBinding.apply {
            llm = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
            // todo adapter
        }
    }
}