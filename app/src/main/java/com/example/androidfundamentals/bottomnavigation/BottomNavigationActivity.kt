package com.example.androidfundamentals.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.androidfundamentals.R
import com.example.androidfundamentals.fragments.FirstFragment
import com.example.androidfundamentals.fragments.SecondFragment
import com.example.androidfundamentals.fragments.ThirdFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)
        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val thirdFragment = ThirdFragment()
        setCurrentFragment(firstFragment)
        findViewById<BottomNavigationView>(R.id.bottomNavigationView)
            .setOnNavigationItemSelectedListener {
                when(it.itemId) {
                    R.id.miHome -> setCurrentFragment(firstFragment)
                    R.id.miMessages -> setCurrentFragment(secondFragment)
                    R.id.miProfile -> setCurrentFragment(thirdFragment)
                }
                true
            }
        findViewById<BottomNavigationView>(R.id.bottomNavigationView)
            .getOrCreateBadge(R.id.miMessages).apply {
                number = 10
                isVisible = true
            }
    }
    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flNavigation, fragment)
            commit()
        }
    }
}