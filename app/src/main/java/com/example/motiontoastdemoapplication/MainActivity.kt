package com.example.motiontoastdemoapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.res.ResourcesCompat
import www.sanju.motiontoast.MotionToast

class MainActivity : AppCompatActivity() {
    private lateinit var mClickMe:AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mClickMe = findViewById(R.id.ClickMe)
        mClickMe.setOnClickListener {
            MotionToast.Companion.createToast(this,"Hi this is test message",MotionToast.TOAST_SUCCESS,MotionToast.GRAVITY_BOTTOM,MotionToast.LONG_DURATION,ResourcesCompat.getFont(this,R.font.helvetica_regular))
        }


    }
}