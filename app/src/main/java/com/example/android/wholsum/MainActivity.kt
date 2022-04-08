package com.example.android.wholsum

import android.app.SearchManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.SearchView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.android.wholsum.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var searchView: SearchView
//TODO update bottom nav bar to include fab
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
    //setup bottom navigation as toplevel pic hid toolbar
        setSupportActionBar(findViewById(R.id.wholsum_bottom_navigation))
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        val navController = navHostFragment.navController
        appBarConfiguration = AppBarConfiguration(navController.graph)
        binding.wholsumBottomNavigation
            .setupWithNavController(navController)

    }
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.fragment_container)
        return navController.navigateUp()
                || super.onSupportNavigateUp()
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        searchOptions(menu)
        return true
    }

    private fun searchOptions(menu: Menu) {
        val search = menu.findItem(R.id.app_bar_search)
        searchView = search.actionView as SearchView

        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        (searchView).apply {
            setSearchableInfo(searchManager.getSearchableInfo(componentName))
        }
    }
}