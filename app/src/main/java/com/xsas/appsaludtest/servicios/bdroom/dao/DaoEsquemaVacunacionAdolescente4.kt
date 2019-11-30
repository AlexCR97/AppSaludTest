package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente4

@Dao
interface DaoEsquemaVacunacionAdolescente4 {
    @Query("SELECT * FROM EsquemaVacunacionAdolescente4")
    fun obtenerTodosEsquemaVacunacionAdolescente4(): LiveData<List<EsquemaVacunacionAdolescente4>>

    @Query("SELECT * FROM EsquemaVacunacionAdolescente4 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionAdolescente4(idArg : Int) : LiveData<List<EsquemaVacunacionAdolescente4>>

    @Insert
    fun insertarEsquemaVacunacionAdolescente4(esquemaVacunacionAdolescente4: EsquemaVacunacionAdolescente4)

    @Update
    fun actualizarEsquemaVacunacionAdolescente4(esquemaVacunacionAdolescente4: EsquemaVacunacionAdolescente4)

    @Delete
    fun eliminarEsquemaVacunacionAdolescente4(esquemaVacunacionAdolescente4: EsquemaVacunacionAdolescente4)
}