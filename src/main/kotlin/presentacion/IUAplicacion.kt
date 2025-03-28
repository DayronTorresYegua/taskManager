package org.example.presentacion

import org.example.dominio.Actividad
import org.example.servicios.ServicioActividad

// De igual forma, la comunicación entre la interfaz de usuario y la lógica de negocio debe estar claramente separada, por lo que se debe utilizar interfaces o abstracciones para comunicarse entre capas.

class IUAplicacion(var servicioActividad: IServicioActividad) {

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

    
    private fun crearTarea(): Actividad? {
        var descripcion = ""
        do {
            println("Ingrese la descripción de la tarea")
            val descripcion = readLine()
            if (descripcion.isNullOrBlank()) {
                println("Descripción no puede estar vacía")
            }
        } while (descripcion.isNullOrBlank())
        
        return servicioActividad.crearActividad(descripcion)
    }
    
    private fun crearEvento(): Actividad? {
        
        var descripcion = ""
        var fechaRealizacion = ""
        var ubicacion = ""
        
        do {
            println("Ingrese la descripción de la tarea:")
            descripcion = readln()
            if (descripcion.isNullOrBlank()) {
                println("La descripción no puede estar vacía")
            }
            println("Ingrese la ubicacion del evento:")
            ubicacion = readln()
            if (ubicacion.isNullOrBlank()) {
                println("La ubicación no puede estar vacía")
            }
            println("Ingrese la fecha de realización del evento (dd/MM/yyyy")
            fechaRealizacion = readln()
            val fechaValida = fechaRealizacion?.matches(Regex("""\d{2}/\d{2}/\d{4}"""))
            if (!fechaValida) {
                println("Fecha de realización inválida")
            }
            
        } while (descripcion.isNullOrBlank() || ubicacion.isNullOrBlank() || !fechaValida)
        
        return ServicioActividad.crearActividad(descripcion, ubicacion, fechaRealizacion)

    }
    
    private fun crearActividad() {
        var actividad: Actividad? = null
        do {
            println("¿Que tipo de actividad desea crear?")
            println("1. Tarea")
            println("2. Evento")
            println("Ingrese una opción")
            val opcion = readLine()
            when (opcion) {
                "1" -> actividad = crearTarea()
                "2" -> actividad = crearEvento()
                else -> "Opción invalida"
            }
        } while (opcion != "1" && opcion != "2")
        return actividad
    
        // Crear actividad Evento
    }

}