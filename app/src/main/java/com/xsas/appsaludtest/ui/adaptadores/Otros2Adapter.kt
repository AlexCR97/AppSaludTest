package com.xsas.appsaludtest.ui.adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.view.children
import androidx.core.view.marginBottom
import androidx.core.view.setMargins
import androidx.core.view.setPadding
import androidx.recyclerview.widget.RecyclerView
import com.google.android.flexbox.FlexboxLayout
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.Otros2
import com.xsas.appsaludtest.ui.ConsultasGlobales
import com.xsas.appsaludtest.ui.cambiarHabilitado
import com.xsas.appsaludtest.ui.listToArray

class Otros2Adapter(val vistas: ArrayList<Otros2>, val context: Context) : RecyclerView.Adapter<Otros2Adapter.ViewHolder>() {

    class ViewHolder(itemView: View, val context: Context) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val llOtros2 = itemView.findViewById<LinearLayout>(R.id.llOtros2)
        val sAdicciones = itemView.findViewById<Spinner>(R.id.sAdicciones)
        val fbAdicciones = itemView.findViewById<FlexboxLayout>(R.id.fbAdcciones)
        val sDiscapacidades = itemView.findViewById<Spinner>(R.id.sDiscapacidades)
        val fbDiscapacidades = itemView.findViewById<FlexboxLayout>(R.id.fbDiscapacidades)
        val bConfirmar = itemView.findViewById<Button>(R.id.bConfirmar)
        val llCampos = itemView.findViewById<LinearLayout>(R.id.llCampos)

        init {
            bDesplegar.setOnClickListener {
                llOtros2.visibility = if (llOtros2.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            val adicciones = listToArray(ConsultasGlobales.adicciones!!)
            val adiccionesAdapter = ArrayAdapter(context, android.R.layout.simple_spinner_item, adicciones)
            sAdicciones.adapter = adiccionesAdapter
            sAdicciones.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(p0: AdapterView<*>?) { }
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, id: Long) {
                    val adiccion: String = adicciones[position]

                    // checar que no se haya agregado ya la adiccion seleccionada

                    if (fbAdicciones.children.any { buttonAdiccion -> (buttonAdiccion as Button).text == adiccion })
                        return

                    val layoutParams = FlexboxLayout.LayoutParams(FlexboxLayout.LayoutParams.WRAP_CONTENT, FlexboxLayout.LayoutParams.WRAP_CONTENT)
                    layoutParams.setMargins(5)

                    val button = Button(context)
                    button.layoutParams = layoutParams
                    button.text = adiccion
                    button.textSize = 12f
                    button.setBackgroundResource(R.drawable.boton_verde)
                    button.setPadding(10)
                    button.setOnClickListener { fbAdicciones.removeView(button) }

                    fbAdicciones.addView(button)
                }
            }

            val discapacidades = listToArray(ConsultasGlobales.discapacidades!!)
            val discapacidadesAdapter = ArrayAdapter(context, android.R.layout.simple_spinner_item, discapacidades)
            sDiscapacidades.adapter = discapacidadesAdapter
            sDiscapacidades.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(p0: AdapterView<*>?) { }
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, id: Long) {
                    val discapacidad: String = discapacidades[position]

                    // checar que no se haya agregado ya la adiccion seleccionada

                    if (fbDiscapacidades.children.any { buttonDiscapacidad -> (buttonDiscapacidad as Button).text == discapacidad })
                        return

                    val layoutParams = FlexboxLayout.LayoutParams(FlexboxLayout.LayoutParams.WRAP_CONTENT, FlexboxLayout.LayoutParams.WRAP_CONTENT)
                    layoutParams.setMargins(5)

                    val button = Button(context)
                    button.layoutParams = layoutParams
                    button.text = discapacidad
                    button.textSize = 12f
                    button.setBackgroundResource(R.drawable.boton_verde)
                    button.setPadding(10)
                    button.setOnClickListener { fbDiscapacidades.removeView(button) }

                    fbDiscapacidades.addView(button)
                }
            }

            bConfirmar.setOnClickListener{
                val texto = bConfirmar.getText()

                cambiarHabilitado(llCampos)

                if(texto.equals("Editar")){
                    bConfirmar.setText("Confirmar")
                }else{
                    bConfirmar.setText("Editar")
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_otros2, parent, false)
        return ViewHolder(view, context)
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }
}
