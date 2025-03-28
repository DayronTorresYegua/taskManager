package org.example.datos

import org.example.dominio.Actividad

class ActividadRepositoryMemoria : IActividadRepository {
    // Una lista para almacenar las actividades en memoria

    private val repositorio = mutableListOf<Actividad>()

    override fun guardar(a: Actividad): Boolean {
        var guardado = false
        if (repositorio.find { it.id == a.id } == null) {
            guardado = repositorio.add(a)
        }
        return guardado
    }

    override fun recuperarPorId(id: Int): Actividad? {
        var actividad : Actividad? = null
        var actividades = repositorio.filter {it.id == id}
        if (actividades.isNotEmpty()) {
            actividad = actividades[0]
        }
        return actividad
    }

    override fun recuperarTodas(): List<Actividad> {
        return repositorio.toList()
    }

    override fun actualizar(a: Actividad): Boolean {
        var actualizado = false
        var actual = repositorio.find { it.id == a.id }
        if (actual != null) {
            repositorio.remove(actual)
            actualizado = repositorio.add(a)
        }
        return actualizado
    }

    override fun borrarPorId(id: Int): Actividad? {
        var actual = repositorio.find { it.id == id }
        if (actual != null) {
            repositorio.remove(actual)
        }
        return actual
    }
}