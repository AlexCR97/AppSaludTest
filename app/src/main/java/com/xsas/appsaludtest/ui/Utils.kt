package com.xsas.appsaludtest.ui

import android.app.DatePickerDialog
import android.content.Context
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.children
import androidx.core.view.setMargins
import androidx.core.view.setPadding
import com.google.android.flexbox.FlexboxLayout
import com.xsas.appsaludtest.R
import java.lang.Exception
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

fun crearBotonTag(context: Context, text: String): Button {
    val layoutParams = FlexboxLayout.LayoutParams(FlexboxLayout.LayoutParams.WRAP_CONTENT, FlexboxLayout.LayoutParams.WRAP_CONTENT)
    layoutParams.setMargins(5)

    val button = Button(context)
    button.layoutParams = layoutParams
    button.text = text
    button.textSize = 12f
    button.setBackgroundResource(R.drawable.boton_verde)
    button.setPadding(10)

    return button
}

inline fun <reified T> listToArray(list: List<T>): Array<T> {
    return list.toTypedArray()
}

fun esFecha(fecha: String): Boolean {
    val tokens = fecha.split('-')
    return try {
        tokens[0].toInt()
        tokens[1].toInt()
        tokens[2].toInt()
        true
    }
    catch (ex: Exception) {
        false
    }
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

fun curp(nombres: String, apellidoPaterno: String, apellidoMaterno: String, fechaNacimiento: String, sexo: String, estado: String) : String {

    fun obtenerCadenaInterna(param: String): String {
        val paramLength = param.length

        return param.substring(IntRange(1, paramLength - 2))
    }

    fun esVocal(c: Char): Boolean {
        val minuscula: Char = c.toLowerCase()
        return minuscula == 'a' || minuscula == 'e' || minuscula == 'i' || minuscula == 'o' || minuscula == 'u'
    }

    fun buscarPrimeraVocal(palabra: String): Char? {
        for (caracter in palabra)
            if (esVocal(caracter))
                return caracter
        return null
    }

    fun buscarPrimeraConsonante(palabra: String): Char? {
        for (caracter in palabra)
            if (!esVocal(caracter))
                return caracter
        return null
    }

    fun obtenerPrimeraParte(nombre: String, apellidoPaterno: String, apellidoMaterno: String): String {
        val sb = StringBuilder()

        val listaNombres: List<String> = nombre.split(" ")
        val longitudApellidoPaterno = apellidoPaterno.length
        val primeraLetraApellidoMaterno = apellidoMaterno[0]
        val primeraLetraApellidoPaterno = apellidoPaterno[0]
        val primerVocal = buscarPrimeraVocal(apellidoPaterno.substring(IntRange(1, longitudApellidoPaterno - 1)))

        sb.append(primeraLetraApellidoPaterno.toUpperCase())
            .append(primerVocal?.toUpperCase())
            .append(primeraLetraApellidoMaterno.toUpperCase())

        if (listaNombres.size == 2) {
            val primerNombre = listaNombres[0]
            val primeraLetra: Char?

            if (primerNombre.equals("MARIA", true) or primerNombre.equals("JOSE", true)) {
                val segundoNombre = listaNombres[1]
                primeraLetra = segundoNombre[0]
                sb.append(primeraLetra.toUpperCase())
            }
            else {
                primeraLetra = primerNombre[0]
                sb.append(primeraLetra.toUpperCase())
            }
        }

        return sb.toString()
    }

    fun obtenerSegundaParte(nacimiento: String): String {
        var res = ""

        var fechaNac = nacimiento.split("-")

        var anio = fechaNac[0].toString().substring(IntRange(2,3))
        var dia = fechaNac[1].toString()
        var mes = fechaNac[2].toString()

        res += anio + mes + dia

        return  res
    }

    fun obtenerTerceraParte(entidadFederativa: String): String {
        return (if (ConsultasGlobales.entidadesFederativas.containsKey(entidadFederativa))
            ConsultasGlobales.entidadesFederativas[entidadFederativa]
        else
            ConsultasGlobales.entidadesFederativas.values.toList()[0])!!
    }

    fun obtenerCuartaParte(nombre: String, apellidoPaterno: String, apellidoMaterno: String): String {
        var sb = StringBuilder()

        val listaNombres = nombre.split(" ")

        val apellidoPaternoInterno = obtenerCadenaInterna(apellidoPaterno)
        val apellidoMaternoInterno = obtenerCadenaInterna(apellidoMaterno)

        val primerConsonanteApellidoPaterno = buscarPrimeraConsonante(apellidoPaternoInterno)
        val primerConsonanteApellidoMaterno = buscarPrimeraConsonante(apellidoMaternoInterno)

        sb.append(primerConsonanteApellidoPaterno?.toUpperCase())
            .append(primerConsonanteApellidoMaterno?.toUpperCase())

        if (listaNombres.size == 2) {

            val primerNombre = listaNombres[0]

            if (primerNombre.equals("MARIA", true) or primerNombre.equals("JOSE", true)){
                val segundoNombre = listaNombres[1]
                val segundoNombreInterno = obtenerCadenaInterna(segundoNombre)
                val primeraConsonanteInterna = buscarPrimeraConsonante(segundoNombreInterno)
                sb.append(primeraConsonanteInterna?.toUpperCase())
            }
            else {
                val primerNombreInterno = obtenerCadenaInterna(primerNombre)
                val primeraConsonanteInterna = buscarPrimeraConsonante(primerNombreInterno)
                sb.append(primeraConsonanteInterna?.toUpperCase())
            }
        }
        return sb.toString()
    }

    val primeraParte: String = obtenerPrimeraParte(nombres, apellidoPaterno, apellidoMaterno)
    val segundaParte: String = obtenerSegundaParte(fechaNacimiento)
    val terceraParte: String = obtenerTerceraParte(estado)
    val cuartaParte: String = obtenerCuartaParte(nombres, apellidoPaterno, apellidoMaterno)

    return primeraParte + segundaParte + sexo[0].toUpperCase() + terceraParte + cuartaParte
}
