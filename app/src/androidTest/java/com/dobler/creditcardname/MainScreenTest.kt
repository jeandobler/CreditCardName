package com.dobler.creditcardname

import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.dobler.creditcardname.main.actRobot
import com.dobler.creditcardname.main.arrangeRobot
import com.dobler.creditcardname.main.assertRobot
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainScreenTest {

    @get:Rule
    var activityRule: IntentsTestRule<MainActivity> = IntentsTestRule(MainActivity::class.java)

    @Test
    fun whenNameFieldIsEmpty_pressConvertButton_displayWarningMessage() {
        arrangeRobot {
            mockHomeIntent()
        }
        actRobot {
            setName("")
            clickOnConvertButton()
        }
        assertRobot {
            matchTextOnCard("WRITE YOUR NAME FIRST")
        }
    }

    @Test
    fun whenWriteANameInNameField_PressConvertButton_displayConvertedValue() {
        arrangeRobot {
            mockHomeIntent()
        }
        actRobot {
            setName("Your Name Here")
            clickOnConvertButton()
        }
        assertRobot {
            matchTextOnCard("YOUR N HERE")
        }
    }
}
