package org.example.presentacion

import org.example.servicios.ServicioActividad

// De igual forma, la comunicación entre la interfaz de usuario y la lógica de negocio debe estar claramente separada, por lo que se debe utilizar interfaces o abstracciones para comunicarse entre capas.

object IUAplicacion {

    var servicioActividad = ServicioActividad()

    fun inicio() {
        menu()
    }

    private fun menu() {
        var seguir = true
        do {
            println("1. Crear nueva actividad")
            println("2. Listar todas las actividades")
            println("3. Listar las tareas")
            println("4. Salir")
            println("Ingrese una opción")
            val opcion = readLine()
            when (opcion) {
                "1" -> crearActividad()
                "2" -> listarActividades()
                "3" -> listarTareas()
                "4" -> seguir = false
                else -> println("Opción invalido")
            }
        } while (seguir)
        return
    }

    private fun listarTareas() {
        TODO("Not yet implemented")
    }

    private fun listarActividades() {
        TODO("Not yet implemented")
    }

    private fun crearActividad() {
        TODO("Not yet implemented")
    }

}



