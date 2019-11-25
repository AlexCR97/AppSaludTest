package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.SinNombre2

@Dao
interface DaoSinNombre2 {
    @Query("SELECT * FROM SinNombre2")
    fun obtenerTodosSinNombre2(): LiveData<List<SinNombre2>>

    @Query("SELECT * FROM SinNombre2 WHERE id = :idArg")
    fun obtenerSinNombre2(idArg : Int) : LiveData<List<SinNombre2>>

    @Insert
    fun insertarSinNombre2(sinNombre2: SinNombre2)

    @Update
    fun actualizarSinNombre2(sinNombre2: SinNombre2)

    @Delete
    fun eliminarSinNombre2(sinNombre2: SinNombre2)
}