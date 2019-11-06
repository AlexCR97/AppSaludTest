package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo

import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.math.BigInteger
import java.util.*

@Entity(tableName = "dislipidemia")
data class Dislipidemia(
    @NonNull
    @ColumnInfo(name = "en_control",typeAffinity = TEXT)
    var en_Control: BitSet,

    @NonNull
    @ColumnInfo(name="fecha_ultima_visita",typeAffinity = TEXT)
    var fecha_Ultima_Visita:Date,

    @NonNull
    @ColumnInfo(name="id_enfermedades",typeAffinity = TEXT)
    var id_Enfermedades:BigInteger
)
{
    @PrimaryKey(autoGenerate = true)
    var id: Int?=0
}