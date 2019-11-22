package com.xsas.appsaludtest.ui.adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.Otros1
import com.xsas.appsaludtest.ui.cambiarHabilitado

class Otros1Adapter(val vistas: ArrayList<Otros1>, val context: Context) : RecyclerView.Adapter<Otros1Adapter.ViewHolder>() {

    companion object {
        const val TIPO_BEBE = 1
        const val TIPO_ADULTO = 2
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llOtros = itemView.findViewById<LinearLayout>(R.id.llOtros1)
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
                llOtros.visibility = if (llOtros.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }
        }
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun getItemViewType(position: Int): Int {
        return vistas[position].tipoVista
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(when (viewType) {
            TIPO_BEBE -> R.layout.item_otros1_bebe
            TIPO_ADULTO -> R.layout.item_otros1_adulto
            else -> -1
        }, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

}
