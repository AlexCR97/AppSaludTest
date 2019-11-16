package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.DatosPersonales

@Dao
interface DaoDatosPersonales {

    @Query("SELECT * FROM datos_Personales")
    fun obtenerTodosDatosPersonales(): LiveData<List<DatosPersonales>>

    @Query("SELECT * FROM datos_Personales WHERE id: idArg")
    fun obtenerDatosPersonales(idArg: Int): LiveData<List<DatosPersonales>>

    @Insert
    fun insertarDatosPersonales(datosPersonales: DatosPersonales)

    @Update
    fun actualizarDatosPersonales(datosPersonales: DatosPersonales)

    @Delete
    fun eliminarDatosPersonales(datosPersonales: DatosPersonales)
}