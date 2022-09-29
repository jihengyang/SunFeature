package com.sun.dynamicfeature

import android.app.Activity
import android.os.Bundle

/**
 * Created by hengyangji on 2022/9/27
 */
class DynamicActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic)
    }
}