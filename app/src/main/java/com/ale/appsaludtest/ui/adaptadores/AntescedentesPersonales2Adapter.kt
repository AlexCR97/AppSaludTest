package com.ale.appsaludtest.ui.adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.ale.appsaludtest.R

class AntescedentesPersonales2Adapter (val vistas: ArrayList<Any>, val context: Context) : RecyclerView.Adapter<AntescedentesPersonales2Adapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llAntescedentes2 = itemView.findViewById<LinearLayout>(R.id.llAntescedentes2)

        init {
            bDesplegar.setOnClickListener {
                llAntescedentes2.visibility = if (llAntescedentes2.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }
        }
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AntescedentesPersonales2Adapter.ViewHolder {
        val view: View = LayoutInflater.from(context)
            .inflate(R.layout.item_antescedentes_personales2, parent, false)
        return AntescedentesPersonales2Adapter.ViewHolder(view)
    }


}