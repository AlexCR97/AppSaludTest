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
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente4
import com.xsas.appsaludtest.ui.abrirDialogoFecha
import com.xsas.appsaludtest.ui.cambiarHabilitado

class EsquemaVacunacionAdolescente4Adapter(val vistas: ArrayList<EsquemaVacunacionAdolescente4>, val context: Context) : RecyclerView.Adapter<EsquemaVacunacionAdolescente4Adapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val lista = itemView.findViewById<LinearLayout>(R.id.llEsquemaVacunacionAdolescente4)

        val bFechaVacunacionAdolescenteInfluenzaEstacionalUnica = itemView.findViewById<Button>(R.id.bFechaVacunacionAdolescenteInfluenzaEstacionalUnica)
        val bConfirmar = itemView.findViewById<Button>(R.id.bConfirmar)
        val llCampos = itemView.findViewById<LinearLayout>(R.id.llCampos)

        init {
            bDesplegar.setOnClickListener {
                lista.visibility = if (lista.visibility == View.VISIBLE) View.GONE else View.VISIBLE
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

            bFechaVacunacionAdolescenteInfluenzaEstacionalUnica.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->
                    val fecha = "$year-$day-$month"
                    bFechaVacunacionAdolescenteInfluenzaEstacionalUnica.text = fecha
                })
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_esquema_vacunacion_adolescente4, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

}
