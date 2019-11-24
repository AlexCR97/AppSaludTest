package com.xsas.appsaludtest.ui.adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.xsas.appsaludtest.R

class Cancer1Adapter (val vistas: ArrayList<Any>, val context: Context) : RecyclerView.Adapter<Cancer1Adapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llCancer1 = itemView.findViewById<LinearLayout>(R.id.llCancer1)

        init {
            bDesplegar.setOnClickListener {
                llCancer1.visibility = if (llCancer1.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }
        }
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Cancer1Adapter.ViewHolder {
        val view: View = LayoutInflater.from(context)
            .inflate(R.layout.item_cancer1, parent, false)
        return Cancer1Adapter.ViewHolder(view)
    }


}
