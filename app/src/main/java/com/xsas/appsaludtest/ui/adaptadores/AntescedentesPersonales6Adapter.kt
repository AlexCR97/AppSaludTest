package com.xsas.appsaludtest.ui.adaptadores

import android.app.DatePickerDialog
import android.content.Context
import android.opengl.Visibility
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

class AntescedentesPersonales6Adapter (val vistas: ArrayList<Any>, val context: Context) : RecyclerView.Adapter<AntescedentesPersonales6Adapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llAntescedentes6 = itemView.findViewById<LinearLayout>(R.id.llAntescedentes6)
        val rbSiPapanicolaou = itemView.findViewById<RadioButton>(R.id.rbSiPapanicolaou)
        val rbNoPapanicolaou = itemView.findViewById<RadioButton>(R.id.rbNoPapanicolaou)
        val llCamposPapanicolaou = itemView.findViewById<LinearLayout>(R.id.llCamposPapanicolaou)
        val bFechaPapanicolaou = itemView.findViewById<Button>(R.id.bFechaPapanicolaou)
        val rbSiVPH = itemView.findViewById<RadioButton>(R.id.rbSiVPH)
        val rbNoVPH = itemView.findViewById<RadioButton>(R.id.rbNoVPH)
        val llCamposDeteccionVPH = itemView.findViewById<LinearLayout>(R.id.llCamposDeteccionVPH)
        val bFechaVPH = itemView.findViewById<Button>(R.id.bFechaVPH)
        val bConfirmar = itemView.findViewById<Button>(R.id.bConfirmar)
        val llCampos = itemView.findViewById<LinearLayout>(R.id.llCampos)

        init {
            rbNoPapanicolaou.isChecked = true
            llCamposPapanicolaou.visibility = View.GONE

            rbNoVPH.isChecked = true
            llCamposDeteccionVPH.visibility = View.GONE

            bDesplegar.setOnClickListener {
                llAntescedentes6.visibility = if (llAntescedentes6.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            rbSiPapanicolaou.setOnClickListener { llCamposPapanicolaou.visibility = View.VISIBLE }
            rbNoPapanicolaou.setOnClickListener { llCamposPapanicolaou.visibility = View.GONE }
            bFechaPapanicolaou.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { _, year, month, day ->
                    // TODO normalizar dia (1 ---> 01)
                    val fecha = "$year-$day-${month + 1}"
                    bFechaPapanicolaou.text = fecha
                })
            }

            rbSiVPH.setOnClickListener { llCamposDeteccionVPH.visibility = View.VISIBLE }
            rbNoVPH.setOnClickListener { llCamposDeteccionVPH.visibility = View.GONE }
            bFechaVPH.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { _, year, month, day ->
                    // TODO normalizar dia (1 ---> 01)
                    val fecha = "$year-$day-${month + 1}"
                    bFechaVPH.text = fecha
                })
            }

            bConfirmar.setOnClickListener {
                val texto = bConfirmar.text

                cambiarHabilitado(llCampos)

                if(texto == "Editar"){
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context)
            .inflate(R.layout.item_antescedentes_personales7, parent, false)
        return ViewHolder(view)
    }

}
