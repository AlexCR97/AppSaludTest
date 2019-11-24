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
import com.xsas.appsaludtest.ui.abrirDialogoFecha

class DatosGenerales1Adapter(val vistas: ArrayList<Any>, val context: Context) : RecyclerView.Adapter<DatosGenerales1Adapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llDatosGenerales1 = itemView.findViewById<LinearLayout>(R.id.llDatosGenerales1)
        val bFechaNacimiento = itemView.findViewById<Button>(R.id.bFechaNacimiento)

        init {
            bDesplegar.setOnClickListener {
                llDatosGenerales1.visibility = if (llDatosGenerales1.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            bFechaNacimiento.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->

                })
            }
        }
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_datos_generales1, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }
}
