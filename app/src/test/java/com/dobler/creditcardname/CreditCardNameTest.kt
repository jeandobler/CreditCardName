package com.dobler.creditcardname

import com.dobler.creditcardname.helper.CreditCardNameConverter
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class CreditCardNameTest {

    @Test
    fun givenNameWith3WordsWithPreposition_whenConvert_shouldBeEquals() {
        val name = "Bruno de Lima e Silva"
        val shouldReturn = "BRUNO L SILVA"

        assertEquals(CreditCardNameConverter.convert(name), shouldReturn)
    }

    @Test
    fun givenNameWith3WordsWithoutPreposition_whenConvert_shouldBeEquals() {
        val name = "Joao Lucas Oliveira"
        val shouldReturn = "JOAO L OLIVEIRA"

        assertEquals(CreditCardNameConverter.convert(name), shouldReturn)
    }

    @Test
    fun givenNameWith2WordsWithPreposition_whenConvert_shouldBeEquals() {
        val name = "Bruno de Lima"
        val shouldReturn = "BRUNO LIMA"

        assertEquals(CreditCardNameConverter.convert(name), shouldReturn)
    }

    @Test
    fun givenNameWithMoreThan3WordsWithoutPrepositionAndTheLastWordIsANonName_whenConvert_shouldBeEquals() {
        val name = "JEAN PIERRE SOLTO JUNIOR"
        val shouldReturn = "JEAN P SOLTO"

        assertEquals(CreditCardNameConverter.convert(name), shouldReturn)
    }

    @Test
    fun givenNameLowerCase_whenConvert_shouldBeUpperCase() {
        val name = "jean Dobler"
        val shouldReturn = "JEAN DOBLER"

        assertEquals(CreditCardNameConverter.convert(name), shouldReturn)
    }

    @Test
    fun givenNameWithMoreThan3WordsWithoutPreposition_whenConvert_shouldBeEquals() {
        val name = "LUCIA ROSA MARIA PEREIRA SOUZA"
        val shouldReturn = "LUCIA R P SOUZA"

        assertEquals(CreditCardNameConverter.convert(name), shouldReturn)
    }

    @Test
    fun givenNameWithApostrofe_whenConvert_shouldBeRemoved() {
        val name = "Alessandro D'Avilla"
        val shouldReturn = "ALESSANDRO DAVILLA"

        assertEquals(CreditCardNameConverter.convert(name), shouldReturn)
    }

}
