package com.xsas.appsaludtest.ui.adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.recyclerview.widget.RecyclerView
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacion
import com.xsas.appsaludtest.ui.EncuestaSingleton
import com.xsas.appsaludtest.ui.cambiarHabilitado
import com.xsas.appsaludtest.ui.modelos.SeccionEsquemaVacunacionViewModel

class EsquemaVacunacionAdapter(val vistas: List<EsquemaVacunacion>, val context: Context, val viewModel: SeccionEsquemaVacunacionViewModel) : RecyclerView.Adapter<EsquemaVacunacionAdapter.ViewHolder>() {

    class ViewHolder(itemView: View, viewModel: SeccionEsquemaVacunacionViewModel) : RecyclerView.ViewHolder(itemView) {
        val bDesplegar = itemView.findViewById<Button>(R.id.bDesplegar)
        val rgEsquemaVacunacion = itemView.findViewById<RadioGroup>(R.id.rgEsquemaVacunacion)
        val rbTieneCartillaSi = itemView.findViewById<RadioButton>(R.id.rbTieneCartillaSi)
        val rbTieneCartillaNo = itemView.findViewById<RadioButton>(R.id.rbTieneCartillaNo)
        val bConfirmar = itemView.findViewById<Button>(R.id.bConfirmar)
        val llCampos = itemView.findViewById<LinearLayout>(R.id.llCampos)

        var index = -1

        init {
            bDesplegar.setOnClickListener {
                rgEsquemaVacunacion.visibility = if (rgEsquemaVacunacion.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }

            bConfirmar.setOnClickListener{
                val texto = bConfirmar.text

                cambiarHabilitado(llCampos)

                if (texto == "Editar") {
                    bConfirmar.text = "Confirmar"
                }else{
                    bConfirmar.text = "Editar"
                }

                // madar datos al view model
                viewModel.getEsquemasVacunacion()[index].tieneCartilla = rbTieneCartillaSi.isChecked

                // actualizar el singleton
                EncuestaSingleton.esquemas = viewModel.getEsquemasVacunacion()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_esquema_vacunacion, parent, false)
        return ViewHolder(view, viewModel)
    }

    override fun getItemCount(): Int {
        return vistas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.index = position
        holder.bDesplegar.text = EncuestaSingleton.datosGenerales1[position].nombreCompleto

        holder.rbTieneCartillaSi.isChecked = viewModel.getEsquemasVacunacion()[position].tieneCartilla
    }
}
