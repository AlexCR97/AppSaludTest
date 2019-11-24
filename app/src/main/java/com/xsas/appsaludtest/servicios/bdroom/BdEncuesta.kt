package com.xsas.appsaludtest.servicios.bdroom

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.xsas.appsaludtest.datos.entidades.Usuario
import com.xsas.appsaludtest.servicios.bdroom.dao.DaoUsuario

@Database(entities =[Usuario::class],version =1, exportSchema = false)
abstract class BdEncuesta: RoomDatabase() {

    abstract fun getUsuarioDao(): DaoUsuario

    companion object {
        var dbInstance: RoomDatabase? = null
        private var nombreBd = "encuestas_bd"

        fun getDatabase(context: Context): RoomDatabase? {
            if(dbInstance == null) {
                synchronized(BdEncuesta:: class.java) {
                    dbInstance = Room.databaseBuilder(
                        context.getApplicationContext(),
                        BdEncuesta::class.java!!,
                        nombreBd
                    )
                        .build()

                }
            }
            return dbInstance
        }

    }


}
