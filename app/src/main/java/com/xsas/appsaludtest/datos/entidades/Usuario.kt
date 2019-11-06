package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo

import androidx.room.ColumnInfo.TEXT
import androidx.room.PrimaryKey

import androidx.room.Entity

@Entity(tableName="usuarios")
data class Usuario(
    @NonNull
    @ColumnInfo(name= "nombre_usuario",typeAffinity= TEXT)
    var nombreUsuario: String,

    @NonNull
    @ColumnInfo(name= "correo",typeAffinity = TEXT)
    var correo: String,

    @NonNull
    @ColumnInfo(name = "contrasenia", typeAffinity = TEXT)
    var contrasena: String
)
{
    @PrimaryKey(autoGenerate = true)
    var id: Int?=0
}

