package com.xsas.appsaludtest.ui.adaptadores

import android.app.DatePickerDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.RadioButton
import androidx.recyclerview.widget.RecyclerView
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.ui.abrirDialogoFecha
import com.xsas.appsaludtest.ui.cambiarHabilitado

class AntescedentesPersonales4Adapter (val vistas: ArrayList<Any>, val context: Context) : RecyclerView.Adapter<AntescedentesPersonales4Adapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(itemView: View, val context: Context) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llAntescedentes4 = itemView.findViewById<LinearLayout>(R.id.llAntescedentes4)
        val bConfirmar = itemView.findViewById<Button>(R.id.bConfirmar)
        val llCampos = itemView.findViewById<LinearLayout>(R.id.llCampos)

        val rbSi = itemView.findViewById<RadioButton>(R.id.rbSi)
        val rbNo = itemView.findViewById<RadioButton>(R.id.rbNo)
        val llCamposEmbarazada = itemView.findViewById<LinearLayout>(R.id.llCamposEmbarazada)
        val bFUM = itemView.findViewById<Button>(R.id.bFUM)
        val bFPP = itemView.findViewById<Button>(R.id.bFPP)
        val etEdadGestional = itemView.findViewById<EditText>(R.id.etEdadGestional)
        val bMenarca = itemView.findViewById<Button>(R.id.bMenarca)

        init {
            bDesplegar.setOnClickListener {
                llAntescedentes4.visibility = if (llAntescedentes4.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            rbSi.setOnClickListener { llCamposEmbarazada.visibility = View.VISIBLE }
            rbNo.setOnClickListener { llCamposEmbarazada.visibility = View.GONE }

            bFUM.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { _, year, month, day ->
                    val fecha = "$year-$day-$month"
                    bFUM.text = fecha
                })
            }

            bFPP.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { _, year, month, day ->
                    val fecha = "$year-$day-$month"
                    bFPP.text = fecha
                })
            }

            bMenarca.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { _, year, month, day ->
                    val fecha = "$year-$day-$month"
                    bMenarca.text = fecha
                })
            }

            bConfirmar.setOnClickListener{
                val texto = bConfirmar.text

                cambiarHabilitado(llCampos)

                if(texto == "Editar"){
                    bConfirmar.text = "Confirmar"
                }else{
                    bConfirmar.text = "Editar"
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AntescedentesPersonales4Adapter.ViewHolder {
        val view: View = LayoutInflater.from(context)
            .inflate(R.layout.item_antescedentes_personales4, parent, false)
        return ViewHolder(view, context)
    }

}
