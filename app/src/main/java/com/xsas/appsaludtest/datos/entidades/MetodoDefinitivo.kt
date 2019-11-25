package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "metodos_definitivos")
data class MetodoDefinitivo (
    @NonNull
    @ColumnInfo(name="id_metodo_definitivo",typeAffinity = ColumnInfo.INTEGER)
    var idMetodoDefinitivo:Integer,

    @NonNull
    @ColumnInfo(name="metodo_definitivo",typeAffinity = ColumnInfo.TEXT)
    var metodoDefinitivo: String


){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}