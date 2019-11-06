package com.ale.appsaludtest.ui.adaptadores

import android.app.DatePickerDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.ale.appsaludtest.R
import com.ale.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente1
import com.ale.appsaludtest.ui.abrirDialogoFecha

class EsquemaVacunacionAdolescente1Adapter(val vistas: ArrayList<EsquemaVacunacionAdolescente1>, val context: Context) : RecyclerView.Adapter<EsquemaVacunacionAdolescente1Adapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            val bFechaVacunacionHepatitisBPrimera = itemView.findViewById<Button>(R.id.bFechaVacunacionHepatitisBPrimera)
            val bFechaVacunacionHepatitisBSegunda = itemView.findViewById<Button>(R.id.bFechaVacunacionHepatitisBSegunda)

            bFechaVacunacionHepatitisBPrimera.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->

                })
            }

            bFechaVacunacionHepatitisBSegunda.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->

                })
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_esquema_vacunacion_adolescente1, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

}
