package com.xsas.appsaludtest.ui.adaptadores

import android.app.DatePickerDialog
import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.DatosGenerales1
import com.xsas.appsaludtest.ui.*
import com.xsas.appsaludtest.ui.modelos.SeccionDatosGeneralesViewModel

class DatosGenerales1Adapter(val vistas: ArrayList<DatosGenerales1>, val context: Context, val viewModel: SeccionDatosGeneralesViewModel) : RecyclerView.Adapter<DatosGenerales1Adapter.ViewHolder>() {

    class ViewHolder(itemView: View, viewModel: SeccionDatosGeneralesViewModel, val context: Context) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llDatosGenerales1 = itemView.findViewById<LinearLayout>(R.id.llDatosGenerales1)

        val etApellidoPaterno = itemView.findViewById<EditText>(R.id.etApellidoPaterno)
        val etApellidoMaterno = itemView.findViewById<EditText>(R.id.etApellidoMaterno)
        val etNombre = itemView.findViewById<EditText>(R.id.etNombre)
        val sSexo = itemView.findViewById<Spinner>(R.id.sSexo)
        val sNacionalidad = itemView.findViewById<Spinner>(R.id.sNacionalidad)
        val bFechaNacimiento = itemView.findViewById<Button>(R.id.bFechaNacimiento)
        val tvGenerarCurp = itemView.findViewById<TextView>(R.id.tvGenerarCurp)
        val etCurp = itemView.findViewById<EditText>(R.id.etCurp)
        val bConfirmar = itemView.findViewById<Button>(R.id.bConfirmar)
        val llCampos = itemView.findViewById<LinearLayout>(R.id.llCampos)

        var index: Int = -1
      
        init {
            val sexos = listToArray(ConsultasGlobales.sexos)
            val sexoAdapter = ArrayAdapter(context, android.R.layout.simple_spinner_item, sexos)
            sSexo.adapter = sexoAdapter

            val nacionalidades = listToArray(ConsultasGlobales.entidadesFederativas.keys.toList())
            val nacionalidadesAdapter = ArrayAdapter(context, android.R.layout.simple_spinner_item, nacionalidades)
            sNacionalidad.adapter = nacionalidadesAdapter

            bDesplegar.setOnClickListener {
                llDatosGenerales1.visibility = if (llDatosGenerales1.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            bFechaNacimiento.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { _, year, month, day ->
                    val fecha = "$year-$day-${month + 1}"
                    bFechaNacimiento.text = fecha
                })
            }

            tvGenerarCurp.setOnClickListener { generarCurp() }

            bConfirmar.setOnClickListener {

                val texto = bConfirmar.text

                cambiarHabilitado(llCampos)

                if (texto == "Editar") {
                    bConfirmar.text = "Confirmar"
                } else {
                    generarCurp()
                    bConfirmar.text = "Editar"
                }

                // Mandar datos al view model
                viewModel.getDatosGenerales1()[index].apellidoPaterno = etApellidoPaterno.text.toString()
                viewModel.getDatosGenerales1()[index].apellidoMaterno = etApellidoMaterno.text.toString()
                viewModel.getDatosGenerales1()[index].nombres = etNombre.text.toString()
                viewModel.getDatosGenerales1()[index].sexo = sSexo.selectedItem.toString()
                viewModel.getDatosGenerales1()[index].curp = etCurp.text.toString()
                viewModel.getDatosGenerales1()[index].fechaNacimiento = bFechaNacimiento.text.toString()

                // actualizar el singleton
                EncuestaSingleton.datosGenerales1 = viewModel.getDatosGenerales1()

                // actualizar la ui
                bDesplegar.text = viewModel.getDatosGenerales1()[index].nombreCompleto
            }
        }

        private fun generarCurp() {
            val nombres = etNombre.text.toString()
            val apellidoPaterno = etApellidoPaterno.text.toString()
            val apellidoMaterno = etApellidoMaterno.text.toString()
            val fechaNac = bFechaNacimiento.text.toString()
            val sexo = if (sSexo.selectedItem != null) sSexo.selectedItem.toString() else ConsultasGlobales.sexos[0]
            val estado = if (sNacionalidad.selectedItem != null) sNacionalidad.selectedItem.toString() else ConsultasGlobales.entidadesFederativas.keys.toList()[0]

            // TODO Validar los datos para la curp

            if (nombres.isEmpty())
                return

            if (apellidoPaterno.isEmpty())
                return

            if (apellidoMaterno.isEmpty())
                return

            if (!esFecha(fechaNac))
                return

            val curp = curp(nombres, apellidoPaterno, apellidoMaterno, fechaNac, sexo, estado)
            etCurp.setText(curp)
        }
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_datos_generales1, parent, false)
        return ViewHolder(view, viewModel, context)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.index = position
        holder.bDesplegar.text = if (viewModel.getDatosGenerales1()[position].nombreCompleto.isNotEmpty()) viewModel.getDatosGenerales1()[position].nombreCompleto else "Desplegar"

        holder.etApellidoPaterno.setText(viewModel.getDatosGenerales1()[position].apellidoPaterno)
        holder.etApellidoMaterno.setText(viewModel.getDatosGenerales1()[position].apellidoMaterno)
        holder.etNombre.setText(viewModel.getDatosGenerales1()[position].nombres)
        holder.etCurp.setText(viewModel.getDatosGenerales1()[position].curp)
        holder.bFechaNacimiento.text = viewModel.getDatosGenerales1()[position].fechaNacimiento
    }
}
