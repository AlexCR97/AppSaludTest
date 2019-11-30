package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

data class EsquemaVacunacionNino5(
    @NonNull
    @ColumnInfo(name = "rotaVirusFechaPrimera", typeAffinity = TEXT)
    var rotaVirusFechaPrimera: String = "",
  
    @NonNull
    @ColumnInfo(name = "rotaVirusFechaSegunda", typeAffinity = TEXT)
    var rotaVirusFechaSegunda: String = "",
    
    @NonNull
    @ColumnInfo(name = "rotaVirusFechaTercera", typeAffinity = TEXT)
    var rotaVirusFechaTercera: String = ""
) 