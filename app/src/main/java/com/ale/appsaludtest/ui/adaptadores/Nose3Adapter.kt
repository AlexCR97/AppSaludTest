package com.ale.appsaludtest.ui.adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.ale.appsaludtest.R

class Nose3Adapter (val vistas: ArrayList<Any>, val context: Context) : RecyclerView.Adapter<Nose3Adapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llNose3 = itemView.findViewById<LinearLayout>(R.id.llNose3)

        init {
            bDesplegar.setOnClickListener {
                llNose3.visibility = if (llNose3.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }
        }
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Nose3Adapter.ViewHolder {
        val view: View = LayoutInflater.from(context)
            .inflate(R.layout.item_nose3, parent, false)
        return Nose3Adapter.ViewHolder(view)
    }


}
