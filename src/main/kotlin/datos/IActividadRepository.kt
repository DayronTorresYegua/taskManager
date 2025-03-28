package org.example.datos

import org.example.dominio.Actividad

// Interfaz del CRUD (Create, Read, Update, Delete) Actividad
interface IActividadRepository {

    fun guardar(a: Actividad): Boolean

    fun recuperarPorId(id: Int): Actividad?

    fun recuperarTodas(): List<Actividad>

    fun actualizar(a: Actividad): Boolean

    fun borrarPorId(id: Int): Actividad?
}