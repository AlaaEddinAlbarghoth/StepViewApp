package com.alaaeddinalbarghoth.stepviewapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.badoualy.stepperindicator.StepperIndicator
import android.support.v4.view.ViewPager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pager = findViewById<ViewPager>(R.id.pager)!!
        pager.adapter = PagerAdapter(supportFragmentManager)

        val indicator = findViewById<StepperIndicator>(R.id.stepper_indicator)

        indicator.setViewPager(pager, true)
        indicator
            .addOnStepClickListener { step -> pager.setCurrentItem(step, true) }
    }
}
