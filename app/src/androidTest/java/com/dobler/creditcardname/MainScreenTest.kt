package com.dobler.creditcardname


import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.dobler.creditcardname.main.arrangeRobot
import com.dobler.creditcardname.main.mainScreen
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

        mainScreen {
            setName("")

        } clickOnConvertButton {
            matchTextOnCard("WRITE YOUR NAME FIRST")
        }

    }

    @Test
    fun whenWriteANameInNameField_PressConvertButton_displayConvertedValue() {

        arrangeRobot {
            mockHomeIntent()
        }

        mainScreen {
            setName("Your Name Here")

        } clickOnConvertButton {
            matchTextOnCard("YOUR N HERE")
        }
    }

}
