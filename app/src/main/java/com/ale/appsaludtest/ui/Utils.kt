package com.ale.appsaludtest.ui

import android.app.DatePickerDialog
import android.content.Context
import java.util.*

fun abrirDialogoFecha(context: Context, onDateSetListener: DatePickerDialog.OnDateSetListener) {

    val calendario = Calendar.getInstance()
    val anio = calendario.get(Calendar.YEAR)
    val mes = calendario.get(Calendar.MONTH)
    val dia = calendario.get(Calendar.DAY_OF_MONTH)

    val dpd = DatePickerDialog(context, onDateSetListener, anio, mes, dia)

    dpd.show()
}
