package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.Cancer3

@Dao
interface DaoCancer3 {
    @Query("SELECT * FROM Cancer3")
    fun obtenerTodosCancer3(): LiveData<List<Cancer3>>

    @Query("SELECT * FROM Cancer3 WHERE id = :idArg")
    fun obtenerCancer3(idArg : Int) : LiveData<List<Cancer3>>

    @Insert
    fun insertarCancer3(cancer3: Cancer3)

    @Update
    fun actualizarCancer3(cancer3: Cancer3)

    @Delete
    fun eliminarCancer3(cancer3: Cancer3)
}