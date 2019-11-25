package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "estados_civiles")
data class EstadoCivil (
    @NonNull
    @ColumnInfo(name="id_estado_civil",typeAffinity = INTEGER)
    var idEstadoCivil:Integer,

    @NonNull
    @ColumnInfo(name="estado_civil",typeAffinity = TEXT)
    var estadoCivil: String
)


{
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}