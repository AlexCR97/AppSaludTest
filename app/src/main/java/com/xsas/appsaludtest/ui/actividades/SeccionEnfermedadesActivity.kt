package com.xsas.appsaludtest.ui.actividades

import android.content.Intent
import android.os.Bundle
import androidx.navigation.findNavController
import com.xsas.appsaludtest.R
import kotlinx.android.synthetic.main.activity_enfermedades.*

class SeccionEnfermedadesActivity : SeccionActivity() {

    override val cantidadFragmentos: Int
        get() = 2

    override val navegaciones: Map<Int, Int>
        get() = mapOf(
            2 to R.id.action_enfermedades1Fragment_to_enfermedades2Fragment
        )

    override val titulos: Map<Int, String>
        get() = mapOf(
            1 to "",
            2 to ""
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
                startActivity( Intent(this@SeccionEnfermedadesActivity, SeccionNoseActivity::class.java))
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enfermedades)

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