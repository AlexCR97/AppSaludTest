package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionNino2

@Dao
interface DaoEsquemaVacunacionNino2 {
    @Query("SELECT * FROM EsquemaVacunacionNino2")
    fun obtenerTodosEsquemaVacunacionNino2(): LiveData<List<EsquemaVacunacionNino2>>

    @Query("SELECT * FROM EsquemaVacunacionNino2 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionNino2(idArg : Int) : LiveData<List<EsquemaVacunacionNino2>>

    @Insert
    fun insertarEsquemaVacunacionNino2(esquemaVacunacionNino2: EsquemaVacunacionNino2)

    @Update
    fun actualizarEsquemaVacunacionNino2(esquemaVacunacionNino2: EsquemaVacunacionNino2)

    @Delete
    fun eliminarEsquemaVacunacionNino2(esquemaVacunacionNino2: EsquemaVacunacionNino2)
}