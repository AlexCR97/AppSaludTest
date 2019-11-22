package com.xsas.appsaludtest.ui.adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.ui.cambiarHabilitado

class AntescedentesPersonales3Adapter (val vistas: ArrayList<Any>, val context: Context) : RecyclerView.Adapter<AntescedentesPersonales3Adapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llAntescedentes3 = itemView.findViewById<LinearLayout>(R.id.llAntescedentes3)
        val llCampos = itemView.findViewById<LinearLayout>(R.id.llCampos)
        val bConfirmar = itemView.findViewById<Button>(R.id.bConfirmar)

        init {
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
                llAntescedentes3.visibility = if (llAntescedentes3.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

        }
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AntescedentesPersonales3Adapter.ViewHolder {
        val view: View = LayoutInflater.from(context)
            .inflate(R.layout.item_antescedentes_personales3, parent, false)
        return AntescedentesPersonales3Adapter.ViewHolder(view)
    }


}
