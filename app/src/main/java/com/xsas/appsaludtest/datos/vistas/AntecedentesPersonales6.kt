package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.BINARY
import androidx.room.Entity

@Entity(tableName = "AntecedentesPersonales6")
data class AntecedentesPersonales6(
    @NonNull
    @ColumnInfo(name = "numeroGestas", typeAffinity = INTEGER)
    var numeroGesta: Int = 0,

    @NonNull
    @ColumnInfo(name = "numeroPartos", typeAffinity = INTEGER)
    var numeroParto: Int = 0,

    @NonNull
    @ColumnInfo(name = "numeroCesareas", typeAffinity = INTEGER)
    var numeroCesarea: Int = 0,

    @NonNull
    @ColumnInfo(name = "numeroAbortos", typeAffinity = INTEGER)
    var numeroAborto: Int = 0,

    @NonNull
    @ColumnInfo(name = "usaAnticonceptivo", typeAffinity = BINARY)
    var usaAnticonceptivo: Boolean = false,

    @NonNull
    @ColumnInfo(name = "nombreAnticonceptivo", typeAffinity = TEXT)
    var nombreAnticonceptivo: String = "",

    @NonNull
    @ColumnInfo(name = "ultimaToma", typeAffinity = INTEGER)
    var ultimaToma: Int = 0,

    @NonNull
    @ColumnInfo(name = "otros", typeAffinity = TEXT)
    var otros: String = ""
)