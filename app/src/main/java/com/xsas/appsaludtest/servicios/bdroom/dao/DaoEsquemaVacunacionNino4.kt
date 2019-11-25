package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionNino4

@Dao
interface DaoEsquemaVacunacionNino4 {
    @Query("SELECT * FROM EsquemaVacunacionNino4")
    fun obtenerTodosEsquemaVacunacionNino4(): LiveData<List<EsquemaVacunacionNino4>>

    @Query("SELECT * FROM EsquemaVacunacionNino4 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionNino4(idArg : Int) : LiveData<List<EsquemaVacunacionNino4>>

    @Insert
    fun insertarEsquemaVacunacionNino4(esquemaVacunacionNino4: EsquemaVacunacionNino4)

    @Update
    fun actualizarEsquemaVacunacionNino4(esquemaVacunacionNino4: EsquemaVacunacionNino4)

    @Delete
    fun eliminarEsquemaVacunacionNino4(esquemaVacunacionNino4: EsquemaVacunacionNino4)
}