package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.ColumnInfo.BINARY
import androidx.room.Entity

@Entity(tableName = "SinNombre2")
data class SinNombre2(
    @NonNull
    @ColumnInfo(name = "padresVivos", typeAffinity = BINARY)
    var padresVivos: Boolean = false,

    @NonNull
    @ColumnInfo(name = "causasDeFallecimiento", typeAffinity = TEXT)
    var causasDeFallecimiento: String = ""
)