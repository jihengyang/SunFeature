package com.sun.sunfeature

import android.app.Application
import android.content.Context
import android.util.Log

/**
 * Created by hengyangji on 2022/9/29
 */
class SunApplication : Application() {
    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        val packageInfo = base.packageManager.getPackageInfo("com.sun.sunfeature", 0)
        Log.i("SunApplication", "split name: ${packageInfo.splitNames.contentToString()}")
    }
}