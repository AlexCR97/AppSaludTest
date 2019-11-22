package com.xsas.appsaludtest.ui.adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.LinearLayout
import androidx.core.view.children
import androidx.recyclerview.widget.RecyclerView
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.ui.cambiarHabilitado

class AntescedentesPersonales2Adapter (val vistas: ArrayList<Any>, val context: Context) : RecyclerView.Adapter<AntescedentesPersonales2Adapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llAntescedentes2 = itemView.findViewById<LinearLayout>(R.id.llAntescedentes2)

        val llAntescedentes2Carnes = itemView.findViewById<LinearLayout>(R.id.llAntescedentes2Carnes)
        val llAntescedentes2Verduras = itemView.findViewById<LinearLayout>(R.id.llAntescedentes2Verduras)
        val llAntescedentes2Frutas = itemView.findViewById<LinearLayout>(R.id.llAntescedentes2Frutas)

        val cbCarnes = itemView.findViewById<CheckBox>(R.id.cbCarnes)
        val cbVerduras = itemView.findViewById<CheckBox>(R.id.cbVerduras)
        val cbFrutas = itemView.findViewById<CheckBox>(R.id.cdFrutas)

        val bConfirmar = itemView.findViewById<Button>(R.id.bConfirmar)
        val llCampos = itemView.findViewById<LinearLayout>(R.id.llCampos)

        init {
            llAntescedentes2Carnes.visibility = View.GONE
            llAntescedentes2Verduras.visibility = View.GONE
            llAntescedentes2Frutas.visibility = View.GONE

                bConfirmar.setOnClickListener{
                    val texto = bConfirmar.getText()

                    cambiarHabilitado(llCampos)

                    if(texto.equals("Editar")){
                        bConfirmar.setText("Confirmar")
                    }else{
                        bConfirmar.setText("Editar")
                    }

                }


            bDesplegar.setOnClickListener {
                llAntescedentes2.visibility = if (llAntescedentes2.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            cbCarnes.setOnClickListener {
                llAntescedentes2Carnes.visibility = if (llAntescedentes2Carnes.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            cbVerduras.setOnClickListener {
                llAntescedentes2Verduras.visibility = if (llAntescedentes2Verduras.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            cbFrutas.setOnClickListener {
                llAntescedentes2Frutas.visibility = if (llAntescedentes2Frutas.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }
        }
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AntescedentesPersonales2Adapter.ViewHolder {
        val view: View = LayoutInflater.from(context)
            .inflate(R.layout.item_antescedentes_personales2, parent, false)
        return AntescedentesPersonales2Adapter.ViewHolder(view)
    }


}