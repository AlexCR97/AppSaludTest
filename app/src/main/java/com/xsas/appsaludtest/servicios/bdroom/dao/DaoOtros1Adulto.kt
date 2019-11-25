package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.Otros1Adulto

@Dao
interface DaoOtros1Adulto {
    @Query("SELECT * FROM Otros1Adulto")
    fun obtenerTodosOtros1Adulto(): LiveData<List<Otros1Adulto>>

    @Query("SELECT * FROM Otros1Adulto WHERE id = :idArg")
    fun obtenerOtros1Adulto(idArg : Int) : LiveData<List<Otros1Adulto>>

    @Insert
    fun insertarOtros1Adulto(otros1Adulto: Otros1Adulto)

    @Update
    fun actualizarOtros1Adulto(otros1Adulto: Otros1Adulto)

    @Delete
    fun eliminarOtros1Adulto(otros1Adulto: Otros1Adulto)
}