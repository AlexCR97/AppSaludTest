package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.BINARY
import androidx.room.Entity

@Entity(tableName = "AntecedentesPersonales7")
data class AntecedentesPersonales7(
    @NonNull
    @ColumnInfo(name = "tomaAcidoFolico", typeAffinity = BINARY)
    var tomaAcidoFolico: Boolean = false,

    @NonNull
    @ColumnInfo(name = "madreAdolescente", typeAffinity = BINARY)
    var madreAdolescente: Boolean = false,

    @NonNull
    @ColumnInfo(name = "trimestre", typeAffinity = INTEGER)
    var trimestre: Int = 0,

    @NonNull
    @ColumnInfo(name = "realizadoPapanicolaou", typeAffinity = BINARY)
    var realizadoPapanicolaou: Boolean = false,

    @NonNull
    @ColumnInfo(name = "fechaPapanicolaou", typeAffinity = TEXT)
    var fechaPapanicolaou: String = "",

    @NonNull
    @ColumnInfo(name = "realizadoVPH", typeAffinity = BINARY)
    var realizadoVPH: Boolean = false,

    @NonNull
    @ColumnInfo(name = "fechaVPH", typeAffinity = TEXT)
    var fechaVPH: String = ""

)