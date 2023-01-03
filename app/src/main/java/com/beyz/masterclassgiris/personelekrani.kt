package com.beyz.masterclassgiris

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_personeleklemeekrani.*
import kotlinx.android.synthetic.main.activity_personelekrani.*
import kotlinx.android.synthetic.main.activity_yoneticiekran3.*

class personelekrani : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personelekrani)
        val button4 = findViewById<Button>(R.id.button4)
        val button18 = findViewById<Button>(R.id.button18)
        val button16 = findViewById<Button>(R.id.button16)
        val text = findViewById<TextView>(R.id.textView17)
      button16.setOnClickListener {
          val context = this
          var db = DataBaseHelper(context)


          val veri = db.readData2()

          var derslist = Array<String>(8){""}
          var x=0
          for(i in 0 until veri.size){
              if(veri.get(i).dersgunleri == "pazartesi" || veri.get(i).dersgunleri== "PAZARTESİ" || veri.get(i).dersgunleri=="Pazartesi"){
                  derslist[x]=  veri.get(i).adsoyad.toString() +"\n"+veri.get(i).dersgunleri.toString()+"     "+veri.get(i).derssaatleri.toString()
                  x += 1
              }
          }
          for(i in 0 until veri.size){
              if(veri.get(i).dersgunleri == "sali" || veri.get(i).dersgunleri== "SALI" || veri.get(i).dersgunleri=="Sali"){
                  derslist[x] =  veri.get(i).adsoyad.toString() +"\n"+veri.get(i).dersgunleri.toString()+"     "+veri.get(i).derssaatleri.toString()
                  x += 1
              }
          }
          for(i in 0 until veri.size){
              if(veri.get(i).dersgunleri == "çarsamba" || veri.get(i).dersgunleri== "ÇARSAMBA" || veri.get(i).dersgunleri=="Çarsamba"){
                  derslist[x] =  veri.get(i).adsoyad.toString() +"\n"+veri.get(i).dersgunleri.toString()+"     "+veri.get(i).derssaatleri.toString()
                  x += 1
              }
          }
          for(i in 0 until veri.size){
              if(veri.get(i).dersgunleri == "persembe" || veri.get(i).dersgunleri== "PERSEMBE" || veri.get(i).dersgunleri=="Persembe"){
                  derslist[x]=  veri.get(i).adsoyad.toString() +"\n"+veri.get(i).dersgunleri.toString()+"     "+veri.get(i).derssaatleri.toString()
                  x += 1
              }
          }
          for(i in 0 until veri.size){
              if(veri.get(i).dersgunleri == "cuma" || veri.get(i).dersgunleri== "CUMA" || veri.get(i).dersgunleri=="Cuma"){
                   derslist[x]=  veri.get(i).adsoyad.toString() +"\n"+veri.get(i).dersgunleri.toString()+"     "+veri.get(i).derssaatleri.toString()
                  x += 1
              }
          }
          val derslist2 =derslist.get(0)+"\n\n"+derslist.get(1)+"\n\n"+derslist.get(2)+"\n\n"+derslist.get(3)+"\n\n"+derslist.get(4)+"\n\n"+derslist.get(5)+"\n\n"+derslist.get(6)+"\n\n"+derslist.get(7)

          text.text=derslist2


      }

        button18.setOnClickListener {

            val intent = Intent(applicationContext,PersonelDilekSikayet::class.java)
            startActivity(intent)
        }
     button4.setOnClickListener {
         val intent = Intent(applicationContext,personelekran2::class.java)
         startActivity(intent)
     }

    }

    }