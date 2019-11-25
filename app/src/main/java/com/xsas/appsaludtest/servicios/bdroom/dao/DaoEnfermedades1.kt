package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.Enfermedades1

@Dao
interface DaoEnfermedades1 {
    @Query("SELECT * FROM Enfermedades1")
    fun obtenerTodosEnfermedades1(): LiveData<List<Enfermedades1>>

    @Query("SELECT * FROM Enfermedades1 WHERE id = :idArg")
    fun obtenerEnfermedades1(idArg : Int) : LiveData<List<Enfermedades1>>

    @Insert
    fun insertarEnfermedades1(enfermedades1: Enfermedades1)

    @Update
    fun actualizarEnfermedades1(enfermedades1: Enfermedades1)

    @Delete
    fun eliminarEnfermedades1(enfermedades1: Enfermedades1)
}