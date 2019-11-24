package com.xsas.appsaludtest.datos.entidades
import androidx.annotation.IntegerRes
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "enfermedades")
data class Enfermedad (
    @NonNull
    @ColumnInfo(name="id_enfermedades",typeAffinity = INTEGER)
    var idEnfermedades:Integer,

    //tambine es bool
    @NonNull()
    @ColumnInfo(name="baar",typeAffinity = INTEGER)
    var baar:Integer,

    @NonNull
    @ColumnInfo(name="id_datos_generales",typeAffinity = INTEGER)
    var idDatosGeneralea:Integer




){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}