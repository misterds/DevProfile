package com.example.serj.devprofile

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//made  rounde  coner on image
        val bitmap =BitmapFactory.decodeResource(resources,R.drawable.devslopesprofilelogo)
        val rounted = RoundedBitmapDrawableFactory.create(resources,bitmap)
        rounted.cornerRadius=15f
        logo.setImageDrawable(rounted)

    }

}
