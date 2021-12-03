package com.example.light_switch_mobile

import android.content.Context
import android.hardware.camera2.CameraManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ListView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.Button1)
        button.text = "..."

        // schijf hier tussen je (setup) code

        val background = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.background)
        button.text = "Light is off"
        background.setBackgroundResource(R.color.black)
        var light = false
        button.setOnClickListener {
            if (!light) {
                button.text = "Light is on"
                background.setBackgroundColor(getColor(R.color.yellow))
                Log.d("button pressed","light is on")
                light = true
            } else if (light) {
                button.text = "Light is off"
                background.setBackgroundColor(getColor(R.color.black))
                Log.d("button pressed","light is off")
                light = false
            }
        }

        // schijf hier tussen je (setup) code

    }

    // schijf hier tussen je eventuele function(s)

    // schijf hier tussen je eventuele function(s)
}
