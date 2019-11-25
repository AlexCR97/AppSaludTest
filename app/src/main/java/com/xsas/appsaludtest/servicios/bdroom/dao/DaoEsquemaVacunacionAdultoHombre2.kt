package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdultoHombre2

@Dao
interface DaoEsquemaVacunacionAdultoHombre2 {
    @Query("SELECT * FROM EsquemaVacunacionAdultoHombre2")
    fun obtenerTodosEsquemaVacunacionAdultoHombre2(): LiveData<List<EsquemaVacunacionAdultoHombre2>>

    @Query("SELECT * FROM EsquemaVacunacionAdultoHombre2 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionAdultoHombre2(idArg : Int) : LiveData<List<EsquemaVacunacionAdultoHombre2>>

    @Insert
    fun insertarEsquemaVacunacionAdultoHombre2(esquemaVacunacionAdultoHombre2: EsquemaVacunacionAdultoHombre2)

    @Update
    fun actualizarEsquemaVacunacionAdultoHombre2(esquemaVacunacionAdultoHombre2: EsquemaVacunacionAdultoHombre2)

    @Delete
    fun eliminarEsquemaVacunacionAdultoHombre2(esquemaVacunacionAdultoHombre2: EsquemaVacunacionAdultoHombre2)
}