package com.example.learningapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawerLayout)
        navigationView = findViewById(R.id.navigationView)

        val headerView = navigationView.getHeaderView(0)
        //val profileButton = headerView.findViewById<Button>(R.id.profileButton)
        //val progressBar = headerView.findViewById<ProgressBar>(R.id.progressBar)
        //val currencyWallet = headerView.findViewById<Button>(R.id.currencyWallet)

        // Set up click listeners for the profile button and currency wallet
        //profileButton.setOnClickListener { /* Handle profile button click */ }
        //currencyWallet.setOnClickListener { /* Handle currency wallet button click */ }

        // Set up progress bar
        //progressBar.progress = 50 // Set the progress value as desired
    }
}