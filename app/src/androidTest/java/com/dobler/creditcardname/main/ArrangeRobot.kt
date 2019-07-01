package com.dobler.creditcardname.main

import android.app.Activity
import android.app.Instrumentation
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.IntentMatchers
import com.dobler.creditcardname.MainActivity


fun arrangeRobot(func: ArrangeRobot.() -> Unit) = ArrangeRobot()
    .apply { func() }

class ArrangeRobot {

    fun clearPreferences() {

    }

    fun mockHomeIntent() {
        Intents.intending(IntentMatchers.hasComponent(MainActivity::class.java.name))
            .respondWith(Instrumentation.ActivityResult(Activity.RESULT_OK, null))
    }

}
