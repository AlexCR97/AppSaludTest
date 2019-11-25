package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.AntecedentesPersonales7

@Dao
interface DaoAntecedentesPersonales7 {
    @Query("SELECT * FROM AntecedentesPersonales7")
    fun obtenerTodosAntecedentesPersonales7(): LiveData<List<AntecedentesPersonales7>>

    @Query("SELECT * FROM AntecedentesPersonales7 WHERE id = :idArg")
    fun obtenerAntecedentesPersonales7(idArg : Int) : LiveData<List<AntecedentesPersonales7>>

    @Insert
    fun insertarAntecedentesPersonales7(antecedentesPersonales7: AntecedentesPersonales7)

    @Update
    fun actualizarAntecedentesPersonales7(antecedentesPersonales7: AntecedentesPersonales7)

    @Delete
    fun eliminarAntecedentesPersonales7(antecedentesPersonales7: AntecedentesPersonales7)
}