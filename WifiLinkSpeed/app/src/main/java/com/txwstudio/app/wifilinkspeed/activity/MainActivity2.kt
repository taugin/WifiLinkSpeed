package com.txwstudio.app.wifilinkspeed.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.snackbar.Snackbar
import com.txwstudio.app.wifilinkspeed.R
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
//        setupToolBar()

        val navHostFrag =
                supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFrag.navController
    }

    private fun setupToolBar() {
//        setSupportActionBar(toolbar_mainFrag)
//        supportActionBar?.setDisplayShowTitleEnabled(false)
    }
}