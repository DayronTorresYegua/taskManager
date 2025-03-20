package org.example.dominio

abstract class Actividad(val descripcion: String) {
    val id: Int
    val fechaCreacion: String

    abstract val detalle: String

    init {
        id = (0..1000).random()
        fechaCreacion = "2025-10-01"
    }

    companion object {
        private var contador = 0
            get() = ++field
    }

    override fun toString(): String {
        return super.toString()
    }
}