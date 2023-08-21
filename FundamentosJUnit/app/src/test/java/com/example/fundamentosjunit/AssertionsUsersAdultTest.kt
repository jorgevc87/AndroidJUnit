package com.example.fundamentosjunit

import org.junit.*
import org.junit.Assert.*

class AssertionsUsersAdultTest {

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

        println("Before")
    }

    @After
    fun tearDown() {
        /*
        Este metodo se ejecuta despues de las funciones que tienen la etiqueta @Test
        Se usa para reciclar recursos, colocar variables en nulo, etc
        */

        bot = User()
        juan = User()
        println("After")
    }

    @Test
    fun isAdult() {
        val assertions = Assertions()

        assertions.setLocation("ES")

        assertTrue(assertions.isAdult(juan))
        assertTrue(assertions.isAdult(bot))
    }
}