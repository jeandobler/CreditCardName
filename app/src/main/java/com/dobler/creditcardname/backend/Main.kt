package com.dobler.creditcardname.backend

import com.dobler.creditcardname.helper.CreditCardNameConverter
import java.util.*

fun main() {

    while (true) {
        val reader = Scanner(System.`in`)
        print("Enter your name:")
        val name = reader.nextLine()

        if (name.equals("exit")) {
            break
        }

        print("Your Credit Card Name is: ")

        val converted = CreditCardNameConverter.convert(name)
        print(converted)

        println("")
    }
}
