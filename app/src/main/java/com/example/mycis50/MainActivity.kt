package com.example.mycis50

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.ui.AppBarConfiguration
import com.example.mycis50.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        val toggle = ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer.addDrawerListener(toggle)
        toggle.syncState()
        val navigationView = findViewById<View>(R.id.nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)
    }
    
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId
        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val url: String

        // Handle navigation view item clicks here.
        val id = item.itemId
        if (id == R.id.courses) {
            //to be pulled from firebase
        } else if (id == R.id.checks) {
            url = "https://cis.ncu.edu.jm/programschedule"
            val checks = Intent(Intent.ACTION_VIEW)
            checks.setData(Uri.parse(url))
            startActivity(checks)
        } else if (id == R.id.directory) {
            val dir = Intent(this, FSDirectory::class.java)
            startActivity(dir)
        } else if (id == R.id.emergency) {
            val emergency = Intent(this, Emergency::class.java)
            startActivity(emergency)
        } else if (id == R.id.news) {
            url = "http://cisatncu.blogspot.com/"
            val news = Intent(Intent.ACTION_VIEW)
            news.setData(Uri.parse(url))
            startActivity(news)
        } else if (id == R.id.fb) {
            url = "http://facebook.com/cisatncu"
            val fb = Intent(Intent.ACTION_VIEW)
            fb.setData(Uri.parse(url))
            startActivity(fb)
        } else if (id == R.id.tweet) {
            url = "http://twitter.com/cisatncu"
            val twitter = Intent(Intent.ACTION_VIEW)
            twitter.setData(Uri.parse(url))
            startActivity(twitter)
        } else if (id == R.id.ig) {
            url = "http://instagram.com/cisatncu"
            val twitter = Intent(Intent.ACTION_VIEW)
            twitter.setData(Uri.parse(url))
            startActivity(twitter)
        } else if (id == R.id.link) {
            url =
                "https://www.linkedin.com/company/department-of-computer-and-information-sciences-at-northern-caribbean-university/"
            val linkedin = Intent(Intent.ACTION_VIEW)
            linkedin.setData(Uri.parse(url))
            startActivity(linkedin)
        }
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

/*    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }*/
}