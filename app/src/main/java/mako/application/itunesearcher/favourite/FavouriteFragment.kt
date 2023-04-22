package mako.application.itunesearcher.favourite

import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mako.application.itunesearcher.R
import mako.application.itunesearcher.base.BaseBindingFragment
import mako.application.itunesearcher.databinding.FragmentFavouriteBinding
import mako.application.itunesearcher.home.HomeViewModel
import mako.application.itunesearcher.units.Utils

class FavouriteFragment: BaseBindingFragment<FragmentFavouriteBinding>() {
    private lateinit var llm: LinearLayoutManager
    private lateinit var adapter: FavouriteAdapter

    override fun getLayoutResources(): Int {
        return R.layout.fragment_favourite
    }

    override fun onViewCreated(viewBinding: FragmentFavouriteBinding) {
        viewBinding.apply {
            llm = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)           // list view
            adapter = FavouriteAdapter(requireContext(), ViewModelProviders.of(requireActivity())[HomeViewModel::class.java])
            favouriteList.layoutManager = llm
            favouriteList.adapter = adapter
            adapter.refresh(Utils.getFavouriteList(requireContext()))
        }
    }
}