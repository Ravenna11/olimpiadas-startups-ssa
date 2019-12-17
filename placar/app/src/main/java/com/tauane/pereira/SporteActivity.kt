package com.tauane.pereira

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SporteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sporte)
        var intent = Intent(this, FutebolActivity::class.java)
        var time1 = intent.getStringExtra("TIME1")
        var time2 = intent.getStringExtra("TIME2")


        

    }
}
