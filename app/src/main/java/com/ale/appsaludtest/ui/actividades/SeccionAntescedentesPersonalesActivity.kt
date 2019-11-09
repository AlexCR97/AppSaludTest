package com.ale.appsaludtest.ui.actividades

import android.content.Intent
import android.os.Bundle
import androidx.navigation.findNavController
import com.ale.appsaludtest.R
import kotlinx.android.synthetic.main.activity_antescedentes_personales.*

class SeccionAntescedentesPersonalesActivity : SeccionActivity() {

    override val cantidadFragmentos: Int
        get() = 6

    override val navegaciones: Map<Int, Int>
        get() = mapOf(
            2 to R.id.action_AntescedentesPersonales1Fragment_to_AntescedentesPersonales2Fragment,
            3 to R.id.action_AntescedentesPersonales2Fragment_to_AntescedentesPersonales3Fragment,
            4 to R.id.action_AntescedentesPersonales3Fragment_to_AntescedentesPersonales4Fragment,
            5 to R.id.action_AntescedentesPersonales4Fragment_to_AntescedentesPersonales5Fragment,
            6 to R.id.action_AntescedentesPersonales5Fragment_to_AntescedentesPersonales6Fragment2
        )

    override val titulos: Map<Int, String>
        get() = mapOf(
            1 to "Habitos Tòxicos",
            2 to "Fisiológicos",
            3 to "Patològicos",
            4 to "Gineco-obstètricos",
            5 to "5",
            6 to "6"
        )

    override val fragmentoAnteriorListener: FragmentoAnteriorListener
        get() = object: FragmentoAnteriorListener {
            override fun alCambiarFragmento(numeroFragmento: Int) {
                onBackPressed()
                tvNumeroFragmento.text = "$numeroFragmento / $cantidadFragmentos"
                tvTituloFragmento.text = titulos[numeroFragmento]
            }
        }

    override val fragmentoSiguienteListener: FragmentoSiguienteListener
        get() = object: FragmentoSiguienteListener {
            override fun alCambiarFragmento(numeroFragmento: Int) {
                nav.navigate(navegaciones[numeroFragmento]!!)
                tvNumeroFragmento.text = "$numeroFragmento / $cantidadFragmentos"
                tvTituloFragmento.text = titulos[numeroFragmento]
            }
        }

    override val actividadSiguienteListener: ActividadSiguienteListener
        get() = object : ActividadSiguienteListener {
            override fun alCambiarActividad(numeroFragmento: Int) {
                val intent = Intent(this@SeccionAntescedentesPersonalesActivity, SeccionEnfermedadesActivity::class.java)
                startActivity(intent)
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_antescedentes_personales)

        nav = findNavController(R.id.navHostFragment)

        bAnterior.setOnClickListener {
            fragmentoAnterior()
        }

        bSiguiente.setOnClickListener {
            fragmentoSiguiente()
        }

        tvNumeroFragmento.text = "1 / $cantidadFragmentos"
        tvTituloFragmento.text = titulos[1]
    }
}
