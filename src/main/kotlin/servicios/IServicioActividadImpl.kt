package org.example.servicios

import org.example.dominio.Actividad
import org.example.dominio.Status
import org.example.dominio.Tarea

class IServicioActividadImpl : IServicioActividad {
    override fun crearActividad(descripcion: String): Actividad? {
        Tarea.crearInstancia(descripcion)
    }

    override fun crearActividad(
        descripcion: String,
        ubicacion: String,
        fechaRealizacion: String
    ): Actividad? {
        TODO("Not yet implemented")
    }

    override fun recuperarTareaPorEstado(estado: Status): List<Tarea> {
        TODO("Not yet implemented")
    }

    override fun cambiarEstado(tarea: Tarea): Boolean {
        TODO("Not yet implemented")
    }
}