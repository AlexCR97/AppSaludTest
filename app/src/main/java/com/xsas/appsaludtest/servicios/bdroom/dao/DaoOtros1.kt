package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.Otros1

@Dao
interface DaoOtros1 {
    @Query("SELECT * FROM Otros1")
    fun obtenerTodosOtros1(): LiveData<List<Otros1>>

    @Query("SELECT * FROM Otros1 WHERE id = :idArg")
    fun obtenerOtros1(idArg : Int) : LiveData<List<Otros1>>

    @Insert
    fun insertarOtros1(otros1: Otros1)

    @Update
    fun actualizarOtros1(otros1: Otros1)

    @Delete
    fun eliminarOtros1(otros1: Otros1)
}