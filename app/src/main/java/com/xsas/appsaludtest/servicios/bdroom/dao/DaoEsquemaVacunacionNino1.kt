package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionNino1

@Dao
interface DaoEsquemaVacunacionNino1 {
    @Query("SELECT * FROM EsquemaVacunacionNino1")
    fun obtenerTodosEsquemaVacunacionNino1(): LiveData<List<EsquemaVacunacionNino1>>

    @Query("SELECT * FROM EsquemaVacunacionNino1 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionNino1(idArg : Int) : LiveData<List<EsquemaVacunacionNino1>>

    @Insert
    fun insertarEsquemaVacunacionNino1(esquemaVacunacionNino1: EsquemaVacunacionNino1)

    @Update
    fun actualizarEsquemaVacunacionNino1(esquemaVacunacionNino1: EsquemaVacunacionNino1)

    @Delete
    fun eliminarEsquemaVacunacionNino1(esquemaVacunacionNino1: EsquemaVacunacionNino1)
}