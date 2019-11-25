package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdultoMujer1

@Dao
interface DaoEsquemaVacunacionAdultoMujer1 {
    @Query("SELECT * FROM EsquemaVacunacionAdultoMujer1")
    fun obtenerTodosEsquemaVacunacionAdultoMujer1(): LiveData<List<EsquemaVacunacionAdultoMujer1>>

    @Query("SELECT * FROM EsquemaVacunacionAdultoMujer1 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionAdultoMujer1(idArg : Int) : LiveData<List<EsquemaVacunacionAdultoMujer1>>

    @Insert
    fun insertarEsquemaVacunacionAdultoMujer1(esquemaVacunacionAdultoMujer1: EsquemaVacunacionAdultoMujer1)

    @Update
    fun actualizarEsquemaVacunacionAdultoMujer1(esquemaVacunacionAdultoMujer1: EsquemaVacunacionAdultoMujer1)

    @Delete
    fun eliminarEsquemaVacunacionAdultoMujer1(esquemaVacunacionAdultoMujer1: EsquemaVacunacionAdultoMujer1)
}