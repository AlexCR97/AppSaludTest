package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente1

@Dao
interface DaoEsquemaVacunacionAdolescente1 {
    @Query("SELECT * FROM EsquemaVacunacionAdolescente1")
    fun obtenerTodosEsquemaVacunacionAdolescente1(): LiveData<List<EsquemaVacunacionAdolescente1>>

    @Query("SELECT * FROM EsquemaVacunacionAdolescente1 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionAdolescente1(idArg : Int) : LiveData<List<EsquemaVacunacionAdolescente1>>

    @Insert
    fun insertarEsquemaVacunacionAdolescente1(esquemaVacunacionAdolescente1: EsquemaVacunacionAdolescente1)

    @Update
    fun actualizarEsquemaVacunacionAdolescente1(esquemaVacunacionAdolescente1: EsquemaVacunacionAdolescente1)

    @Delete
    fun eliminarEsquemaVacunacionAdolescente1(esquemaVacunacionAdolescente1: EsquemaVacunacionAdolescente1)
}