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

class AntescedentesPersonales3Adapter (val vistas: ArrayList<Any>, val context: Context) : RecyclerView.Adapter<AntescedentesPersonales3Adapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(itemView: View, val context: Context) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llAntescedentes3 = itemView.findViewById<LinearLayout>(R.id.llAntescedentes3)
        val llCampos = itemView.findViewById<LinearLayout>(R.id.llCampos)
        val bConfirmar = itemView.findViewById<Button>(R.id.bConfirmar)

        val sEnfermedadesInfancia = itemView.findViewById<Spinner>(R.id.sEnfermedadesInfancia)
        val fbEnfermedadesInfancia = itemView.findViewById<FlexboxLayout>(R.id.fbEnfermedadesInfancia)

        val sEnfermedadesAdultez = itemView.findViewById<Spinner>(R.id.sEnfermedadesAdulto)
        val fbEnfermedadesAdultez = itemView.findViewById<FlexboxLayout>(R.id.fbEnfermedadesAdultez)

        init {
            bDesplegar.setOnClickListener {
                llAntescedentes3.visibility = if (llAntescedentes3.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            val enfermedadesInfancia = listToArray(ConsultasGlobales.enfermedades)
            val enfermedadesInfanciaAdapter = ArrayAdapter(context, android.R.layout.simple_spinner_item, enfermedadesInfancia)
            sEnfermedadesInfancia.adapter = enfermedadesInfanciaAdapter
            sEnfermedadesInfancia.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(p0: AdapterView<*>?) { }
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, id: Long) {
                    val infeccion: String = enfermedadesInfancia[position]

                    // checar que no se haya agregado ya la adiccion seleccionada

                    if (fbEnfermedadesInfancia.children.any { buttonInfeccion -> (buttonInfeccion as Button).text == infeccion })
                        return

                    val layoutParams = FlexboxLayout.LayoutParams(FlexboxLayout.LayoutParams.WRAP_CONTENT, FlexboxLayout.LayoutParams.WRAP_CONTENT)
                    layoutParams.setMargins(5)

                    val button = Button(context)
                    button.layoutParams = layoutParams
                    button.text = infeccion
                    button.textSize = 12f
                    button.setBackgroundResource(R.drawable.boton_verde)
                    button.setPadding(10)
                    button.setOnClickListener { fbEnfermedadesInfancia.removeView(button) }

                    fbEnfermedadesInfancia.addView(button)
                }
            }

            val enfermedadesAdultez = listToArray(ConsultasGlobales.enfermedades)
            val enfermedadesAdultezAdapter = ArrayAdapter(context, android.R.layout.simple_spinner_item, enfermedadesAdultez)
            sEnfermedadesAdultez.adapter = enfermedadesAdultezAdapter
            sEnfermedadesAdultez.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(p0: AdapterView<*>?) { }
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, id: Long) {
                    val infeccion: String = enfermedadesAdultez[position]

                    // checar que no se haya agregado ya la adiccion seleccionada

                    if (fbEnfermedadesAdultez.children.any { buttonInfeccion -> (buttonInfeccion as Button).text == infeccion })
                        return

                    val layoutParams = FlexboxLayout.LayoutParams(FlexboxLayout.LayoutParams.WRAP_CONTENT, FlexboxLayout.LayoutParams.WRAP_CONTENT)
                    layoutParams.setMargins(5)

                    val button = Button(context)
                    button.layoutParams = layoutParams
                    button.text = infeccion
                    button.textSize = 12f
                    button.setBackgroundResource(R.drawable.boton_verde)
                    button.setPadding(10)
                    button.setOnClickListener { fbEnfermedadesAdultez.removeView(button) }

                    fbEnfermedadesAdultez.addView(button)
                }
            }

            bConfirmar.setOnClickListener{
                val texto = bConfirmar.text

                cambiarHabilitado(llCampos)

                if(texto == "Editar"){
                    bConfirmar.setText("Confirmar")
                }else{
                    bConfirmar.setText("Editar")
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AntescedentesPersonales3Adapter.ViewHolder {
        val view: View = LayoutInflater.from(context)
            .inflate(R.layout.item_antescedentes_personales3, parent, false)
        return AntescedentesPersonales3Adapter.ViewHolder(view, context)
    }


}
