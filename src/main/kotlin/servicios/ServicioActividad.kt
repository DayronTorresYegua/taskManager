package org.example.servicios

import org.example.dominio.Actividad
import org.example.dominio.Tarea

// La lógica de negocio debe depender de abstracciones (por ejemplo, interfaces de repositorios) y no de implementaciones concretas

class ServicioActividad(){

    fun crearActividad(descripcion: String): Actividad {
        return Tarea.crearInstancia(descripcion)
    }

    fun crearActividad(descripcion: String, ubicacion: String, fechaRealizacion: String): Actividad {

    }

}