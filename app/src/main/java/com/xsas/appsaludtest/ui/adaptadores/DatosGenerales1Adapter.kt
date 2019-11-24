package com.xsas.appsaludtest.ui.adaptadores

import android.app.DatePickerDialog
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.DatosGenerales1
import com.xsas.appsaludtest.ui.ConsultasGlobales
import com.xsas.appsaludtest.ui.abrirDialogoFecha
import com.xsas.appsaludtest.ui.cambiarHabilitado
import com.xsas.appsaludtest.ui.listToArray
import com.xsas.appsaludtest.ui.modelos.SeccionDatosGeneralesViewModel

class DatosGenerales1Adapter(val vistas: ArrayList<DatosGenerales1>, val context: Context, val viewModel: SeccionDatosGeneralesViewModel) : RecyclerView.Adapter<DatosGenerales1Adapter.ViewHolder>() {

    class ViewHolder(itemView: View, viewModel: SeccionDatosGeneralesViewModel, val context: Context) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llDatosGenerales1 = itemView.findViewById<LinearLayout>(R.id.llDatosGenerales1)

        val etApellidoPaterno = itemView.findViewById<EditText>(R.id.etApellidoPaterno)
        val etApellidoMaterno = itemView.findViewById<EditText>(R.id.etApellidoMaterno)
        val etNombre = itemView.findViewById<EditText>(R.id.etNombre)
        val sSexo = itemView.findViewById<Spinner>(R.id.sSexo)
        val etCurp = itemView.findViewById<EditText>(R.id.etCurp)
        val bFechaNacimiento = itemView.findViewById<Button>(R.id.bFechaNacimiento)
        val bConfirmar = itemView.findViewById<Button>(R.id.bConfirmar)
        val llCampos = itemView.findViewById<LinearLayout>(R.id.llCampos)

        var index: Int = -1
      
        init {
            bConfirmar.setOnClickListener{
                val texto = bConfirmar.getText()

                cambiarHabilitado(llCampos)

                if (texto.equals("Editar")){
                    bConfirmar.setText("Confirmar")
                } else {
                    bConfirmar.setText("Editar")
                }
            }
          
            var sexos = listToArray(ConsultasGlobales.sexos!!)

            val sexoAdapter = ArrayAdapter(context, android.R.layout.simple_spinner_item, sexos)
            sSexo.adapter = sexoAdapter

            bDesplegar.setOnClickListener {
                llDatosGenerales1.visibility = if (llDatosGenerales1.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            bFechaNacimiento.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->
                    val fecha = "$year-$day-$month"
                    bFechaNacimiento.text = fecha
                })
            }

            bConfirmar.setOnClickListener {

                // Mandar datos al view model
                viewModel.getDatosGenerales1()[index].apellidoPaterno = etApellidoPaterno.text.toString()
                viewModel.getDatosGenerales1()[index].apellidoMaterno = etApellidoMaterno.text.toString()
                viewModel.getDatosGenerales1()[index].nombres = etNombre.text.toString()
                viewModel.getDatosGenerales1()[index].sexo = sSexo.selectedItem.toString()
                viewModel.getDatosGenerales1()[index].curp = etCurp.text.toString()
                viewModel.getDatosGenerales1()[index].fechaNacimiento = bFechaNacimiento.text.toString()

                // actualizar la ui
                bDesplegar.text = "${etNombre.text} ${etApellidoPaterno.text} ${etApellidoMaterno.text}"

                Log.e("salud", index.toString())
                Log.e("salud", viewModel.getDatosGenerales1()[index].toString())
            }
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
        holder.etApellidoMaterno.setText(vistas[position].apellidoMaterno)
        holder.index = position
    }
}
