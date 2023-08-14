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

    @Test
    fun checkHumanTest() {
        val assertions = Assertions()
        val bot = User(name = "8bit", age = 1, isHuman = false)
        val juan = User(name = "Juan", age = 18, isHuman = true)

        assertFalse("mensaje cuando el test booleano falla", assertions.checkHuman(bot))
        assertTrue("mensaje cuando el test booleano falla", assertions.checkHuman(bot))
    }

    @Test
    fun checkNullUserTest() {
        val user = null
        assertNull("El usuario es nulo", user)

        val assertions = Assertions()
        assertNull(assertions.checkHuman(user))
    }

    @Test
    fun checkNoNullUserTest() {
        val user = null
        assertNotNull("El usuario no es nulo", user)
    }
}