package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdultoMujer2

@Dao
interface DaoEsquemaVacunacionAdultoMujer2 {
    @Query("SELECT * FROM EsquemaVacunacionAdultoMujer2")
    fun obtenerTodosEsquemaVacunacionAdultoMujer2(): LiveData<List<EsquemaVacunacionAdultoMujer2>>

    @Query("SELECT * FROM EsquemaVacunacionAdultoMujer2 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionAdultoMujer2(idArg : Int) : LiveData<List<EsquemaVacunacionAdultoMujer2>>

    @Insert
    fun insertarEsquemaVacunacionAdultoMujer2(esquemaVacunacionAdultoMujer2: EsquemaVacunacionAdultoMujer2)

    @Update
    fun actualizarEsquemaVacunacionAdultoMujer2(esquemaVacunacionAdultoMujer2: EsquemaVacunacionAdultoMujer2)

    @Delete
    fun eliminarEsquemaVacunacionAdultoMujer2(esquemaVacunacionAdultoMujer2: EsquemaVacunacionAdultoMujer2)
}