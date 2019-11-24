package com.xsas.appsaludtest.ui.actividades

import android.content.Intent
import android.os.Bundle
import androidx.navigation.findNavController
import com.xsas.appsaludtest.R
import kotlinx.android.synthetic.main.activity_seccion_antescedentes_personales.*

class SeccionSinNombreActivity : SeccionActivity() {


    override val cantidadFragmentos: Int
        get() = 2

    override val navegaciones: Map<Int, Int>
        get() = mapOf(
            2 to R.id.action_sinNombre1Fragment_to_sinNombre2Fragment
        )

    override val titulos: Map<Int, String>
        get() = mapOf(
            1 to "",
            2 to "Unidad de atención"
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
                val intent = Intent(this@SeccionSinNombreActivity, SeccionAntescedentesPersonalesActivity::class.java)
                startActivity(intent)
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seccion_sin_nombre)

        nav = findNavController(R.id.navHostFragment)

        bAnterior.setOnClickListener {
            fragmentoAnterior()
        }

        bSiguiente.setOnClickListener {
            fragmentoSiguiente()
        }

        tvTituloFragmento.text = titulos[1]
    }
}
