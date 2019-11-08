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

class EsquemaVacunacionAdultoMujer2Adapter(val vistas: ArrayList<EsquemaVacunacionAdultoMujer2>, val context: Context) : RecyclerView.Adapter<EsquemaVacunacionAdultoMujer2Adapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val lista = itemView.findViewById<LinearLayout>(R.id.llEsquemaVacunacionAdultoMujer2)

        val bFechaVacunacionAdultoMujerTdRefuerzo = itemView.findViewById<Button>(R.id.bFechaVacunacionAdultoMujerTdRefuerzo)
        val bFechaVacunacionAdultoMujerTdPrimera = itemView.findViewById<Button>(R.id.bFechaVacunacionAdultoMujerTdPrimera)
        val bFechaVacunacionAdultoMujerTdSegunda = itemView.findViewById<Button>(R.id.bFechaVacunacionAdultoMujerTdSegunda)
        val bFechaVacunacionAdultoMujerTdTercera = itemView.findViewById<Button>(R.id.bFechaVacunacionAdultoMujerTdTercera)

        init {
            bDesplegar.setOnClickListener {
                lista.visibility = if (lista.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            bFechaVacunacionAdultoMujerTdRefuerzo.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->

                })
            }

            bFechaVacunacionAdultoMujerTdPrimera.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->

                })
            }

            bFechaVacunacionAdultoMujerTdSegunda.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->

                })
            }

            bFechaVacunacionAdultoMujerTdTercera.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->

                })
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_esquema_vacunacion_adulto_mujer2, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

}
