package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente2

@Dao
interface DaoEsquemaVacunacionAdolescente2 {
    @Query("SELECT * FROM EsquemaVacunacionAdolescente2")
    fun obtenerTodosEsquemaVacunacionAdolescente2(): LiveData<List<EsquemaVacunacionAdolescente2>>

    @Query("SELECT * FROM EsquemaVacunacionAdolescente2 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionAdolescente2(idArg : Int) : LiveData<List<EsquemaVacunacionAdolescente2>>

    @Insert
    fun insertarEsquemaVacunacionAdolescente2(esquemaVacunacionAdolescente2: EsquemaVacunacionAdolescente2)

    @Update
    fun actualizarEsquemaVacunacionAdolescente2(esquemaVacunacionAdolescente2: EsquemaVacunacionAdolescente2)

    @Delete
    fun eliminarEsquemaVacunacionAdolescente2(esquemaVacunacionAdolescente2: EsquemaVacunacionAdolescente2)
}