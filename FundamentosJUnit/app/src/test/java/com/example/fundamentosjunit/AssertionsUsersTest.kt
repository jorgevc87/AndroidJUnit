package com.example.fundamentosjunit

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class AssertionsUsersTest {
    //Variables globales
    private lateinit var bot: User
    private lateinit var juan: User
    private lateinit var assertions: Assertions

    @Before
    fun setup() {
        /*
        Este metodo se ejecuta antes de cualquier otra funcion con la etiqueta @Test
        Se utiliza para inicializar objetos que serán usado en los tests
        */
        assertions = Assertions()
        bot = User(name = "8bit", age = 1, isHuman = false)
        juan = User(name = "Juan", age = 18, isHuman = true)
    }

    @Test
    fun checkHumanTest() {
        assertFalse("mensaje cuando el test false booleano falla", assertions.checkHuman(bot))
        assertTrue("mensaje cuando el test true booleano falla", assertions.checkHuman(juan))
    }

    @Test
    fun checkNoNullUserTest() {
        assertNotNull("El usuario no es nulo", juan)
    }
}