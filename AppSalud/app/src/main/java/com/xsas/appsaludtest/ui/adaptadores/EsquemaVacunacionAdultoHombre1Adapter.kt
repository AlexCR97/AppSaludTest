package com.xsas.appsaludtest.ui.adaptadores

import android.app.DatePickerDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.*
import com.xsas.appsaludtest.ui.abrirDialogoFecha

class EsquemaVacunacionAdultoHombre1Adapter(val vistas: ArrayList<EsquemaVacunacionAdultoHombre1>, val context: Context) : RecyclerView.Adapter<EsquemaVacunacionAdultoHombre1Adapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val lista = itemView.findViewById<LinearLayout>(R.id.llEsquemaVacunacionAdultoHombre1)

        val bFechaVacunacionAdultoHombreSrPrimera = itemView.findViewById<Button>(R.id.bFechaVacunacionAdultoHombreSrPrimera)
        val bFechaVacunacionAdultoHombreSegunda = itemView.findViewById<Button>(R.id.bFechaVacunacionAdultoHombreSegunda)
        val bFechaVacunacionAdultoHombreSrPrimeraEsquemaIncompleto = itemView.findViewById<Button>(R.id.bFechaVacunacionAdultoHombreSrPrimeraEsquemaIncompleto)

        init {
            bDesplegar.setOnClickListener {
                lista.visibility = if (lista.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            bFechaVacunacionAdultoHombreSrPrimera.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->

                })
            }

            bFechaVacunacionAdultoHombreSegunda.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->

                })
            }

            bFechaVacunacionAdultoHombreSrPrimeraEsquemaIncompleto.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->

                })
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_esquema_vacunacion_adulto_hombre1, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

}
