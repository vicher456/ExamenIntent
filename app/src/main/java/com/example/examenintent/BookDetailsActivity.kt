package com.example.examenintent

import android.widget.Button

class BookDetailsActivity {

    private val nombreAutor : String? = null
    private val añoPublicacion : String? = null

    private lateinit var boton : Button

    fun getNombreAutor(){
        this.nombreAutor
    }

    fun setNombreAutor(nombreAutor : String): String {
        return nombreAutor
    }

    fun getAñoPublicacion(){
        this.añoPublicacion
    }

    fun setAñoPublicacion(añoPublicacion : String): String {
        return añoPublicacion
    }

    var intent = Intent(this,BookDisplayActivity::class.java)

    private fun Intent(bookTitleActivity: BookDetailsActivity, java: Class<BookDisplayActivity>) {
        intent.toString(nombreAutor)
        intent.toString(añoPublicacion)
    }

    override fun toString(): String {
        return nombreAutor + añoPublicacion
    }

}
