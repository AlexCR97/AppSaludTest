package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.ColumnInfo.BINARY
import androidx.room.Entity

@Entity(tableName = "Cancer2")
data class Cancer2(
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