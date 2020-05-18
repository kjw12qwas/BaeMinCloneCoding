package com.example.baemin.Fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

@Suppress("DEPRECATION")
class FragmentAdapter (fm : FragmentManager) : FragmentPagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> {
                FirstFragment()
            }
            1 -> {
                SecondFragment()
            }
            else ->{
                ThirdFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

}