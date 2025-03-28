package org.example.dominio
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

abstract class Actividad(val descripcion: String) {

    val id: Int
    val fechaCreacion: String
    abstract val detalle: String

    companion object {
        private var contador = 0
            get() = ++field
    }

    init {
        require(descripcion.isNotBlank()) { "Descripcion cannot be empty" }
        id = Actividad.contador
        fechaCreacion = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString()
    }
}