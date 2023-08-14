package com.example.fundamentosjunit

import org.junit.Assert.*
import org.junit.Test

class AssertionsTest {

    @Test
    fun getArrayTest() {
        val assertions = Assertions()
        //val array = arrayOf(21, 117) // Estes es el valor esperado
        val array = arrayOf(21, 11) // Estes es el valor esperado

        assertArrayEquals(array, assertions.getLuckyNumbers())
    }
}