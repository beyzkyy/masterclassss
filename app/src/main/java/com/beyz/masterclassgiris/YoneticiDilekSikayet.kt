package com.beyz.masterclassgiris

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_yoneticiekran3.*

class YoneticiDilekSikayet : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yonetici_dilek_sikayet)

        val button22 = findViewById<Button>(R.id.button22)
        val text = findViewById<TextView>(R.id.textView18)

        val context = this
        var db = DataBaseHelper(context)

        val veri = db.readData4()


        var dileklist:String= " "


        for(i in 0 until veri.size){
                dileklist=  veri.get(i).adsoyad.toString() +"\n"+veri.get(i).mail.toString()+"\n"+veri.get(i).telno.toString()+"\n"+veri.get(i).konu.toString()+"\n"+veri.get(i).sikayet.toString()+"\n\n"

        }
        text.text = dileklist

        button22.setOnClickListener {
            val intent = Intent(applicationContext,yoneticiekrani::class.java)
            startActivity(intent)
        }
    }
}