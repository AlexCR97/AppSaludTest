package com.xsas.appsaludtest.ui.adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.view.children
import androidx.recyclerview.widget.RecyclerView
import com.google.android.flexbox.FlexboxLayout
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.ui.ConsultasGlobales
import com.xsas.appsaludtest.ui.cambiarHabilitado
import com.xsas.appsaludtest.ui.crearBotonTag
import com.xsas.appsaludtest.ui.listToArray

class Enfermedades1Adapter (val vistas: ArrayList<Any>, val context: Context) : RecyclerView.Adapter<Enfermedades1Adapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(itemView: View, val context: Context) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llEnfermedades1 = itemView.findViewById<LinearLayout>(R.id.llEnfermedades1)
        val bConfirmar = itemView.findViewById<Button>(R.id.bConfirmar)
        val llCampos = itemView.findViewById<LinearLayout>(R.id.llCampos)

        val sInfeccionesRespiratorias = itemView.findViewById<Spinner>(R.id.sInfeccionesRespiratorias)
        val fbInfeccionesRespitatorias = itemView.findViewById<FlexboxLayout>(R.id.fbInfeccionesRespitatorias)

        val rbSiDiabetes = itemView.findViewById<RadioButton>(R.id.rbSiDiabetes)
        val rbNoDiabetes = itemView.findViewById<RadioButton>(R.id.rbNoDiabetes)

        val rbSiDiabetesEnControl = itemView.findViewById<RadioButton>(R.id.rbSiDiabetesEnControl)
        val rbNoDiabetesEnControl = itemView.findViewById<RadioButton>(R.id.rbNoDiabetesEnControl)

        val llCamposDiabetesEnControl = itemView.findViewById<LinearLayout>(R.id.llCamposDiabetesEnControl)
        val llCamposDiabetesFecha = itemView.findViewById<LinearLayout>(R.id.llCamposDiabetesFecha)

        val bFechaDiabetes = itemView.findViewById<Button>(R.id.bFechaDiabetes)

        init {
            // TODO Agregar dialogos de fechas (Enfermedades1Adapter)

            rbNoDiabetes.isChecked = true
            rbNoDiabetesEnControl.isChecked = true

            llCamposDiabetesEnControl.visibility = View.GONE
            llCamposDiabetesFecha.visibility = View.GONE

            rbSiDiabetes.setOnClickListener { llCamposDiabetesEnControl.visibility = View.VISIBLE }
            rbNoDiabetes.setOnClickListener { llCamposDiabetesEnControl.visibility = View.GONE }

            rbSiDiabetesEnControl.setOnClickListener { llCamposDiabetesFecha.visibility = View.VISIBLE }
            rbNoDiabetesEnControl.setOnClickListener { llCamposDiabetesFecha.visibility = View.GONE }

            val enfermedades = listToArray(ConsultasGlobales.enfermedades)
            sInfeccionesRespiratorias.adapter = ArrayAdapter(context, android.R.layout.simple_spinner_item, enfermedades)
            sInfeccionesRespiratorias.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(p0: AdapterView<*>?) { }
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, id: Long) {
                    val enfermedadSeleccionada: String = enfermedades[position]

                    if (fbInfeccionesRespitatorias.children.any { buttonInfeccion -> (buttonInfeccion as Button).text == enfermedadSeleccionada })
                        return

                    // checar que no se haya agregado ya la infeccion seleccionada

                    val button = crearBotonTag(context, enfermedadSeleccionada)
                    button.setOnClickListener { fbInfeccionesRespitatorias.removeView(button) }

                    fbInfeccionesRespitatorias.addView(button)
                }
            }

            bDesplegar.setOnClickListener {
                llEnfermedades1.visibility = if (llEnfermedades1.visibility == View.VISIBLE) View.GONE else View.VISIBLE
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Enfermedades1Adapter.ViewHolder {
        val view: View = LayoutInflater.from(context)
            .inflate(R.layout.item_enfermedades1, parent, false)
        return Enfermedades1Adapter.ViewHolder(view, context)
    }
}
