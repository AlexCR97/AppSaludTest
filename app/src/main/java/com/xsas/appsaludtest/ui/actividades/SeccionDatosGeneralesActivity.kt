package com.xsas.appsaludtest.ui.actividades

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.ui.EncuestaSingleton
import com.xsas.appsaludtest.ui.edadPorFecha
import com.xsas.appsaludtest.ui.modelos.SeccionDatosGeneralesViewModel
import kotlinx.android.synthetic.main.activity_seccion_datos_generales.*

class SeccionDatosGeneralesActivity : SeccionActivity() {

    override val cantidadFragmentos: Int
        get() = 2

    override val navegaciones: Map<Int, Int>
        get() = mapOf(
            2 to R.id.action_seccionDatosGenerales1Fragment_to_seccionDatosGenerales2Fragment
        )

    override val titulos: Map<Int, String>
        get() = mapOf(
            1 to "Datos generales de la familia",
            2 to "Datos generales de la familia"
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

                // actualizar singleton de encuesta
                EncuestaSingleton.datosGenerales1 = viewModel.getDatosGenerales1()
                EncuestaSingleton.datosGenerales2 = viewModel.getDatosGenerales2()

                // checar edades para determinar esquemas de vacunacion

                /**
                 * nino 0 - 9
                 * asolescentes 10 - 19
                 * adultos mujeres 20 - 59
                 * adultos hombres 20 - 59
                 * adulto mayores 60 - ...
                 *
                 */

                var ninos = 0
                var adolescentes = 0
                var adultosMujeres = 0
                var adultosHombres = 0
                var adultosMayores = 0

                for (i in viewModel.getDatosGenerales1()) {

                    val edad: Int = edadPorFecha(i.fechaNacimiento)

                    when (edad) {
                        in 0..9 -> ninos++
                        in 10..19 -> adolescentes++
                        in 20..59 -> {
                            if (i.sexo == "Hombre")
                                adultosHombres++
                            else
                                adultosMujeres++
                        }
                        else -> adultosMayores++
                    }

                    Log.e("salud", edad.toString())
                }

                EncuestaSingleton.cantidadEsquemasVacunacionNinos = ninos
                EncuestaSingleton.cantidadEsquemasVacunacionAdolescentes = adolescentes
                EncuestaSingleton.cantidadEsquemasVacunacionAdultosHombres = adultosHombres
                EncuestaSingleton.cantidadEsquemasVacunacionAdultosMujeres = adultosMujeres
                EncuestaSingleton.cantidadEsquemasVacunacionAdultosMayores = adultosMayores

                val intent = Intent(this@SeccionDatosGeneralesActivity, SeccionEsquemaVacunacionActivity::class.java)
                startActivity(intent)
            }
        }

    private lateinit var viewModel: SeccionDatosGeneralesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seccion_datos_generales)

        nav = findNavController(R.id.navHostFragment)
        viewModel = ViewModelProviders.of(this)[SeccionDatosGeneralesViewModel::class.java]

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
