package com.tauane.pereira

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         continuarBotao.setOnClickListener {

          var time1 = NomeDoTime1.text
             var time2 = NomeDoTime2.text
             var intent = Intent(this,SporteActivity::class.java)
             intent.putExtra("TIME1" , time1)
             intent.putExtra("TIME2" , time2)
             startActivity(intent)

             }




        }
    }
