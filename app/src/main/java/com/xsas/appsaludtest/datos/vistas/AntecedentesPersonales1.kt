package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.BINARY
import androidx.room.Entity

@Entity(tableName = "AntecedentesPersonales1")
data class AntecedentesPersonales1(
    @NonNull
    @ColumnInfo(name = "consumeAlcohol", typeAffinity = BINARY)
    var consumeAlcohol: Boolean = false,

    @NonNull
    @ColumnInfo(name = "cuantasVecesConsumeAlcohol", typeAffinity = INTEGER)
    var cuantasVecesConsumeAlcohol:  Int = 0,

    @NonNull
    @ColumnInfo(name = "consumeTabaco", typeAffinity = BINARY)
    var consumeTabaco: Boolean = false,

    @NonNull
    @ColumnInfo(name = "cuantasVecesConsumeTabaco", typeAffinity = INTEGER)
    var cuantasVecesConsumeTabaco: Int = 0,

    @NonNull
    @ColumnInfo(name = "consumeDrogas", typeAffinity = BINARY)
    var consumeDrogas: Boolean = false ,

    @NonNull
    @ColumnInfo(name = "cuantasVecesConsumeDrogas", typeAffinity = INTEGER)
    var cuantasVecesConsumeDrogas: Int = 0 ,

    @NonNull
    @ColumnInfo(name = "realizaInfusiones", typeAffinity = BINARY)
    var realizaInfusiones: Boolean = false,

    @NonNull
    @ColumnInfo(name = "cuantasVecesRealizaInfusiones", typeAffinity = INTEGER)
    var cuantasVecesRealizaInfusiones: Int = 0

)