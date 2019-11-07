package com.xsas.appsaludtest.servicios.bdroom.dao
import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.DatosGenerales1

@Dao
interface DaoDatosGenerales1 {

    @Query("SELECT * FROM datos_Generales_1")
    fun obtenerTodosDatosGenerales1() : LiveData<List<DatosGenerales1>>

    @Query("SELECT * FROM datos_Generales_1 WHERE id = :idArg")
    fun obtenerDatosGenerales1(idArg : Int) : LiveData<List<DatosGenerales1>>

    @Insert
    fun insertarDatosGenerales(datosGenerales1: DatosGenerales1)

    @Update
    fun actualizarDatosGenerales(datosGenerales1: DatosGenerales1)

    @Delete
    fun eliminarDatosGenerales(datosGenerales1: DatosGenerales1)

}