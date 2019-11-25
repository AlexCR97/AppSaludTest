package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.Cancer1

@Dao
interface DaoCancer1 {
    @Query("SELECT * FROM Cancer1")
    fun obtenerTodosCancer1(): LiveData<List<Cancer1>>

    @Query("SELECT * FROM Cancer1 WHERE id = :idArg")
    fun obtenerCancer1(idArg : Int) : LiveData<List<Cancer1>>

    @Insert
    fun insertarCancer1(cancer1: Cancer1)

    @Update
    fun actualizarCancer1(cancer1: Cancer1)

    @Delete
    fun eliminarCancer1(cancer1: Cancer1)
}