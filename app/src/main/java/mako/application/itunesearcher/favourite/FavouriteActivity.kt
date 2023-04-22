package mako.application.itunesearcher.favourite

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import mako.application.itunesearcher.R

class FavouriteActivity: AppCompatActivity() {
    private var favouriteFragment: FavouriteFragment = FavouriteFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourite)

        supportFragmentManager?.apply {
            beginTransaction().replace(R.id.favourite_container, favouriteFragment)
                .commit()
        }
    }
}