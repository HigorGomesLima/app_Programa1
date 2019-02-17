package com.higor.primeiroprograma

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var b = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun acao(view:View){
        val t = findViewById(R.id.textHello) as TextView
        val bt = findViewById<Button>(R.id.button)
        if (b){
            t.text = "Ola Mundo!"
            bt.text = "Ingles"
            b = false
        }
        else {
            t.text = "Hello World!"
            bt.text = "Portugues"
            b = true
        }
    }
}
