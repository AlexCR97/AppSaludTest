package com.xsas.appsaludtest.ui.actividades

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.dominio.validadores.ValidadorPool
import com.xsas.appsaludtest.dominio.validadores.propiedades.ValidadorNumeroString
import com.xsas.appsaludtest.dominio.validadores.propiedades.ValidadorStringNoVacio
import com.xsas.appsaludtest.ui.modelos.SeccionGeoreferenciacionViewModel
import kotlinx.android.synthetic.main.activity_seccion_georeferenciacion.*

class SeccionGeoreferenciacionActivity : SeccionActivity() {

    override val cantidadFragmentos: Int
        get() = 3

    override val navegaciones: Map<Int, Int>
        get() = mapOf(
            2 to R.id.action_georeferenciacion1Fragment_to_georeferenciacion2Fragment,
            3 to R.id.action_georeferenciacion2Fragment_to_seccionGeoreferenciacion3Fragment
        )

    override val titulos: Map<Int, String>
        get() = mapOf(
            1 to "Unidad de atención",
            2 to "Vivienda donde se aplica la encuesta",
            3 to "Vivienda donde se aplica la encuesta"
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
        get() = object: ActividadSiguienteListener {
            override fun alCambiarActividad(numeroFragmento: Int) {
                val intent = Intent(this@SeccionGeoreferenciacionActivity, SeccionDatosGeneralesActivity::class.java)
                startActivity(intent)
            }
        }

    private lateinit var viewModel: SeccionGeoreferenciacionViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seccion_georeferenciacion)

        nav = findNavController(R.id.navHostFragment)

        viewModel = ViewModelProviders.of(this)[SeccionGeoreferenciacionViewModel::class.java]

        bAnterior.setOnClickListener {
            fragmentoAnterior()
        }

        bSiguiente.setOnClickListener {
            validarFragmentoActual()
        }

        tvNumeroFragmento.text = "1 / $cantidadFragmentos"
        tvTituloFragmento.text = titulos[1]
    }

    fun validarFragmentoActual() {
        when (fragmentoActual) {
            1 -> {
                if (!validarSeccion1()) {
                    return
                }
            }

            2 -> {
                if (!validarSeccion2()) {
                    return
                }
            }

            3 -> {
                if (!validarSeccion3()) {
                    return
                }
            }
        }

        fragmentoSiguiente()
    }

    fun validarSeccion1(): Boolean {
        val validador = ValidadorPool.Builder()
            .agregarValidador(ValidadorStringNoVacio(viewModel.georeferenciacion1.jurisdiccion))
            .agregarValidador(ValidadorStringNoVacio(viewModel.georeferenciacion1.municipio))
            .agregarValidador(ValidadorStringNoVacio(viewModel.georeferenciacion1.centroSalud))
            .build()

        Log.e("chambee", "Validando: ${viewModel.georeferenciacion1}")

        if (!validador.validarTodo()) {
            Toast.makeText(this@SeccionGeoreferenciacionActivity, validador.ultimoError()?.mensajeError(), Toast.LENGTH_SHORT).show()
            return false
        }

        return true
    }

    fun validarSeccion2(): Boolean {
        val validador = ValidadorPool.Builder()
            .agregarValidador(ValidadorNumeroString(viewModel.georeferenciacion2.codigoPostal))
            .agregarValidador(ValidadorStringNoVacio(viewModel.georeferenciacion2.localidad))
            .agregarValidador(ValidadorStringNoVacio(viewModel.georeferenciacion2.calle))
            .agregarValidador(ValidadorNumeroString(viewModel.georeferenciacion2.numeroExterior))
            .agregarValidador(ValidadorNumeroString(viewModel.georeferenciacion2.numeroInterior))
            .build()

        Log.e("chambee", "Validando: ${viewModel.georeferenciacion2}")

        if (!validador.validarTodo()) {
            Toast.makeText(this@SeccionGeoreferenciacionActivity, validador.ultimoError()?.mensajeError(), Toast.LENGTH_SHORT).show()
            return false
        }

        return true
    }

    fun validarSeccion3(): Boolean {
        val validador = ValidadorPool.Builder()
            .agregarValidador(ValidadorNumeroString(viewModel.georeferenciacion3.telefono))
            .agregarValidador(ValidadorStringNoVacio(viewModel.georeferenciacion3.referenciaUbicacion))
            .build()

        Log.e("chambee", "Validando: ${viewModel.georeferenciacion3}")

        if (!validador.validarTodo()) {
            Toast.makeText(this@SeccionGeoreferenciacionActivity, validador.ultimoError()?.mensajeError(), Toast.LENGTH_SHORT).show()
            return false
        }

        return true
    }
}
