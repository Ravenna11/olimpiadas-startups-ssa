package com.tauane.pereira

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        return botaocontinuar.setOnClickListener {
            it:View
            val time1 = nomeDoTime1.text.toString().trim()
            val time2 = nomeDoTime2.text.toString().trim()

            if (time1 == "") {
                toast.makeText(context:this, text:"Preencha o time 1", Toast.LENGTH_SHORT).
                return@setOfClickListener

             }

            }


        }
    }
