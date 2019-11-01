package com.ale.appsaludtest.ui.adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ale.appsaludtest.R
import com.ale.appsaludtest.entidades.DatosPersonales
import kotlinx.android.synthetic.main.item_datos_personales.view.*

class DatosPersonalesAdapter(val datosPersonales: ArrayList<DatosPersonales>, val context: Context) : RecyclerView.Adapter<DatosPersonalesAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.bDesplegar
        val llDatosPersonales = itemView.llDatosPersonales
        val etNombres = itemView.etNombres
        val etApellidoPaterno = itemView.etApellidoPaterno
        val etApellidoMaterno = itemView.etApellidoMaterno
        val rgSexo = itemView.rgSexo
        val bFechaNacimiento = itemView.bFechaNacimiento

        init {
            bDesplegar.setOnClickListener {
                llDatosPersonales.visibility = if (llDatosPersonales.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }
        }
    }

    override fun getItemCount(): Int {
        return datosPersonales.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_datos_personales, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dp: DatosPersonales = datosPersonales[position]

        holder.etNombres.setText(dp.nombres)
        holder.etApellidoPaterno.setText(dp.apellidoPaterno)
        holder.etApellidoMaterno.setText(dp.apellidoMaterno)
    }

}
