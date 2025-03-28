package org.example.dominio

class Evento private constructor(descripcion: String, var ubicacion: String, fechaRealizacion: String): Actividad("Evento") {

    override val detalle: String
        get() = "$id - $ubicacion - $descripcion"

    init {
        require(fechaRealizacion.matches(Regex("""\d{2}/\d{2}/\d{4}"""))) {"Fecha de realización invalida"}
    }

    override fun toString(): String {
        return "Evento=[id: $id, fechaCreación: $fechaCreacion, ubicación: $ubicacion, fechaRealizacion: $fechaRealizacion]"
    }

    companion object {
        fun crearInstancia(descripcion: String, ubicacion: String, fechaRealizacion: String): Evento {
            return Evento(descripcion, ubicacion, fechaRealizacion)
        }
    }
}