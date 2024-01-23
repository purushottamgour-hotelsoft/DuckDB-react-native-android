package com.duckdbexample

import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import android.util.Log

class CalendarModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    // add to CalendarModule.kt
    override fun getName() = "CalendarModule"

    fun loadLib(): Boolean {
        try {
            System.loadLibrary("duckdb")
            return true
        } catch (ex: Exception) {
            System.err.println("WARNING: Could not load library")
            return false
        }
    }

        @ReactMethod(isBlockingSynchronousMethod = true)
        fun createCalendarEvent(name: String, location: String): String {
            val success = loadLib();

            // Check the result and perform additional actions if needed
            if (success) {
                return "Library loaded successfully."
                // Your additional logic here
            } else {
               return "Failed to load library."
                // Your error handling logic here
            }
        }


}