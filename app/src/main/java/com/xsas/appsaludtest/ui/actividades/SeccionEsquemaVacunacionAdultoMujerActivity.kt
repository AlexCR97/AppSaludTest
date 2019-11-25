package com.xsas.appsaludtest.ui.actividades

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.otros.TipoCartilla
import com.xsas.appsaludtest.ui.EncuestaSingleton
import kotlinx.android.synthetic.main.activity_seccion_esquema_vacunacion_adulto_mujer.*

class SeccionEsquemaVacunacionAdultoMujerActivity : SeccionActivity() {

    override val cantidadFragmentos: Int
        get() = 4

    override val navegaciones: Map<Int, Int>
        get() = mapOf(
            2 to R.id.action_seccionEsquemaVacunacionAdultoMujer1Fragment_to_seccionEsquemaVacunacionAdultoMujer2Fragment,
            3 to R.id.action_seccionEsquemaVacunacionAdultoMujer2Fragment_to_seccionEsquemaVacunacionAdultoMujer3Fragment,
            4 to R.id.action_seccionEsquemaVacunacionAdultoMujer3Fragment_to_seccionEsquemaVacunacionAdultoMujer4Fragment
        )

    override val titulos: Map<Int, String>
        get() = mapOf()

    override val fragmentoAnteriorListener: FragmentoAnteriorListener
        get() = object : FragmentoAnteriorListener {
            override fun alCambiarFragmento(numeroFragmento: Int) {
                onBackPressed()
                tvNumeroFragmento.text = "$numeroFragmento / $cantidadFragmentos"
            }
        }

    override val fragmentoSiguienteListener: FragmentoSiguienteListener
        get() = object : FragmentoSiguienteListener {
            override fun alCambiarFragmento(numeroFragmento: Int) {
                nav.navigate(navegaciones[numeroFragmento]!!)
                tvNumeroFragmento.text = "$numeroFragmento / $cantidadFragmentos"
            }
        }

    override val actividadSiguienteListener: ActividadSiguienteListener
        get() = object : ActividadSiguienteListener {
            override fun alCambiarActividad(numeroFragmento: Int) {

                // abrir esquemas de vacunacion de acuerdo a los tipos de cartillas

                when {
                    // si hay cartillas de adultos mayores
                    EncuestaSingleton.integrantesEsquemas.count { integranteEsquema -> integranteEsquema.tipoCartilla == TipoCartilla.ADULTO_MAYOR } != 0 -> {
                        Log.e("salud", "ancianos")
                        val intent = Intent(this@SeccionEsquemaVacunacionAdultoMujerActivity, SeccionEsquemaVacunacionAncianoActivity::class.java)
                        startActivity(intent)
                    }

                    // si nadie tiene esquema de vacunacion
                    else -> {
                        Log.e("salud", "Nadie tiene esquema de vacunacion")
                        val intent = Intent(this@SeccionEsquemaVacunacionAdultoMujerActivity, SeccionOtrosActivity::class.java)
                        startActivity(intent)
                    }
                }

            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seccion_esquema_vacunacion_adulto_hombre)

        nav = findNavController(R.id.navHostFragment)

        bAnterior.setOnClickListener {
            fragmentoAnterior()
        }

        bSiguiente.setOnClickListener {
            fragmentoSiguiente()
        }

        tvNumeroFragmento.text = "1 / $cantidadFragmentos"
        //tvTituloFragmento.text = titulos[1]
    }
}