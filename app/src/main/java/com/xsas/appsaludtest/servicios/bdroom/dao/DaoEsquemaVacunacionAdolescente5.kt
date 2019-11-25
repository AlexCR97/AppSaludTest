package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente5

@Dao
interface DaoEsquemaVacunacionAdolescente5 {
    @Query("SELECT * FROM EsquemaVacunacionAdolescente5")
    fun obtenerTodosEsquemaVacunacionAdolescente5(): LiveData<List<EsquemaVacunacionAdolescente5>>

    @Query("SELECT * FROM EsquemaVacunacionAdolescente5 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionAdolescente5(idArg : Int) : LiveData<List<EsquemaVacunacionAdolescente5>>

    @Insert
    fun insertarEsquemaVacunacionAdolescente5(esquemaVacunacionAdolescente5: EsquemaVacunacionAdolescente5)

    @Update
    fun actualizarEsquemaVacunacionAdolescente5(esquemaVacunacionAdolescente5: EsquemaVacunacionAdolescente5)

    @Delete
    fun eliminarEsquemaVacunacionAdolescente5(esquemaVacunacionAdolescente5: EsquemaVacunacionAdolescente5)
}