package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.ColumnInfo.BINARY
import androidx.room.Entity

@Entity(tableName = "Cancer1")
data class Cancer1(
    @NonNull
    @ColumnInfo(name = "realizadoExploracionMamaria", typeAffinity = BINARY)
    var realizadoExploracionMamaria: Boolean = false,

    @NonNull
    @ColumnInfo(name = "fechaExploracionMamaria", typeAffinity = TEXT)
    var fechaExploracionMamaria: String = "",

    @NonNull
    @ColumnInfo(name = "realizadoMastografia", typeAffinity = BINARY)
    var realizadoMastografia: Boolean = false,

    @NonNull
    @ColumnInfo(name = "fechaMastografia", typeAffinity = TEXT)
    var fechaMastografia: String = ""

)