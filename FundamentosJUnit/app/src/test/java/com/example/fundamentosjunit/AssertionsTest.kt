package com.example.fundamentosjunit

import org.junit.Assert.*
import org.junit.Test

class AssertionsTest {

    @Test
    fun getArrayTest() {
        val assertions = Assertions()
        val array = arrayOf(21, 117) // Estes es el valor esperado
        //val array = arrayOf(21, 11) // Estes es el valor esperado

        assertArrayEquals(
            "Mensaje personalizado de error en testing",
            array,
            assertions.getLuckyNumbers()
        )
    }

    @Test
    fun getNameTest() {
        val assertions = Assertions()

        val name = "Jorge Luis"
        val otherName = "Max"

        assertEquals("El nombre no coincide con el esperado", name, assertions.getName())
        assertNotEquals("El nombre no coincide con el esperado", otherName, assertions.getName())
    }
}