package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "Enfermedades1")
data class Enfermedades1(
    @NonNull
    @ColumnInfo(name = "enfermedad", typeAffinity = ColumnInfo.TEXT)
    var enfermedad: String = "",

    @NonNull
    @ColumnInfo(name = "otraenfermedad", typeAffinity = ColumnInfo.TEXT)
    var otraenfermedad: String = "",

    @NonNull
    @ColumnInfo(name = "padeceDiabetes", typeAffinity = ColumnInfo.BINARY)
    var padeceDiabetes: Boolean = false,

    @NonNull
    @ColumnInfo(name = "controlaDiabetes", typeAffinity = ColumnInfo.BINARY)
    var controlaDiabetes: Boolean = false,

    @NonNull
    @ColumnInfo(name = "fechaVisita", typeAffinity = TEXT)
    var fechaVisita: String = ""

)