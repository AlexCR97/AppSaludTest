package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacion

@Dao
interface DaoEsquemaVacunacion {
    @Query("SELECT * FROM EsquemaVacunacion")
    fun obtenerTodosEsquemaVacunacion(): LiveData<List<EsquemaVacunacion>>

    @Query("SELECT * FROM EsquemaVacunacion WHERE id = :idArg")
    fun obtenerEsquemaVacunacion(idArg : Int) : LiveData<List<EsquemaVacunacion>>

    @Insert
    fun insertarEsquemaVacunacion(esquemaVacunacion: EsquemaVacunacion)

    @Update
    fun actualizarEsquemaVacunacion(esquemaVacunacion: EsquemaVacunacion)

    @Delete
    fun eliminarEsquemaVacunacion(esquemaVacunacion: EsquemaVacunacion)
}