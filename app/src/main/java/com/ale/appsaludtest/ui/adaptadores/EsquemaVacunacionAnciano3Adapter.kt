package com.ale.appsaludtest.ui.adaptadores

import android.app.DatePickerDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.ale.appsaludtest.R
import com.ale.appsaludtest.datos.vistas.*
import com.ale.appsaludtest.ui.abrirDialogoFecha

class EsquemaVacunacionAnciano3Adapter(val vistas: ArrayList<EsquemaVacunacionAnciano3>, val context: Context) : RecyclerView.Adapter<EsquemaVacunacionAnciano3Adapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val lista = itemView.findViewById<LinearLayout>(R.id.llEsquemaVacunacionAnciano3)

        val bFechaVacunacionAncianoInfluenzaEstacionalUna = itemView.findViewById<Button>(R.id.bFechaVacunacionAncianoInfluenzaEstacionalUna)

        init {
            bDesplegar.setOnClickListener {
                lista.visibility = if (lista.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            bFechaVacunacionAncianoInfluenzaEstacionalUna.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->

                })
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_esquema_vacunacion_anciano3, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

}