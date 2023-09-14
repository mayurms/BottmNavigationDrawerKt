package com.example.bottmnavigationdrawerkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.Bottm_Navigation)

        bottomNavigationView.setOnItemSelectedListener{ menuItem ->
            when(menuItem.itemId){
                R.id.home_nav ->{
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.notification_nav ->{
                    replaceFragment(NotificationFragment())
                    true
                }

                R.id.photo_nav -> {
                    replaceFragment(PhotoFragment())
                    true
                }

                R.id.setting_nav -> {
                    replaceFragment(SettingFragment())
                    true
                }

                else -> false
            }
        }

    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container,fragment).commit()
    }
}