package com.sun.sunfeature

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.start_dynamic).setOnClickListener {
            startActivity(Intent().apply {
                component = ComponentName("com.sun.sunfeature", "com.sun.dynamicfeature.DynamicActivity")
            })
        }

    }
}