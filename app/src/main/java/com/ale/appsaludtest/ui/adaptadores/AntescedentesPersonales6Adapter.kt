package com.ale.appsaludtest.ui.adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.ale.appsaludtest.R

class AntescedentesPersonales6Adapter (val vistas: ArrayList<Any>, val context: Context) : RecyclerView.Adapter<AntescedentesPersonales6Adapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llAntescedentes6 = itemView.findViewById<LinearLayout>(R.id.llAntescedentes6)

        init {
            bDesplegar.setOnClickListener {
                llAntescedentes6.visibility = if (llAntescedentes6.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }
        }
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AntescedentesPersonales6Adapter.ViewHolder {
        val view: View = LayoutInflater.from(context)
            .inflate(R.layout.item_antescedentes_personales7, parent, false)
        return AntescedentesPersonales6Adapter.ViewHolder(view)
    }


}