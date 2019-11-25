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

class Cancer2Adapter (val vistas: ArrayList<Any>, val context: Context) : RecyclerView.Adapter<Cancer2Adapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llCancer2 = itemView.findViewById<LinearLayout>(R.id.llCancer2)
        val bConfirmar = itemView.findViewById<Button>(R.id.bConfirmar)
        val llCampos = itemView.findViewById<LinearLayout>(R.id.llCampos)

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
                llCancer2.visibility = if (llCancer2.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }
        }
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Cancer2Adapter.ViewHolder {
        val view: View = LayoutInflater.from(context)
            .inflate(R.layout.item_cancer2, parent, false)
        return Cancer2Adapter.ViewHolder(view)
    }


}
