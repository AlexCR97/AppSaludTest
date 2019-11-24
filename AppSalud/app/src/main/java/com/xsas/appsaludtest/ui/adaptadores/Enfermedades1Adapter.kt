package com.xsas.appsaludtest.ui.adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.xsas.appsaludtest.R

class Enfermedades1Adapter (val vistas: ArrayList<Any>, val context: Context) : RecyclerView.Adapter<Enfermedades1Adapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llEnfermedades1 = itemView.findViewById<LinearLayout>(R.id.llEnfermedades1)

        init {
            bDesplegar.setOnClickListener {
                llEnfermedades1.visibility = if (llEnfermedades1.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }
        }
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Enfermedades1Adapter.ViewHolder {
        val view: View = LayoutInflater.from(context)
            .inflate(R.layout.item_enfermedades1, parent, false)
        return Enfermedades1Adapter.ViewHolder(view)
    }


}
