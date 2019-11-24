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
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente2
import com.xsas.appsaludtest.ui.abrirDialogoFecha

class EsquemaVacunacionAdolescente2Adapter(val vistas: ArrayList<EsquemaVacunacionAdolescente2>, val context: Context) : RecyclerView.Adapter<EsquemaVacunacionAdolescente2Adapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val lista = itemView.findViewById<LinearLayout>(R.id.llEsquemaVacunacionAdolescente2)

        val bFechaVacunacionAdolescenteTdRefuerzo = itemView.findViewById<Button>(R.id.bFechaVacunacionAdolescenteTdRefuerzo)
        val bFechaVacunacionAdolescenteTdSegunda = itemView.findViewById<Button>(R.id.bFechaVacunacionAdolescenteTdSegunda)

        init {
            bDesplegar.setOnClickListener {
                lista.visibility = if (lista.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            bFechaVacunacionAdolescenteTdRefuerzo.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->

                })
            }

            bFechaVacunacionAdolescenteTdSegunda.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->

                })
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_esquema_vacunacion_adolescente2, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

}
