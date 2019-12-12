package com.xsas.appsaludtest.ui.modelos

import androidx.lifecycle.ViewModel
import com.xsas.appsaludtest.datos.vistas.Georeferenciacion1
import com.xsas.appsaludtest.datos.vistas.Georeferenciacion2
import com.xsas.appsaludtest.datos.vistas.Georeferenciacion3

class SeccionGeoreferenciacionViewModel : ViewModel() {

    val georeferenciacion1 = Georeferenciacion1()
    val georeferenciacion2 = Georeferenciacion2()
    val georeferenciacion3 = Georeferenciacion3()

}
