package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente6

@Dao
interface DaoEsquemaVacunacionAdolescente6 {
    @Query("SELECT * FROM EsquemaVacunacionAdolescente6")
    fun obtenerTodosEsquemaVacunacionAdolescente6(): LiveData<List<EsquemaVacunacionAdolescente6>>

    @Query("SELECT * FROM EsquemaVacunacionAdolescente6 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionAdolescente6(idArg : Int) : LiveData<List<EsquemaVacunacionAdolescente6>>

    @Insert
    fun insertarEsquemaVacunacionAdolescente6(esquemaVacunacionAdolescente6: EsquemaVacunacionAdolescente6)

    @Update
    fun actualizarEsquemaVacunacionAdolescente6(esquemaVacunacionAdolescente6: EsquemaVacunacionAdolescente6)

    @Delete
    fun eliminarEsquemaVacunacionAdolescente6(esquemaVacunacionAdolescente6: EsquemaVacunacionAdolescente6)
}