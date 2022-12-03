package com.wallace.appeventsfacebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.FacebookSdk
import com.facebook.LoggingBehavior
import com.facebook.appevents.AppEventsLogger
import com.facebook.internal.Logger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logSentFriendRequestEvent()
    }

    fun logSentFriendRequestEvent() {
        FacebookSdk.setIsDebugEnabled(true)
        FacebookSdk.addLoggingBehavior(LoggingBehavior.APP_EVENTS)
        val newLogger = AppEventsLogger.newLogger(this)
        newLogger.logEvent("sentFriendRequest")
        newLogger.logEvent("testeWallace")
    }
}