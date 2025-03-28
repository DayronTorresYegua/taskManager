package org.example.servicios

import org.example.dominio.Actividad
import org.example.dominio.Status
import org.example.dominio.Tarea

interface IServicioActividad {
    fun crearActividad(descripcion: String): Actividad?
    fun crearActividad(descripcion: String, ubicacion: String, fechaRealizacion: String): Actividad?
    fun recuperarTareaPorEstado(estado: Status): List<Tarea>
    fun cambiarEstado(tarea: Tarea): Boolean
}