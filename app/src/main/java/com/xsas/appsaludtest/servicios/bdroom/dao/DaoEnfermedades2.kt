package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.Enfermedades2

@Dao
interface DaoEnfermedades2 {
    @Query("SELECT * FROM Enfermedades2")
    fun obtenerTodosEnfermedades2(): LiveData<List<Enfermedades2>>

    @Query("SELECT * FROM Enfermedades2 WHERE id = :idArg")
    fun obtenerEnfermedades2(idArg : Int) : LiveData<List<Enfermedades2>>

    @Insert
    fun insertarEnfermedades2(enfermedades2: Enfermedades2)

    @Update
    fun actualizarEnfermedades2(enfermedades2: Enfermedades2)

    @Delete
    fun eliminarEnfermedades2(enfermedades2: Enfermedades2)
}