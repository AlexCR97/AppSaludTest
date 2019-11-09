package com.ale.appsaludtest.ui.actividades

import android.content.Intent
import android.os.Bundle
import androidx.navigation.findNavController
import com.ale.appsaludtest.R
import kotlinx.android.synthetic.main.activity_enfermedades.*

class SeccionCancerActivity : SeccionActivity() {

    override val cantidadFragmentos: Int
        get() = 3

    override val navegaciones: Map<Int, Int>
        get() = mapOf(
            2 to R.id.action_cancer1Fragment_to_cancer2Fragment,
            3 to R.id.action_cancer2Fragment_to_cancer3Fragment
        )

    override val titulos: Map<Int, String>
        get() = mapOf(
            1 to "Cáncer mamario",
            2 to "Cáncer cérvico uterino",
            3 to "Antígeno prostático"
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
                val intent = Intent(this@SeccionCancerActivity, EncuestaTerminadaActivity::class.java)
                startActivity(intent)
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cancer)

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
