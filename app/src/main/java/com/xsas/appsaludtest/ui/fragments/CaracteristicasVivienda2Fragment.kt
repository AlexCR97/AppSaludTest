package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.xsas.appsaludtest.R
import kotlinx.android.synthetic.main.fragment_caracteristicas_vivienda2.*

class CaracteristicasVivienda2Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_caracteristicas_vivienda2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bAgua.setOnClickListener{

            val items = arrayOf("Red publica dentro de la vivienda", "Embalada en el terreno", "Llave pública","De otra vivienda"," De una pipa", "Pozo de terreno", "Rio, lago, lago, pozo o presa", "Comprado en garrafon")
            val selectedList = ArrayList<Int>()
            val builder = AlertDialog.Builder(activity!!)

            builder.setTitle("Tipo de Agua")
            builder.setSingleChoiceItems(items,-1){dialogInterface, i ->
                bAgua.text  = items[i]
                dialogInterface.dismiss()
            }

            builder.show()
        }
        bDrenaje.setOnClickListener{

            val items = arrayOf("Red pública", "Fosa séptica", "Tuberia a barranca o grieta", "Tuberia a lago, rio, o mar")
            val selectedList = ArrayList<Int>()
            val builder = AlertDialog.Builder(activity!!)

            builder.setTitle("Tipo de drenaje")
            builder.setSingleChoiceItems(items,-1){dialogInterface, i ->
                bDrenaje.text  = items[i]
                dialogInterface.dismiss()
            }

            builder.show()
        }
        bOrigen.setOnClickListener{

            val items = arrayOf("Energia Electrica", "Celda solar", "Lampara de baterias", "Velas o veladores", "Quinque", "Energia electrica combinda con Celda solar, quinque velas")
            val selectedList = ArrayList<Int>()
            val builder = AlertDialog.Builder(activity!!)

            builder.setTitle("Origen de la luz")
            builder.setSingleChoiceItems(items,-1){dialogInterface, i ->
                bOrigen.text  = items[i]
                dialogInterface.dismiss()
            }



            builder.show()
        }
    }
}