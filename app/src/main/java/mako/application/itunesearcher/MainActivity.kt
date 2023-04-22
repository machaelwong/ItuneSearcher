package mako.application.itunesearcher

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import mako.application.itunesearcher.favourite.FavouriteActivity
import mako.application.itunesearcher.home.HomeFragment
import mako.application.itunesearcher.units.Utils

class MainActivity : AppCompatActivity() {
    private val receiver = MainBroadcastReceiver()

    companion object {
        val homeFragment = HomeFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager?.apply {
            beginTransaction().replace(R.id.home_container, homeFragment).commitAllowingStateLoss()
        }
    }

    override fun onResume() {
        super.onResume()
        val filter = IntentFilter()
        filter.addAction(Utils.ACTION_FAV_REFRESH)
        registerReceiver(receiver, filter)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(receiver)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.bottom_nav_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.navigation_favorite -> {
                startActivity(Intent(this@MainActivity, FavouriteActivity::class.java))
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    class MainBroadcastReceiver : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            if(intent.action == Utils.ACTION_FAV_REFRESH) {
                homeFragment.refreshFavourite()
            }
        }
    }
}