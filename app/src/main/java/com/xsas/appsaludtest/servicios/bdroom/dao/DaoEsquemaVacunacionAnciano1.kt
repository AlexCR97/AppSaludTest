package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAnciano1

@Dao
interface DaoEsquemaVacunacionAnciano1 {
    @Query("SELECT * FROM EsquemaVacunacionAnciano1")
    fun obtenerTodosEsquemaVacunacionAnciano1(): LiveData<List<EsquemaVacunacionAnciano1>>

    @Query("SELECT * FROM EsquemaVacunacionAnciano1 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionAnciano1(idArg : Int) : LiveData<List<EsquemaVacunacionAnciano1>>

    @Insert
    fun insertarEsquemaVacunacionAnciano1(esquemaVacunacionAnciano1: EsquemaVacunacionAnciano1)

    @Update
    fun actualizarEsquemaVacunacionAnciano1(esquemaVacunacionAnciano1: EsquemaVacunacionAnciano1)

    @Delete
    fun eliminarEsquemaVacunacionAnciano1(esquemaVacunacionAnciano1: EsquemaVacunacionAnciano1)
}