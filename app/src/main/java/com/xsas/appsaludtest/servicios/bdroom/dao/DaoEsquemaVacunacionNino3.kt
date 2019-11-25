package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionNino3

@Dao
interface DaoEsquemaVacunacionNino3 {
    @Query("SELECT * FROM EsquemaVacunacionNino3")
    fun obtenerTodosEsquemaVacunacionNino3(): LiveData<List<EsquemaVacunacionNino3>>

    @Query("SELECT * FROM EsquemaVacunacionNino3 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionNino3(idArg : Int) : LiveData<List<EsquemaVacunacionNino3>>

    @Insert
    fun insertarEsquemaVacunacionNino3(esquemaVacunacionNino3: EsquemaVacunacionNino3)

    @Update
    fun actualizarEsquemaVacunacionNino3(esquemaVacunacionNino3: EsquemaVacunacionNino3)

    @Delete
    fun eliminarEsquemaVacunacionNino3(esquemaVacunacionNino3: EsquemaVacunacionNino3)
}