package com.xsas.appsaludtest.ui.adaptadores

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewManager
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Spinner
import androidx.recyclerview.widget.RecyclerView
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.DatosGenerales2
import com.xsas.appsaludtest.ui.EncuestaSingleton
import com.xsas.appsaludtest.ui.cambiarHabilitado
import com.xsas.appsaludtest.ui.edadPorFecha
import com.xsas.appsaludtest.ui.modelos.SeccionDatosGeneralesViewModel

class DatosGenerales2Adapter(val vistas: ArrayList<DatosGenerales2>, val context: Context, val viewModel: SeccionDatosGeneralesViewModel) : RecyclerView.Adapter<DatosGenerales2Adapter.ViewHolder>() {

    class ViewHolder(itemView: View, viewModel: SeccionDatosGeneralesViewModel) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llDatosGenerales2 = itemView.findViewById<LinearLayout>(R.id.llDatosGenerales2)
        val etEdad = itemView.findViewById<EditText>(R.id.etEdad)
        val sServicioMedico = itemView.findViewById<Spinner>(R.id.sServicioMedico)
        val etOcupacion = itemView.findViewById<EditText>(R.id.etOcupacion)
        val sEstadoCivil = itemView.findViewById<Spinner>(R.id.sEstadoCivil)
        val sNacionalidad = itemView.findViewById<Spinner>(R.id.sNacionalidad)
        val etResidenciaAnterior = itemView.findViewById<EditText>(R.id.etResidenciaAnterior)
        val sGradoEstudio = itemView.findViewById<Spinner>(R.id.sGradoEstudio)
        val bConfirmar = itemView.findViewById<Button>(R.id.bConfirmar)
        val llCampos = itemView.findViewById<LinearLayout>(R.id.llCampos)

        var index = -1

        init {
            bDesplegar.setOnClickListener {
                llDatosGenerales2.visibility = if (llDatosGenerales2.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            bConfirmar.setOnClickListener{
                val texto = bConfirmar.text

                cambiarHabilitado(llCampos)

                if (texto == "Editar") {
                    bConfirmar.text = "Confirmar"
                } else {
                    bConfirmar.text = "Editar"
                }

                // mandar datos al view model
                viewModel.getDatosGenerales2()[index].edad = etEdad.text.toString().toInt()
                //viewModel.getDatosGenerales2()[index].servicioMedico = sServicioMedico.selectedItem.toString()
                viewModel.getDatosGenerales2()[index].ocupacion = etOcupacion.text.toString()
                //viewModel.getDatosGenerales2()[index].estadoCivil = sEstadoCivil.selectedItem.toString()
                //viewModel.getDatosGenerales2()[index].nacionalidad = sNacionalidad.selectedItem.toString()
                viewModel.getDatosGenerales2()[index].residenciaAnterior = etResidenciaAnterior.text.toString()
                //viewModel.getDatosGenerales2()[index].ultimoGradoEstudio = sGradoEstudio.selectedItem.toString()

                // actualizar el singleton
                EncuestaSingleton.datosGenerales2 = viewModel.getDatosGenerales2()
            }
        }
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_datos_generales2, parent, false)
        return ViewHolder(view, viewModel)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.index = position
        holder.bDesplegar.text = EncuestaSingleton.datosGenerales1[position].nombreCompleto

        holder.etEdad.setText(edadPorFecha(EncuestaSingleton.datosGenerales1[position].fechaNacimiento).toString())
        holder.etResidenciaAnterior.setText(viewModel.getDatosGenerales2()[position].residenciaAnterior)
    }
}
