package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.CaracteristicasVivienda1

@Dao
interface DaoCaracteristicasVivienda1 {
    @Query("SELECT * FROM CaracteristicasVivienda1")
    fun obtenerTodosCaracteristicasVivienda1(): LiveData<List<CaracteristicasVivienda1>>

    @Query("SELECT * FROM CaracteristicasVivienda1 WHERE id = :idArg")
    fun obtenerCaracteristicasVivienda1(idArg : Int) : LiveData<List<CaracteristicasVivienda1>>

    @Insert
    fun insertarCaracteristicasVivienda1(caracteristicasVivienda1: CaracteristicasVivienda1)

    @Update
    fun actualizarCaracteristicasVivienda1(caracteristicasVivienda1: CaracteristicasVivienda1)

    @Delete
    fun eliminarCaracteristicasVivienda1(caracteristicasVivienda1: CaracteristicasVivienda1)
}