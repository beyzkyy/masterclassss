package com.beyz.masterclassgiris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class PersonelDilekSikayet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personel_dilek_sikayet)


        val button20 = findViewById<Button>(R.id.button20)
        val adsoyad = findViewById<EditText>(R.id.editTextTextPersonName2)
        val telno = findViewById<EditText>(R.id.editTextNumber2)
        val mail = findViewById<EditText>(R.id.editTextTextEmailAddress2)
        val konu = findViewById<EditText>(R.id.editTextTextPersonName3)
        val sikayet = findViewById<EditText>(R.id.editTextTextPersonName4)


        button20.setOnClickListener{
            val context = this
            val db=DataBaseHelper(context)




            val adsoyad2 = adsoyad.text.toString()
            val telno2= telno.text.toString().toInt()
            val mail2 = mail.text.toString()
            val konu2= konu.text.toString()
            val sikayet2 = sikayet.text.toString()
            if(adsoyad2.isNotEmpty() && konu2.isNotEmpty() && sikayet2.isNotEmpty()  && telno2.toString().isNotEmpty()   && mail2.isNotEmpty()  ) {
                val dilekvesikayet= dilekvesikayet(adsoyad2,konu2,sikayet2,telno2,mail2)
                db.insertData4(dilekvesikayet)


            }else{
                Toast.makeText(applicationContext,"Bos olan alanlari doldurun ", Toast.LENGTH_LONG).show()

            }
            val intent = Intent(applicationContext,personelekrani::class.java)
            startActivity(intent)

        }
    }
}