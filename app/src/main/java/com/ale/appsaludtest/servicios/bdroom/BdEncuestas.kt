package com.ale.appsaludtest.servicios.web.bdroom

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ale.appsaludtest.datos.entidades.Usuario
import com.ale.appsaludtest.servicios.web.bdroom.dao.DaoUsuario
import com.ale.appsaludtest.servicios.web.dbroom.dao.UsuarioDao

@Database(entities =[Usuario::class],version =1)
abstract class BdEncuestas: RoomDatabase() {

    abstract fun getUsuarioDao(): DaoUsuario


    companion object {
        var dbInstance: RoomDatabase? = null
        private var nombreBd = "encuestas_bd"

        fun getDatabase(context: Context): RoomDatabase? {
            if(dbInstance == null) {
                synchronized(BdEncuestas:: class.java) {
                    dbInstance = Room.databaseBuilder(
                        context.getApplicationContext(),
                        BdEncuestas::class.java!!, nombreBd
                    )
                        .build()

                }
            }
            return dbInstance
        }

    }


}
