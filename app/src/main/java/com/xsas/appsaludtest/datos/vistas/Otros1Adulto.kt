package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.BINARY
import androidx.room.Entity

@Entity(tableName = "Otros1Adulto")
data class Otros1Adulto(
    @NonNull
    @ColumnInfo(name = "abandonado", typeAffinity = BINARY)
    var abandonado: Boolean = false
) : Otros1()
