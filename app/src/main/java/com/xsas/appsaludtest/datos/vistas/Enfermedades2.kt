package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "Enfermedades2")
data class Enfermedades2(

    @NonNull
    @ColumnInfo(name = "padeceHipertension", typeAffinity = ColumnInfo.BINARY)
    var padeceHipertension: Boolean = false,

    @NonNull
    @ColumnInfo(name = "controlaHipertension", typeAffinity = ColumnInfo.BINARY)
    var controlaHipertension: Boolean = false,

    @NonNull
    @ColumnInfo(name = "fechaVisita", typeAffinity = TEXT)
    var fechaVisitaHipertension: String = "",

    @NonNull
    @ColumnInfo(name = "padeceDislipidemia", typeAffinity = ColumnInfo.BINARY)
    var padeceDislipidemia: Boolean = false,

    @NonNull
    @ColumnInfo(name = "controlaDislipidemia", typeAffinity = ColumnInfo.BINARY)
    var controlaDislipidemia: Boolean = false,

    @NonNull
    @ColumnInfo(name = "fechaVisitaDislipidemia", typeAffinity = TEXT)
    var fechaVisitaDislipidemia: String = ""

)