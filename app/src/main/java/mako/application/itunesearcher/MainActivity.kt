package mako.application.itunesearcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import mako.application.itunesearcher.home.HomeFragment

class MainActivity : AppCompatActivity(),  NavigationBarView.OnItemSelectedListener {
    lateinit var bottomNavView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavView = findViewById(R.id.homeBottomNavView)
        bottomNavView.setOnItemSelectedListener(this)
        bottomNavView.selectedItemId = R.id.navigation_home
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.navigation_home ->
            supportFragmentManager?.apply {
                beginTransaction().replace(R.id.home_container, HomeFragment()).commitAllowingStateLoss()
            }
        }
        return true
    }
}