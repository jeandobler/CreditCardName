package com.dobler.creditcardname.robots

import com.dobler.creditcardname.R


fun convertName(func: ConvertNameRobot.() -> Unit) = ConvertNameRobot()
    .apply { func() }

class ConvertNameRobot : BaseTestRobot() {

    fun setName(name: String) = fillEditText(R.id.edYourName, name)

    fun clickOnConvertButton() = clickButton(R.id.btConvertName)

    fun matchMessage(message: String) = matchText(textView(R.id.tvCreditCardName), message)

}