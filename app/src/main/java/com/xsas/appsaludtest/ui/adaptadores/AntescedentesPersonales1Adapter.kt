package com.xsas.appsaludtest.ui.adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.view.children
import androidx.core.view.setMargins
import androidx.core.view.setPadding
import androidx.recyclerview.widget.RecyclerView
import com.google.android.flexbox.FlexboxLayout
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.ui.ConsultasGlobales
import com.xsas.appsaludtest.ui.cambiarHabilitado
import com.xsas.appsaludtest.ui.listToArray

class AntescedentesPersonales1Adapter (val vistas: ArrayList<Any>, val context: Context) : RecyclerView.Adapter<AntescedentesPersonales1Adapter.ViewHolder>() {

    class ViewHolder(itemView: View, val context: Context) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val bConfirmar = itemView.findViewById<Button>(R.id.bConfirmar)
        val llAntescedentes1 = itemView.findViewById<LinearLayout>(R.id.llAntescedentes1)
        val llCampos = itemView.findViewById<LinearLayout>(R.id.llCampos)
        var rgRadio1 = itemView.findViewById<RadioGroup>(R.id.rgRadio1)
        val rbSi = itemView.findViewById<RadioButton>(R.id.rbSi)
        val rbNo = itemView.findViewById<RadioButton>(R.id.rbNo)
        val tvCausas = itemView.findViewById<TextView>(R.id.tvCausasFallecimiento)
        val sInfecciones = itemView.findViewById<Spinner>(R.id.sInfecciones)
        val fbInfecciones = itemView.findViewById<FlexboxLayout>(R.id.fbInfecciones)

        init {
            bDesplegar.setOnClickListener {
                llAntescedentes1.visibility = if (llAntescedentes1.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            tvCausas.visibility = View.GONE
            sInfecciones.visibility = View.GONE
            fbInfecciones.visibility = View.GONE

            val infecciones = listToArray(ConsultasGlobales.infecciones)
            val infeccionesAdapter = ArrayAdapter(context, android.R.layout.simple_spinner_item, infecciones)
            sInfecciones.adapter = infeccionesAdapter
            sInfecciones.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(p0: AdapterView<*>?) { }
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, id: Long) {
                    val infeccion: String = infecciones[position]

                    // checar que no se haya agregado ya la adiccion seleccionada

                    if (fbInfecciones.children.any { buttonInfeccion -> (buttonInfeccion as Button).text == infeccion })
                        return

                    val layoutParams = FlexboxLayout.LayoutParams(FlexboxLayout.LayoutParams.WRAP_CONTENT, FlexboxLayout.LayoutParams.WRAP_CONTENT)
                    layoutParams.setMargins(5)

                    val button = Button(context)
                    button.layoutParams = layoutParams
                    button.text = infeccion
                    button.textSize = 12f
                    button.setBackgroundResource(R.drawable.boton_verde)
                    button.setPadding(10)
                    button.setOnClickListener { fbInfecciones.removeView(button) }

                    fbInfecciones.addView(button)
                }
            }

            rbSi.setOnClickListener {
                tvCausas.visibility = View.GONE
                sInfecciones.visibility = View.GONE
                fbInfecciones.visibility = View.GONE
            }

            rbNo.setOnClickListener {
                tvCausas.visibility = View.VISIBLE
                sInfecciones.visibility = View.VISIBLE
                fbInfecciones.visibility = View.VISIBLE
            }

            bConfirmar.setOnClickListener{
                val texto = bConfirmar.text

                cambiarHabilitado(llCampos)

                if(texto.equals("Editar")){
                    bConfirmar.text = "Confirmar"
                }else{
                    bConfirmar.text = "Editar"
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_antescedentes_personales1, parent, false)
        return ViewHolder(view, context)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }
}
