package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.AntecedentesPersonales3

@Dao
interface DaoAntecedentesPersonales3 {
    @Query("SELECT * FROM AntecedentesPersonales3")
    fun obtenerTodosAntecedentesPersonales3(): LiveData<List<AntecedentesPersonales3>>

    @Query("SELECT * FROM AntecedentesPersonales3 WHERE id = :idArg")
    fun obtenerAntecedentesPersonales3(idArg : Int) : LiveData<List<AntecedentesPersonales3>>

    @Insert
    fun insertarAntecedentesPersonales3(antecedentesPersonales3: AntecedentesPersonales3)

    @Update
    fun actualizarAntecedentesPersonales3(antecedentesPersonales3: AntecedentesPersonales3)

    @Delete
    fun eliminarAntecedentesPersonales3(antecedentesPersonales3: AntecedentesPersonales3)
}