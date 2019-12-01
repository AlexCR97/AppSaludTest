package com.xsas.appsaludtest.ui.adaptadores

import android.app.DatePickerDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton
import androidx.recyclerview.widget.RecyclerView
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.ui.abrirDialogoFecha
import com.xsas.appsaludtest.ui.cambiarHabilitado

class Cancer3Adapter (val vistas: ArrayList<Any>, val context: Context) : RecyclerView.Adapter<Cancer3Adapter.ViewHolder>() {

    class ViewHolder(itemView: View, val context: Context) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llCancer3 = itemView.findViewById<LinearLayout>(R.id.llCancer3)
        val bConfirmar = itemView.findViewById<Button>(R.id.bConfirmar)
        val llCampos = itemView.findViewById<LinearLayout>(R.id.llCampos)

        val rbSiVPH = itemView.findViewById<RadioButton>(R.id.rbSiVPH)
        val rbNoVPH = itemView.findViewById<RadioButton>(R.id.rbNoVPH)

        val llCamposDeteccionVPH = itemView.findViewById<LinearLayout>(R.id.llCamposDeteccionVPH)

        val bFechaVPH = itemView.findViewById<Button>(R.id.bFechaVPH)

        init {
            rbNoVPH.isChecked = true
            llCamposDeteccionVPH.visibility = View.GONE

            bDesplegar.setOnClickListener {
                llCancer3.visibility = if (llCancer3.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            rbSiVPH.setOnClickListener { llCamposDeteccionVPH.visibility = View.VISIBLE }
            rbNoVPH.setOnClickListener { llCamposDeteccionVPH.visibility = View.GONE }

            bFechaVPH.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { _, year, month, day ->
                    val fecha = "$year-$day-${month + 1}"
                    bFechaVPH.text = fecha
                })
            }

            bConfirmar.setOnClickListener {
                val texto = bConfirmar.text

                cambiarHabilitado(llCampos)

                if (texto == "Editar") {
                    bConfirmar.text = "Confirmar"
                } else {
                    bConfirmar.text = "Editar"
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Cancer3Adapter.ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_cancer3, parent, false)
        return ViewHolder(view, context)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }
}
