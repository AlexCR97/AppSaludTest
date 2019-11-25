package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAnciano3

@Dao
interface DaoEsquemaVacunacionAnciano3 {
    @Query("SELECT * FROM EsquemaVacunacionAnciano3")
    fun obtenerTodosEsquemaVacunacionAnciano3(): LiveData<List<EsquemaVacunacionAnciano3>>

    @Query("SELECT * FROM EsquemaVacunacionAnciano3 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionAnciano3(idArg : Int) : LiveData<List<EsquemaVacunacionAnciano3>>

    @Insert
    fun insertarEsquemaVacunacionAnciano3(esquemaVacunacionAnciano3: EsquemaVacunacionAnciano3)

    @Update
    fun actualizarEsquemaVacunacionAnciano3(esquemaVacunacionAnciano3: EsquemaVacunacionAnciano3)

    @Delete
    fun eliminarEsquemaVacunacionAnciano3(esquemaVacunacionAnciano3: EsquemaVacunacionAnciano3)
}