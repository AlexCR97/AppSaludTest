package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.BINARY
import androidx.room.Entity

@Entity(tableName = "Otros2")
data class Otros2(
    @NonNull
    @ColumnInfo(name = "tabaquismo", typeAffinity = BINARY)
    var tabaquismo: Boolean = false,

    @NonNull
    @ColumnInfo(name = "alcoholismo", typeAffinity = BINARY)
    var alcoholismo: Boolean = false,

    @NonNull
    @ColumnInfo(name = "drogadiccion", typeAffinity = BINARY)
    var drogadiccion: Boolean = false,

    @NonNull
    @ColumnInfo(name = "visual", typeAffinity = BINARY)
    var visual: Boolean = false,

    @NonNull
    @ColumnInfo(name = "auditiva", typeAffinity = BINARY)
    var auditiva: Boolean = false,

    @NonNull
    @ColumnInfo(name = "motriz", typeAffinity = BINARY)
    var motriz: Boolean = false,

    @NonNull
    @ColumnInfo(name = "lenguaje", typeAffinity = BINARY)
    var lenguaje: Boolean = false,

    @NonNull
    @ColumnInfo(name = "sensorial", typeAffinity = BINARY)
    var sensorial: Boolean = false
) : VistaEncuesta()