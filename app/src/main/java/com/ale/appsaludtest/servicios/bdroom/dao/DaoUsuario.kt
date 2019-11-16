package com.ale.appsaludtest.servicios.bdroom.dao


import androidx.lifecycle.LiveData
import androidx.room.*
import com.ale.appsaludtest.datos.entidades.Usuario

@Dao
interface DaoUsuario {
    @Query("SELECT * FROM usuarios")
    fun getTodosUsuarios(): LiveData<List<Usuario>>

    @Query("SELECT * FROM usuarios WHERE id=:idArg")
    fun getUsuario(idArg: Int): LiveData<List<Usuario>>

    @Insert
    fun insertarUsuario(usuario: Usuario)

    @Update
    fun actualizarUsuario(usuario: Usuario)

    @Delete
    fun eliminarUsuario(usuario: Usuario): Int
}