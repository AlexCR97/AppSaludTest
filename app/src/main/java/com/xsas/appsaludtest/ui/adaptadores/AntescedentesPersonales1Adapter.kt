package com.xsas.appsaludtest.ui.adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.view.children
import androidx.recyclerview.widget.RecyclerView
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.ui.cambiarHabilitado

class AntescedentesPersonales1Adapter (val vistas: ArrayList<Any>, val context: Context) : RecyclerView.Adapter<AntescedentesPersonales1Adapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val bConfirmar = itemView.findViewById<Button>(R.id.bConfirmar)
        val llAntescedentes1 = itemView.findViewById<LinearLayout>(R.id.llAntescedentes1)
        val llCampos = itemView.findViewById<LinearLayout>(R.id.llCampos)
        var rgRadio1 = itemView.findViewById<RadioGroup>(R.id.rgRadio1)
        val rb1 = itemView.findViewById<RadioButton>(R.id.rb1)
        val rb2 = itemView.findViewById<RadioButton>(R.id.rb2)
        val etCausas = itemView.findViewById<EditText>(R.id.etCausas)

        init {
            bDesplegar.setOnClickListener {
                llAntescedentes1.visibility = if (llAntescedentes1.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }
            bConfirmar.setOnClickListener{
                val texto = bConfirmar.getText()

                cambiarHabilitado(llCampos)

                if(texto.equals("Editar")){
                    bConfirmar.setText("Confirmar")
                }else{
                    bConfirmar.setText("Editar")
                }

            }
        }
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AntescedentesPersonales1Adapter.ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_antescedentes_personales1, parent, false)

        return AntescedentesPersonales1Adapter.ViewHolder(view)
    }

}
