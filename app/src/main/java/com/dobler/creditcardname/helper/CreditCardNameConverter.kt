package com.dobler.creditcardname.helper

object CreditCardNameConverter {

    private val excludePreposition = listOf("A", "DE", "DA", "E", "DOS", "DAS", "JUNIOR", "FILHO", "NETO")

    fun convert(name: String): String {

        val nameArrayList = convertToUpperCaseAndRemovePrepositions(name)

        return when {
            nameArrayList.size == 2 -> nameArrayList.joinToString(" ")

            nameArrayList.size >= 3 -> nameWithMoreThan3WordsConverter(nameArrayList)

            else -> ""
        }


    }

    private fun nameWithMoreThan3WordsConverter(nameList: List<String>): String {
        return nameList[0] +
                " " + nameList[1][0] +
                if (nameList.size > 3) {
                    " " + nameList[nameList.lastIndex - 1][0]
                } else {
                    ""
                } +
                " " + nameList.last()
    }

    private fun convertToUpperCaseAndRemovePrepositions(name: String): List<String> {
        return name.toUpperCase()
            .replace(Regex("[-'_]"), "")
            .split(" ")
            .filter {
                !excludePreposition.contains(it)
            }
    }

}
