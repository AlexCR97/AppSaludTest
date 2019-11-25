package com.xsas.appsaludtest.datos.entidades
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.ColumnInfo.INTEGER
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "datos_basicos")

data class DatoBasico(
    @NonNull
    @ColumnInfo(name="id_datos_basicos",typeAffinity = INTEGER)
    var idDatosBasicos:Integer,

    @NonNull
    @ColumnInfo(name="apellido_paterno",typeAffinity = TEXT)
    var apellidoPaterno:String,

    @NonNull
    @ColumnInfo(name="apellido_materno",typeAffinity = TEXT)
    var apellidoMaterno:String,

    @NonNull
    @ColumnInfo(name="nombres",typeAffinity = TEXT)
    var nombres:String,

    @NonNull
    @ColumnInfo(name = "fecha_nacimiento",typeAffinity = TEXT)
    var fechaNacimiento:String,

    @NonNull
    @ColumnInfo(name="sexo",typeAffinity = INTEGER)
    var sexo:Integer,

    @NonNull
    @ColumnInfo(name="curp",typeAffinity = TEXT)
    var Curp:String,

    @NonNull
    @ColumnInfo(name="edad",typeAffinity = INTEGER)
    var edad:Integer
)

{
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}