package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.BINARY
import androidx.room.Entity

@Entity(tableName = "AntecedentesPersonales2")
data class AntecedentesPersonales2(
    @NonNull
    @ColumnInfo(name = "consumeCarne", typeAffinity = BINARY)
    var consumeCarne: Boolean = false,

    @NonNull
    @ColumnInfo(name = "cuantasVecesAlDiaConsumeCarne", typeAffinity = INTEGER )
    var cuantasVecesAlDiaConsumeCarne: Int = 0,

    @NonNull
    @ColumnInfo(name = "cuantasVecesAlSemanaConsumeCarne", typeAffinity = INTEGER )
    var cuantasVecesAlSemanaConsumeCarne: Int = 0,

    @NonNull
    @ColumnInfo(name = "consumeVerduras", typeAffinity = BINARY)
    var consumeVerduras: Boolean = false,

    @NonNull
    @ColumnInfo(name = "cuantasVecesAlDiaConsumeVerduras", typeAffinity = INTEGER )
    var cuantasVecesAlDiaConsumeVerduras: Int = 0,

    @NonNull
    @ColumnInfo(name = "cuantasVecesAlSemanaConsumeVerduras", typeAffinity = INTEGER )
    var cuantasVecesAlSemanaConsumeVerduras: Int = 0,

    @NonNull
    @ColumnInfo(name = "consumeFrutas", typeAffinity = BINARY)
    var consumeFrutas: Boolean = false,

    @NonNull
    @ColumnInfo(name = "cuantasVecesAlDiaConsumeFrutas", typeAffinity = INTEGER )
    var cuantasVecesAlDiaConsumeFrutas: Int = 0,

    @NonNull
    @ColumnInfo(name = "cuantasVecesAlSemanaConsumeFrutas", typeAffinity = INTEGER )
    var cuantasVecesAlSemanaConsumeFrutas: Int = 0

)