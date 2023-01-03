package com.beyz.masterclassgiris

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class veliekrani : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veliekrani)

        val button17 = findViewById<Button>(R.id.button17)
       val button15 = findViewById<Button>(R.id.button15)
        val onay1 = findViewById<CheckBox>(R.id.checkBox5)
        val onay2 = findViewById<CheckBox>(R.id.checkBox6)
        val onay3 = findViewById<CheckBox>(R.id.checkBox7)
        val onay4 = findViewById<CheckBox>(R.id.checkBox8)

        button15.setOnClickListener{
            val context = this
            val db=DataBaseHelper(context)

            val onay11 = onay1.isChecked
            val onay22 = onay2.isChecked
            val onay33 = onay3.isChecked
            val onay44 = onay4.isChecked


                val onay= onay(onay11.toString(),onay22.toString(),onay33.toString(),onay44.toString())
                db.insertData3(onay)
         }
         button17.setOnClickListener {

             val intent = Intent(applicationContext,VeliDilekSikayet::class.java)
             startActivity(intent)
         }

        }
    }

       /* val context = this
        var db =DataBaseHelper(context)

        val veri = db.readData()


        var personelisimlist = ArrayList<String>()

        //textView38.append(data.get(0).adsoyad.toString() +"\n"+data.get(0).ders.toString())
        for(i in 0 until veri.size){
            val a:String =  veri.get(i).adsoyad.toString() +"\n"+veri.get(i).bolum.toString() +"\n"+veri.get(i).ders+"\n"+veri.get(i).telno.toInt()+"\n"+veri.get(i).mail
            personelisimlist.add(a)
        }*/


