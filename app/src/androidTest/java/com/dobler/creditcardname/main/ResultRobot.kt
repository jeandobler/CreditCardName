package com.dobler.creditcardname.main

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.dobler.creditcardname.R

fun assertRobot(func: ResultRobot.() -> Unit) = ResultRobot()
    .apply { func() }

class ResultRobot {

    fun matchTextOnCard(message: String) {
        Espresso.onView(withId(R.id.tvCreditCardName))
            .check(matches(withText(message)))

    }

}
