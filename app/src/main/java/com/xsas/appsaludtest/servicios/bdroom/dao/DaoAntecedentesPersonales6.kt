package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.AntecedentesPersonales6

@Dao
interface DaoAntecedentesPersonales6 {
    @Query("SELECT * FROM AntecedentesPersonales6")
    fun obtenerTodosAntecedentesPersonales6(): LiveData<List<AntecedentesPersonales6>>

    @Query("SELECT * FROM AntecedentesPersonales6 WHERE id = :idArg")
    fun obtenerAntecedentesPersonales6(idArg : Int) : LiveData<List<AntecedentesPersonales6>>

    @Insert
    fun insertarAntecedentesPersonales6(antecedentesPersonales6: AntecedentesPersonales6)

    @Update
    fun actualizarAntecedentesPersonales6(antecedentesPersonales6: AntecedentesPersonales6)

    @Delete
    fun eliminarAntecedentesPersonales6(antecedentesPersonales6: AntecedentesPersonales6)
}