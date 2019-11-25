package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdultoHombre3

@Dao
interface DaoEsquemaVacunacionAdultoHombre3 {
    @Query("SELECT * FROM EsquemaVacunacionAdultoHombre3")
    fun obtenerTodosEsquemaVacunacionAdultoHombre3(): LiveData<List<EsquemaVacunacionAdultoHombre3>>

    @Query("SELECT * FROM EsquemaVacunacionAdultoHombre3 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionAdultoHombre3(idArg : Int) : LiveData<List<EsquemaVacunacionAdultoHombre3>>

    @Insert
    fun insertarEsquemaVacunacionAdultoHombre3(esquemaVacunacionAdultoHombre3: EsquemaVacunacionAdultoHombre3)

    @Update
    fun actualizarEsquemaVacunacionAdultoHombre3(esquemaVacunacionAdultoHombre3: EsquemaVacunacionAdultoHombre3)

    @Delete
    fun eliminarEsquemaVacunacionAdultoHombre3(esquemaVacunacionAdultoHombre3: EsquemaVacunacionAdultoHombre3)
}