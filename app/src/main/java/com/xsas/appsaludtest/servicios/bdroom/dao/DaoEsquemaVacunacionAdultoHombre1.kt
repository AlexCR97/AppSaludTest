package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdultoHombre1

@Dao
interface DaoEsquemaVacunacionAdultoHombre1 {
    @Query("SELECT * FROM EsquemaVacunacionAdultoHombre1")
    fun obtenerTodosEsquemaVacunacionAdultoHombre1(): LiveData<List<EsquemaVacunacionAdultoHombre1>>

    @Query("SELECT * FROM EsquemaVacunacionAdultoHombre1 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionAdultoHombre1(idArg : Int) : LiveData<List<EsquemaVacunacionAdultoHombre1>>

    @Insert
    fun insertarEsquemaVacunacionAdultoHombre1(esquemaVacunacionAdultoHombre1: EsquemaVacunacionAdultoHombre1)

    @Update
    fun actualizarEsquemaVacunacionAdultoHombre1(esquemaVacunacionAdultoHombre1: EsquemaVacunacionAdultoHombre1)

    @Delete
    fun eliminarEsquemaVacunacionAdultoHombre1(esquemaVacunacionAdultoHombre1: EsquemaVacunacionAdultoHombre1)
}