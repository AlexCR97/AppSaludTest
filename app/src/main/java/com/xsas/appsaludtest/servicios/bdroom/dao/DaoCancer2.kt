package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.Cancer2

@Dao
interface DaoCancer2 {
    @Query("SELECT * FROM Cancer2")
    fun obtenerTodosCancer2(): LiveData<List<Cancer2>>

    @Query("SELECT * FROM Cancer2 WHERE id = :idArg")
    fun obtenerCancer2(idArg : Int) : LiveData<List<Cancer2>>

    @Insert
    fun insertarCancer2(cancer2: Cancer2)

    @Update
    fun actualizarCancer2(cancer2: Cancer2)

    @Delete
    fun eliminarCancer2(cancer2: Cancer2)
}