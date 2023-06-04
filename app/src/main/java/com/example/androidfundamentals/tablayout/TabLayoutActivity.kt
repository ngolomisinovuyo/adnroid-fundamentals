package com.example.androidfundamentals.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.androidfundamentals.R
import com.example.androidfundamentals.viewpager.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class TabLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout_acivity)
        val images = listOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5)
        val adapter = ViewPagerAdapter(images)
        val viewPager = findViewById<ViewPager2>(R.id.tabViewPager)
        viewPager.adapter = adapter
        TabLayoutMediator(findViewById<TabLayout>(R.id.tabLayout), viewPager) { tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()
        findViewById<TabLayout>(R.id.tabLayout)
            .addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    Toast.makeText(this@TabLayoutActivity, "Selected ${tab?.text}",
                        Toast.LENGTH_SHORT).show()
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                    Toast.makeText(this@TabLayoutActivity, "Unselected ${tab?.text}",
                        Toast.LENGTH_SHORT).show()
                }

                override fun onTabReselected(tab: TabLayout.Tab?) {
                    Toast.makeText(this@TabLayoutActivity, "Reselected ${tab?.text}",
                    Toast.LENGTH_SHORT).show()
                }
            })
    }
}