package com.alaaeddinalbarghoth.stepviewapp

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


internal class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 5
    }

    override fun getItem(position: Int): Fragment {
        return PageFragment.newInstance(position + 1, position == count - 1)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "Page $position"
    }
}