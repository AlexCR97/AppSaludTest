package com.xsas.appsaludtest.servicios.bdroom.dao


import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.Otros2

@Dao
interface DaoOtros2 {

    @Query("SELECT * FROM otros_2")
    fun obtenerTodosOtros2(): LiveData<List<Otros2>>

    @Query("SELECT * FROM otros_2 WHERE id: idArg")
    fun obtenerOtros2(idArg: Int): LiveData<List<Otros2>>

    @Insert
    fun insertarOtros2(otros2: Otros2)

    @Update
    fun actualizarOtros2(otros2: Otros2)

    @Delete
    fun eliminarOtros2(otros2: Otros2)

}