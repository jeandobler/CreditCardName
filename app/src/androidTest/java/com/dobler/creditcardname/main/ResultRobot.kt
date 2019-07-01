package com.dobler.creditcardname.main

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.dobler.creditcardname.R

class ResultRobot {

    fun matchTextOnCard(message: String) {
        Espresso.onView(ViewMatchers.withId(R.id.tvCreditCardName))
            .check(ViewAssertions.matches(ViewMatchers.withText(message)))

    }

}
