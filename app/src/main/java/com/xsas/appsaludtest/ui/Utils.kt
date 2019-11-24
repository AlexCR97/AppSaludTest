package com.xsas.appsaludtest.ui

import android.app.DatePickerDialog
import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.core.view.children
import java.util.*

fun abrirDialogoFecha(context: Context, onDateSetListener: DatePickerDialog.OnDateSetListener) {

    val calendario = Calendar.getInstance()
    val anio = calendario.get(Calendar.YEAR)
    val mes = calendario.get(Calendar.MONTH)
    val dia = calendario.get(Calendar.DAY_OF_MONTH)

    val dpd = DatePickerDialog(context, onDateSetListener, anio, mes, dia)

    dpd.show()
}

fun cambiarHabilitado(view: ViewGroup) {
    view.children.forEach {

        if (it is ViewGroup)
            cambiarHabilitado(it)

        it.isEnabled = !it.isEnabled
    }
}

inline fun <reified T> listToArray(list: List<T>): Array<T> {
    return list.toTypedArray()
}

fun edadPorFecha(fechaNacimiento: String): Int {

    val tokens: List<String> = fechaNacimiento.split('-')
    val anioNacimiento = tokens[0].toInt()
    val diaNacimiento = tokens[1].toInt()
    val mesNacimiento = tokens[2].toInt()

    val dateNacimiento = Calendar.getInstance()
    dateNacimiento.set(anioNacimiento, mesNacimiento, diaNacimiento)

    val dateHoy = Calendar.getInstance()

    if (dateNacimiento.after(dateHoy))
        return -1

    val anioHoy = dateHoy.get(Calendar.YEAR)
    val diaHoy = dateHoy.get(Calendar.DAY_OF_MONTH)
    val mesHoy = dateHoy.get(Calendar.MONTH)

    var edad = anioHoy - anioNacimiento

    if (diaNacimiento - diaHoy > 3 || mesNacimiento > mesHoy)
        edad--

    else if (mesNacimiento == mesHoy && diaNacimiento == diaHoy)
        edad--

    return edad
}
