package com.dobler.creditcardname.main

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.dobler.creditcardname.R


fun actRobot(func: MainScreenRobot.() -> Unit) = MainScreenRobot()
    .apply { func() }

class MainScreenRobot {

    fun setName(name: String) {
        onView(withId(R.id.edYourName))
            .perform(ViewActions.replaceText(name), ViewActions.closeSoftKeyboard())
    }

    fun clickOnConvertButton() {
        onView((withId(R.id.btConvertName))).perform(ViewActions.click())
    }


}
