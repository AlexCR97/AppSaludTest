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
import com.xsas.appsaludtest.ui.cambiarHabilitado

class EsquemaVacunacionNino4Adapter(val vistas: ArrayList<EsquemaVacunacionNino4>, val context: Context) : RecyclerView.Adapter<EsquemaVacunacionNino4Adapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val lista = itemView.findViewById<LinearLayout>(R.id.llEsquemaVacunacionNino4)

        val bFechaVacunacionNinoDptRefuerzo = itemView.findViewById<Button>(R.id.bFechaVacunacionNinoDptRefuerzo)
        val bFechaVacunacionNinoRotavirusPrimera = itemView.findViewById<Button>(R.id.bFechaVacunacionNinoRotavirusPrimera)
        val bFechaVacunacionNinoRotavirusSegunda = itemView.findViewById<Button>(R.id.bFechaVacunacionNinoRotavirusSegunda)
        val bFechaVacunacionNinoRotavirusTercera = itemView.findViewById<Button>(R.id.bFechaVacunacionNinoRotavirusTercera)
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

            bFechaVacunacionNinoDptRefuerzo.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->
                    val fecha = "$year-$day-$month"
                    bFechaVacunacionNinoDptRefuerzo.text = fecha
                })
            }
            bFechaVacunacionNinoRotavirusPrimera.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->
                    val fecha = "$year-$day-$month"
                    bFechaVacunacionNinoRotavirusPrimera.text = fecha
                })
            }

            bFechaVacunacionNinoRotavirusSegunda.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->
                    val fecha = "$year-$day-$month"
                    bFechaVacunacionNinoRotavirusSegunda.text = fecha
                })
            }

            bFechaVacunacionNinoRotavirusTercera.setOnClickListener {
                abrirDialogoFecha(itemView.context, DatePickerDialog.OnDateSetListener { view, year, month, day ->
                    val fecha = "$year-$day-$month"
                    bFechaVacunacionNinoRotavirusTercera.text = fecha
                })
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_esquema_vacunacion_nino4, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

}
