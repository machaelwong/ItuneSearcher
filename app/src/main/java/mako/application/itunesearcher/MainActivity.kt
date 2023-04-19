package mako.application.itunesearcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mako.application.itunesearcher.home.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager?.apply {
            beginTransaction().replace(R.id.home_container, HomeFragment()).commitAllowingStateLoss()
        }
    }
}