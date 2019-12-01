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

class Cancer1Adapter (val vistas: ArrayList<Any>, val context: Context) : RecyclerView.Adapter<Cancer1Adapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llCancer1 = itemView.findViewById<LinearLayout>(R.id.llCancer1)
        val bConfirmar = itemView.findViewById<Button>(R.id.bConfirmar)
        val llCampos = itemView.findViewById<LinearLayout>(R.id.llCampos)

        val rbSiMastografia = itemView.findViewById<RadioButton>(R.id.rbSiMastografia)
        val rbNoMastografia = itemView.findViewById<RadioButton>(R.id.rbNoMastografia)
        val llCamposMastografia = itemView.findViewById<LinearLayout>(R.id.llCamposMastografia)

        val rbSiExploracionMamaria = itemView.findViewById<RadioButton>(R.id.rbSiExploracionMamaria)
        val rbNoExploracionMamaria = itemView.findViewById<RadioButton>(R.id.rbNoExploracionMamaria)
        val llCamposExploracionMamaria = itemView.findViewById<LinearLayout>(R.id.llCamposExploracionMamaria)

        val bFechaExploracionMamaria = itemView.findViewById<Button>(R.id.bFechaExploracionMamaria)
        val bFechaMastografia = itemView.findViewById<Button>(R.id.bFechaMastografia)

        init {
            rbNoMastografia.isChecked = true
            rbNoExploracionMamaria.isChecked = true

            llCamposMastografia.visibility = View.GONE
            llCamposExploracionMamaria.visibility = View.GONE

            bDesplegar.setOnClickListener {
                llCancer1.visibility = if (llCancer1.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            rbSiMastografia.setOnClickListener { llCamposMastografia.visibility = View.VISIBLE }
            rbNoMastografia.setOnClickListener { llCamposMastografia.visibility = View.GONE }

            rbSiExploracionMamaria.setOnClickListener { llCamposExploracionMamaria.visibility = View.VISIBLE }
            rbNoExploracionMamaria.setOnClickListener { llCamposExploracionMamaria.visibility = View.GONE }

            bFechaExploracionMamaria.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { _, year, month, day ->
                    val fecha = "$year-$day-${month + 1}"
                    bFechaExploracionMamaria.text = fecha
                })
            }

            bFechaMastografia.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { _, year, month, day ->
                    val fecha = "$year-$day-${month + 1}"
                    bFechaMastografia.text = fecha
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Cancer1Adapter.ViewHolder {
        val view: View = LayoutInflater.from(context)
            .inflate(R.layout.item_cancer1, parent, false)
        return Cancer1Adapter.ViewHolder(view)
    }


}
