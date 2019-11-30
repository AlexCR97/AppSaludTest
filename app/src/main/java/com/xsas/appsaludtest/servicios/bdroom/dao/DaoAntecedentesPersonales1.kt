package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.AntecedentesPersonales1

@Dao
interface DaoAntecedentesPersonales1 {
    @Query("SELECT * FROM AntecedentesPersonales1")
    fun obtenerTodosAntecedentesPersonales1(): LiveData<List<AntecedentesPersonales1>>

    @Query("SELECT * FROM AntecedentesPersonales1 WHERE id = :idArg")
    fun obtenerAntecedentesPersonales1(idArg : Int) : LiveData<List<AntecedentesPersonales1>>

    @Insert
    fun insertarAntecedentesPersonales1(antecedentesPersonales1: AntecedentesPersonales1)

    @Update
    fun actualizarAntecedentesPersonales1(antecedentesPersonales1: AntecedentesPersonales1)

    @Delete
    fun eliminarAntecedentesPersonales1(antecedentesPersonales1: AntecedentesPersonales1)
}