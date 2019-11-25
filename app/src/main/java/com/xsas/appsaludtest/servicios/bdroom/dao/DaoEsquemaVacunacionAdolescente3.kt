package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente3

@Dao
interface DaoEsquemaVacunacionAdolescente3 {
    @Query("SELECT * FROM EsquemaVacunacionAdolescente3")
    fun obtenerTodosEsquemaVacunacionAdolescente3(): LiveData<List<EsquemaVacunacionAdolescente3>>

    @Query("SELECT * FROM EsquemaVacunacionAdolescente3 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionAdolescente3(idArg : Int) : LiveData<List<EsquemaVacunacionAdolescente3>>

    @Insert
    fun insertarEsquemaVacunacionAdolescente3(esquemaVacunacionAdolescente3: EsquemaVacunacionAdolescente3)

    @Update
    fun actualizarEsquemaVacunacionAdolescente3(esquemaVacunacionAdolescente3: EsquemaVacunacionAdolescente3)

    @Delete
    fun eliminarEsquemaVacunacionAdolescente3(esquemaVacunacionAdolescente3: EsquemaVacunacionAdolescente3)
}