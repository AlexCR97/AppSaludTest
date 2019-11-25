package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.ColumnInfo.INTEGER
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.math.BigInteger

@Entity(tableName ="escolaridades_ocupaciones")
data class EscolaridadOcupacion(
    @NonNull
    @ColumnInfo(name="id_escolaridad_ocupacion",typeAffinity = INTEGER)
    var idEscolaridadOcupacion: BigInteger,

    @NonNull
    @ColumnInfo(name="escolaridad_ocupacion",typeAffinity = TEXT)
    var escolaridadOcupacion:String
)
{
@PrimaryKey(autoGenerate = true)
var id:Int?=0
}