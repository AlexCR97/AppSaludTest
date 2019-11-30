package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAnciano2

@Dao
interface DaoEsquemaVacunacionAnciano2 {
    @Query("SELECT * FROM EsquemaVacunacionAnciano2")
    fun obtenerTodosEsquemaVacunacionAnciano2(): LiveData<List<EsquemaVacunacionAnciano2>>

    @Query("SELECT * FROM EsquemaVacunacionAnciano2 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionAnciano2(idArg : Int) : LiveData<List<EsquemaVacunacionAnciano2>>

    @Insert
    fun insertarEsquemaVacunacionAnciano2(esquemaVacunacionAnciano2: EsquemaVacunacionAnciano2)

    @Update
    fun actualizarEsquemaVacunacionAnciano2(esquemaVacunacionAnciano2: EsquemaVacunacionAnciano2)

    @Delete
    fun eliminarEsquemaVacunacionAnciano2(esquemaVacunacionAnciano2: EsquemaVacunacionAnciano2)
}