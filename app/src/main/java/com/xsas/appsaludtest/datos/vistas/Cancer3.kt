package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.ColumnInfo.BINARY
import androidx.room.Entity

@Entity(tableName = "Cancer3")
data class Cancer3(
    @NonNull
    @ColumnInfo(name = "realizadoVPH", typeAffinity = BINARY)
    var realizadoVPH: Boolean = false,

    @NonNull
    @ColumnInfo(name = "fechaVPH", typeAffinity = TEXT)
    var fechaVPH: String = ""

)