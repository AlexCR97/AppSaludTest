package com.ale.appsaludtest.ui.adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ale.appsaludtest.R
import com.ale.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente1
import com.ale.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente2
import com.ale.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente3
import com.ale.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente4

class EsquemaVacunacionAdolescente4Adapter(val vistas: ArrayList<EsquemaVacunacionAdolescente4>, val context: Context) : RecyclerView.Adapter<EsquemaVacunacionAdolescente4Adapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

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
