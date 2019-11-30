package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdultoMujer3

@Dao
interface DaoEsquemaVacunacionAdultoMujer3 {
    @Query("SELECT * FROM EsquemaVacunacionAdultoMujer3")
    fun obtenerTodosEsquemaVacunacionAdultoMujer3(): LiveData<List<EsquemaVacunacionAdultoMujer3>>

    @Query("SELECT * FROM EsquemaVacunacionAdultoMujer3 WHERE id = :idArg")
    fun obtenerEsquemaVacunacionAdultoMujer3(idArg : Int) : LiveData<List<EsquemaVacunacionAdultoMujer3>>

    @Insert
    fun insertarEsquemaVacunacionAdultoMujer3(esquemaVacunacionAdultoMujer3: EsquemaVacunacionAdultoMujer3)

    @Update
    fun actualizarEsquemaVacunacionAdultoMujer3(esquemaVacunacionAdultoMujer3: EsquemaVacunacionAdultoMujer3)

    @Delete
    fun eliminarEsquemaVacunacionAdultoMujer3(esquemaVacunacionAdultoMujer3: EsquemaVacunacionAdultoMujer3)
}