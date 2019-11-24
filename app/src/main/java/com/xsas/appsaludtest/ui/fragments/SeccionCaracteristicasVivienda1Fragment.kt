package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.xsas.appsaludtest.R
import kotlinx.android.synthetic.main.fragment_seccion_caracteristicas_vivienda1.*
import java.util.*
import kotlin.collections.ArrayList

class SeccionCaracteristicasVivienda1Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_seccion_caracteristicas_vivienda1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bVivienda.setOnClickListener{

            val items = arrayOf("Propia", "Rentada", "Prestada", "Como prestación de trabajo")
            val builder = AlertDialog.Builder(activity!!)

            builder.setTitle("Tipo de vivienda")
            builder.setSingleChoiceItems(items,-1){dialogInterface, i ->
                bVivienda.text  = items[i]
                dialogInterface.dismiss()
            }

            builder.show()
        }
        bMuros.setOnClickListener{

            val items = arrayOf("Lamina","Madera","Block","Adobe","Ladrillo","Cartón","Hule","Lodo")
            val selectedList = ArrayList<Int>()
            val builder = AlertDialog.Builder(activity!!)

            builder.setTitle("Tipo de vivienda")
            builder.setSingleChoiceItems(items,-1){dialogInterface, i ->
                bMuros.text  = items[i]
                dialogInterface.dismiss()
            }



            builder.show()
        }
        bTechos.setOnClickListener{
            val items = arrayOf("Lamina","Teja", "Palma", "Asbesto", "Cemento", "Cartón","Hule","Madera")
            val selectedList = ArrayList<Int>()
            val builder = AlertDialog.Builder(activity!!)

            builder.setTitle("Tipo de vivienda")
            builder.setSingleChoiceItems(items,-1){dialogInterface, i ->
                bTechos.text  = items[i]
                dialogInterface.dismiss()
            }



            builder.show()
        }
        bPisos.setOnClickListener{
            val items = arrayOf("Tierra", "Cemento", "Mosaico", "Madera")
            val selectedList = ArrayList<Int>()
            val builder = AlertDialog.Builder(activity!!)

            builder.setTitle("Tipo de vivienda")
            builder.setSingleChoiceItems(items,-1){dialogInterface, i ->
                bPisos.text  = items[i]
                dialogInterface.dismiss()
            }



            builder.show()
        }
        bCuenta.setOnClickListener{
            val items = arrayOf("Recamaras", "Comedor", "Sala", "Cocina", "Regadera", "Latrina", "Pasillo", "Patio", "Cochera", "Sanitarioawww")
            val selectedList = ArrayList<Int>()
            val builder = AlertDialog.Builder(activity!!)

            builder.setTitle("Su vivienda cuenta con:")
            builder.setMultiChoiceItems(items, null
            ) { dialog, which, isChecked ->
                if (isChecked) {
                    selectedList.add(which)
                } else if (selectedList.contains(which)) {
                    selectedList.remove(Integer.valueOf(which))
                }
            }

            builder.setPositiveButton("Listo") { dialogInterface, i ->
                val selectedStrings = ArrayList<String>()

                for (j in selectedList.indices) {
                    selectedStrings.add(items[selectedList[j]])
                }

                Toast.makeText(activity!!, "Seleccionados: " + Arrays.toString(selectedStrings.toTypedArray()), Toast.LENGTH_SHORT).show()
            }

            builder.show()
        }
    }
}


