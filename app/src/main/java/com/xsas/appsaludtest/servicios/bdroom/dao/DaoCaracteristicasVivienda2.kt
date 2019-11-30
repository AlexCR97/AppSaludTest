package com.xsas.appsaludtest.servicios.bdroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.xsas.appsaludtest.datos.vistas.CaracteristicasVivienda2

@Dao
interface DaoCaracteristicasVivienda2 {
    @Query("SELECT * FROM CaracteristicasVivienda2")
    fun obtenerTodosCaracteristicasVivienda2(): LiveData<List<CaracteristicasVivienda2>>

    @Query("SELECT * FROM CaracteristicasVivienda2 WHERE id = :idArg")
    fun obtenerCaracteristicasVivienda2(idArg : Int) : LiveData<List<CaracteristicasVivienda2>>

    @Insert
    fun insertarCaracteristicasVivienda2(caracteristicasVivienda2: CaracteristicasVivienda2)

    @Update
    fun actualizarCaracteristicasVivienda2(caracteristicasVivienda2: CaracteristicasVivienda2)

    @Delete
    fun eliminarCaracteristicasVivienda2(caracteristicasVivienda2: CaracteristicasVivienda2)
}