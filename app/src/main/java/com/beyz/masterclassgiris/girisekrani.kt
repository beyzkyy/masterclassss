package com.beyz.masterclassgiris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class girisekrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun yoneticigec(view: View){
        val intent =Intent(applicationContext,yoneticiekrani::class.java)
        startActivity(intent)
    }
    fun personelgec(view: View){
        val intent =Intent(applicationContext,personelekrani::class.java)
        startActivity(intent)
    }
    fun veligec(view: View){
        val intent =Intent(applicationContext,veliekrani::class.java)
        startActivity(intent)
    }
}