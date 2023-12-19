package com.example.examenintent

import android.widget.Button

class BookTitleActivity {

    private val tituloLibro : String? = null
    private val numeroPaginas : String? = null

    private lateinit var boton : Button

    fun getTituloLibro(){
        this.tituloLibro
    }

    fun setTituloLibro(tituloLibro : String): String {
        return tituloLibro
    }

    fun getNumeroPaginas(){
        this.numeroPaginas
    }

    fun setNumeroPaginas(numeroPaginas : String): String {
        return numeroPaginas
    }

    var intent = Intent(this,BookDisplayActivity::class.java)

    private fun Intent(bookTitleActivity: BookTitleActivity, java: Class<BookDisplayActivity>) {
        intent.toString(tituloLibro)
        intent.toString(numeroPaginas)
    }

    override fun toString(): String {
        return tituloLibro + numeroPaginas
    }

}