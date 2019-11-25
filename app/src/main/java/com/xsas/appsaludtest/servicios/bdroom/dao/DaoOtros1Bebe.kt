package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.Otros1Bebe

@Dao
interface DaoOtros1Bebe {
    @Query("SELECT * FROM Otros1Bebe")
    fun obtenerTodosOtros1Bebe(): LiveData<List<Otros1Bebe>>

    @Query("SELECT * FROM Otros1Bebe WHERE id = :idArg")
    fun obtenerOtros1Bebe(idArg : Int) : LiveData<List<Otros1Bebe>>

    @Insert
    fun insertarOtros1Bebe(otros1Bebe: Otros1Bebe)

    @Update
    fun actualizarOtros1Bebe(otros1Bebe: Otros1Bebe)

    @Delete
    fun eliminarOtros1Bebe(otros1Bebe: Otros1Bebe)
}