package com.xsas.appsaludtest.ui.adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.xsas.appsaludtest.R

class AntescedentesPersonales4Adapter (val vistas: ArrayList<Any>, val context: Context) : RecyclerView.Adapter<AntescedentesPersonales4Adapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llAntescedentes4 = itemView.findViewById<LinearLayout>(R.id.llAntescedentes4)

        init {
            bDesplegar.setOnClickListener {
                llAntescedentes4.visibility = if (llAntescedentes4.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }
        }
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AntescedentesPersonales4Adapter.ViewHolder {
        val view: View = LayoutInflater.from(context)
            .inflate(R.layout.item_antescedentes_personales4, parent, false)
        return AntescedentesPersonales4Adapter.ViewHolder(view)
    }


}