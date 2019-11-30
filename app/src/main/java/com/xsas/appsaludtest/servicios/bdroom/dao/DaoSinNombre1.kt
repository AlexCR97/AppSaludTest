package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.SinNombre1

@Dao
interface DaoSinNombre1 {
    @Query("SELECT * FROM SinNombre1")
    fun obtenerTodosSinNombre1(): LiveData<List<SinNombre1>>

    @Query("SELECT * FROM SinNombre1 WHERE id = :idArg")
    fun obtenerSinNombre1(idArg : Int) : LiveData<List<SinNombre1>>

    @Insert
    fun insertarSinNombre1(sinNombre1: SinNombre1)

    @Update
    fun actualizarSinNombre1(sinNombre1: SinNombre1)

    @Delete
    fun eliminarSinNombre1(sinNombre1: SinNombre1)
}