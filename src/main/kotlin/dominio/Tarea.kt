package org.example.dominio

class Tarea private constructor(descripcion: String, var estado: Status = Status.ABIERTA): Actividad(descripcion) {

    override val detalle: String
        get() = "$id - $descripcion"

    override fun toString(): String {
        return "Tarea[id: $id, fechaCreación: $fechaCreacion, descripción: $descripcion , estado: $estado]"
    }

    companion object {
        fun crearInstancia(descripcion: String): Actividad {
            return Tarea(descripcion)
        }
    }

}

enum class Status {
    ABIERTA, CERRADA
}