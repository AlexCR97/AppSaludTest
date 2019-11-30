package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdultoMujer4

@Dao
interface DaoEsquemaVacunacionAdultoMujer4 {
    @Query("SELECT * FROM EsquemaVacunacionAdultoMujer4")
    fun obtenerTodosEsquemaVacunacionAdultoMujer4(): LiveData<List<EsquemaVacunacionAdultoMujer4>>

    @Query("SELECT * FROM EsquemaVacunacionAdultoMujer4 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionAdultoMujer4(idArg : Int) : LiveData<List<EsquemaVacunacionAdultoMujer4>>

    @Insert
    fun insertarEsquemaVacunacionAdultoMujer4(esquemaVacunacionAdultoMujer4: EsquemaVacunacionAdultoMujer4)

    @Update
    fun actualizarEsquemaVacunacionAdultoMujer4(esquemaVacunacionAdultoMujer4: EsquemaVacunacionAdultoMujer4)

    @Delete
    fun eliminarEsquemaVacunacionAdultoMujer4(esquemaVacunacionAdultoMujer4: EsquemaVacunacionAdultoMujer4)
}