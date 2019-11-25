package com.xsas.appsaludtest.ui.actividades

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.otros.IntegranteEsquema
import com.xsas.appsaludtest.datos.otros.TipoCartilla
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacion
import com.xsas.appsaludtest.ui.EncuestaSingleton
import com.xsas.appsaludtest.ui.adaptadores.EsquemaVacunacionAdapter
import com.xsas.appsaludtest.ui.modelos.SeccionEsquemaVacunacionModel
import kotlinx.android.synthetic.main.activity_seccion_esquema_vacunacion.*

class SeccionEsquemaVacunacionActivity : SeccionActivity() {

    override val cantidadFragmentos: Int
        get() = 1

    override val navegaciones: Map<Int, Int>
        get() = mapOf()

    override val titulos: Map<Int, String>
        get() = mapOf()

    override val fragmentoAnteriorListener: FragmentoAnteriorListener
        get() = object : FragmentoAnteriorListener {
            override fun alCambiarFragmento(numeroFragmento: Int) {
                onBackPressed()
            }
        }

    override val fragmentoSiguienteListener: FragmentoSiguienteListener
        get() = object : FragmentoSiguienteListener {
            override fun alCambiarFragmento(numeroFragmento: Int) {

            }
        }

    override val actividadSiguienteListener: ActividadSiguienteListener
        get() = object : ActividadSiguienteListener {
            override fun alCambiarActividad(numeroFragmento: Int) {

                // checar quienes tienen cartilla
                Log.e("salud", "Antes de checar quien tiene cartilla\n$EncuestaSingleton")

                val integrantesEsquemas = arrayListOf<IntegranteEsquema>()

                for ((i, integrante) in EncuestaSingleton.esquemas.withIndex()) {
                    if (integrante.tieneCartilla) {
                        integrantesEsquemas.add(IntegranteEsquema(
                            index = i,
                            nombres = EncuestaSingleton.datosGenerales1[i].nombres,
                            apellidoPaterno = EncuestaSingleton.datosGenerales1[i].apellidoPaterno,
                            apellidoMaterno = EncuestaSingleton.datosGenerales1[i].apellidoMaterno,
                            edad = EncuestaSingleton.datosGenerales2[i].edad,
                            sexo = EncuestaSingleton.datosGenerales1[i].sexo
                        ))
                    }
                }

                Log.e("salud", "Despues de checar quien tiene cartilla\n$EncuestaSingleton")

                // checar edades para determinar esquemas de vacunacion
                /**
                 * nino 0 - 9
                 * asolescentes 10 - 19
                 * adultos mujeres 20 - 59
                 * adultos hombres 20 - 59
                 * adulto mayores 60 - ...
                 */

                for (integrante in integrantesEsquemas) {
                    integrante.tipoCartilla = when (integrante.edad) {
                        in 0..9 -> TipoCartilla.NINO
                        in 10..19 -> TipoCartilla.ADOLESCENTE
                        in 20..59 -> if (integrante.sexo == "Hombre") TipoCartilla.ADULTO_HOMBRE else TipoCartilla.ADULTO_MUJER
                        else -> TipoCartilla.ADULTO_MAYOR
                    }
                }

                EncuestaSingleton.integrantesEsquemas = integrantesEsquemas

                Log.e("salud", "Despues de checar tipos de cartilla\n$EncuestaSingleton")

                Log.e("salud", integrantesEsquemas.toString())

                // abrir esquemas de vacunacion de acuerdo a los tipos de cartillas

                when {
                    // si hay cartillas de nino
                    EncuestaSingleton.integrantesEsquemas.count { integranteEsquema -> integranteEsquema.tipoCartilla == TipoCartilla.NINO } != 0 -> {
                        Log.e("salud", "ninos")
                        val intent = Intent(this@SeccionEsquemaVacunacionActivity, SeccionEsquemaVacunacionNinoActivity::class.java)
                        startActivity(intent)
                    }

                    // si hay cartillas de adolescente
                    EncuestaSingleton.integrantesEsquemas.count { integranteEsquema -> integranteEsquema.tipoCartilla == TipoCartilla.ADOLESCENTE } != 0 -> {
                        Log.e("salud", "adolescentes")
                        val intent = Intent(this@SeccionEsquemaVacunacionActivity, SeccionEsquemaVacunacionAdolescenteActivity::class.java)
                        startActivity(intent)
                    }

                    // si hay cartillas de adulto hombre
                    EncuestaSingleton.integrantesEsquemas.count { integranteEsquema -> integranteEsquema.tipoCartilla == TipoCartilla.ADULTO_HOMBRE } != 0 -> {
                        Log.e("salud", "hombres")
                        val intent = Intent(this@SeccionEsquemaVacunacionActivity, SeccionEsquemaVacunacionAdultoHombreActivity::class.java)
                        startActivity(intent)
                    }

                    // si hay cartillas de adulto mujer
                    EncuestaSingleton.integrantesEsquemas.count { integranteEsquema -> integranteEsquema.tipoCartilla == TipoCartilla.ADULTO_MUJER } != 0 -> {
                        Log.e("salud", "mujeres")
                        val intent = Intent(this@SeccionEsquemaVacunacionActivity, SeccionEsquemaVacunacionAdultoMujerActivity::class.java)
                        startActivity(intent)
                    }

                    // si hay cartillas de adultos mayores
                    EncuestaSingleton.integrantesEsquemas.count { integranteEsquema -> integranteEsquema.tipoCartilla == TipoCartilla.ADULTO_MAYOR } != 0 -> {
                        Log.e("salud", "ancianos")
                        val intent = Intent(this@SeccionEsquemaVacunacionActivity, SeccionEsquemaVacunacionAncianoActivity::class.java)
                        startActivity(intent)
                    }

                    // si nadie tiene esquema de vacunacion
                    else -> {
                        Log.e("salud", "Nadie tiene esquema de vacunacion")
                        val intent = Intent(this@SeccionEsquemaVacunacionActivity, SeccionOtrosActivity::class.java)
                        startActivity(intent)
                    }
                }
            }
        }

    private lateinit var viewModel: SeccionEsquemaVacunacionModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seccion_esquema_vacunacion)

        viewModel = ViewModelProviders.of(this)[SeccionEsquemaVacunacionModel::class.java]

        bAnterior.setOnClickListener {
            fragmentoAnterior()
        }

        bSiguiente.setOnClickListener {
            fragmentoSiguiente()
        }

        // agregar integrantes

        for (i in 0 until EncuestaSingleton.cantidadIntegrantes) {
            viewModel.agregarEsquemaVacunacion(EsquemaVacunacion())
        }

        rvEsquemaVacunacion.adapter = EsquemaVacunacionAdapter(viewModel.getEsquemasVacunacion(), this, viewModel)
        rvEsquemaVacunacion.layoutManager = LinearLayoutManager(this)

        tvNumeroFragmento.text = "1 / $cantidadFragmentos"
        //tvTituloFragmento.text = titulos[1]
    }
}
