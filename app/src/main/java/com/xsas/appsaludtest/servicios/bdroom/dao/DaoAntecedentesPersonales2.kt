package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.AntecedentesPersonales2

@Dao
interface DaoAntecedentesPersonales2 {
    @Query("SELECT * FROM AntecedentesPersonales2")
    fun obtenerTodosAntecedentesPersonales2(): LiveData<List<AntecedentesPersonales2>>

    @Query("SELECT * FROM AntecedentesPersonales2 WHERE id = :idArg")
    fun obtenerAntecedentesPersonales2(idArg : Int) : LiveData<List<AntecedentesPersonales2>>

    @Insert
    fun insertarAntecedentesPersonales2(antecedentesPersonales2: AntecedentesPersonales2)

    @Update
    fun actualizarAntecedentesPersonales2(antecedentesPersonales2: AntecedentesPersonales2)

    @Delete
    fun eliminarAntecedentesPersonales2(antecedentesPersonales2: AntecedentesPersonales2)
}