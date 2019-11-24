package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.ColumnInfo.INTEGER
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="grado_estudios")
data class GradoEstudio (
    @NonNull
    @ColumnInfo(name="id_grado_estudio",typeAffinity = INTEGER)
    var idGradoEstudio:Integer,

    @NonNull
    @ColumnInfo(name="grado_estudio",typeAffinity = TEXT)
    var gradoEstudio: String

)
{
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}