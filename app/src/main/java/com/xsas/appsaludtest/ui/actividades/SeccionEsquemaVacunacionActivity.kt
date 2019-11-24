package com.xsas.appsaludtest.ui.actividades

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.xsas.appsaludtest.R
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
                val intent = Intent(this@SeccionEsquemaVacunacionActivity, SeccionEsquemaVacunacionNinoActivity::class.java)
                startActivity(intent)
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

        for (integrante in EncuestaSingleton.datosGenerales1) {
            viewModel.agregarEsquemaVacunacion(EsquemaVacunacion())
        }

        rvEsquemaVacunacion.adapter = EsquemaVacunacionAdapter(viewModel.getEsquemasVacunacion(), this)
        rvEsquemaVacunacion.layoutManager = LinearLayoutManager(this)

        tvNumeroFragmento.text = "1 / $cantidadFragmentos"
        //tvTituloFragmento.text = titulos[1]
    }
}
