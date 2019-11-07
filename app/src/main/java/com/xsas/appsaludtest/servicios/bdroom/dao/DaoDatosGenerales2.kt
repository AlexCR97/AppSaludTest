package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.DatosGenerales2

@Dao
interface DaoDatosGenerales2 {

    @Query("SELECT * FROM datos_Generales_2")
    fun obtenerTodosDatosGenerales2(): LiveData<List<DatosGenerales2>>

    @Query("SELECT * FROM datos_Generales_2 WHERE id: idArg")
    fun obtenerDatosGenerales2(idArg: Int): LiveData<List<DatosGenerales2>>

    @Insert
    fun insertarDatosGenerales2(datosGenerales2: DatosGenerales2)

    @Update
    fun actualizarDatosGenerales2(datosGenerales2: DatosGenerales2)

    @Delete
    fun eliminarDatosGenerales2(datosGenerales2: DatosGenerales2)

}