package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.AntecedentesPersonales4

@Dao
interface DaoAntecedentesPersonales4 {
    @Query("SELECT * FROM AntecedentesPersonales4")
    fun obtenerTodosAntecedentesPersonales4(): LiveData<List<AntecedentesPersonales4>>

    @Query("SELECT * FROM AntecedentesPersonales4 WHERE id = :idArg")
    fun obtenerAntecedentesPersonales4(idArg : Int) : LiveData<List<AntecedentesPersonales4>>

    @Insert
    fun insertarAntecedentesPersonales4(antecedentesPersonales4: AntecedentesPersonales4)

    @Update
    fun actualizarAntecedentesPersonales4(antecedentesPersonales4: AntecedentesPersonales4)

    @Delete
    fun eliminarAntecedentesPersonales4(antecedentesPersonales4: AntecedentesPersonales4)
}