package com.dobler.creditcardname


import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.dobler.creditcardname.robots.convertName
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainScreenTest {

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)


    @Test
    fun whenStartApp_displayCorrectText() {
        convertName {
            matchMessage("YOUR NAME HERE")
        }
    }

    @Test
    fun whenNameFieldIsEmpty_pressConvertButton_displayWarningMessage() {

        convertName {
            clickOnConvertButton()

            matchMessage("WRITE YOUR NAME FIRST")
        }
    }

    @Test
    fun whenWriteANameInNameField_PressConvertButton_displayConvertedValue() {

        convertName {

            setName("Your Name Here")

            clickOnConvertButton()

            matchMessage("YOUR N HERE")

        }

    }
}
