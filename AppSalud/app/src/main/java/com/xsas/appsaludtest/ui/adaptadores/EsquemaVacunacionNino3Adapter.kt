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

class EsquemaVacunacionNino3Adapter(val vistas: ArrayList<EsquemaVacunacionNino3>, val context: Context) : RecyclerView.Adapter<EsquemaVacunacionNino3Adapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val lista = itemView.findViewById<LinearLayout>(R.id.llEsquemaVacunacionNino3)

        val bFechaVacunacionNinoPentavalentePrimera = itemView.findViewById<Button>(R.id.bFechaVacunacionNinoPentavalentePrimera)
        val bFechaVacunacionNinoPentavalenteSegunda = itemView.findViewById<Button>(R.id.bFechaVacunacionNinoPentavalenteSegunda)
        val bFechaVacunacionNinoPentavalenteTercera = itemView.findViewById<Button>(R.id.bFechaVacunacionNinoPentavalenteTercera)
        val bFechaVacunacionNinoPentavalenteCuarta = itemView.findViewById<Button>(R.id.bFechaVacunacionNinoPentavalenteCuarta)

        init {
            bDesplegar.setOnClickListener {
                lista.visibility = if (lista.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            bFechaVacunacionNinoPentavalentePrimera.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->

                })
            }

            bFechaVacunacionNinoPentavalenteSegunda.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->

                })
            }

            bFechaVacunacionNinoPentavalenteTercera.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->

                })
            }

            bFechaVacunacionNinoPentavalenteCuarta.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->

                })
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_esquema_vacunacion_nino3, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

}
