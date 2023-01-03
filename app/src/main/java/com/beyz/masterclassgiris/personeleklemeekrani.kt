package com.beyz.masterclassgiris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class personeleklemeekrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personeleklemeekrani)

        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val adsoyad = findViewById<EditText>(R.id.adsoyad)
        val okul = findViewById<EditText>(R.id.okul)
        val bolum = findViewById<EditText>(R.id.bolum)
        val ders = findViewById<EditText>(R.id.ders)
        val telno = findViewById<EditText>(R.id.telno)
        val mail = findViewById<EditText>(R.id.mail)
        val iban = findViewById<EditText>(R.id.iban)
        val tarih = findViewById<EditText>(R.id.tarih)


        button8.setOnClickListener{
            val intent = Intent(applicationContext,yoneticiekrani::class.java)
            startActivity(intent)

        }

        button9.setOnClickListener{
            val context = this
            val db=DataBaseHelper(context)




            val adsoyad2 = adsoyad.text.toString()
            val okul2 = okul.text.toString()
            val bolum2 = bolum.text.toString()
            val ders2 = ders.text.toString()
            val telno2= telno.text.toString().toInt()
            val mail2 = mail.text.toString()
            val iban2= iban.text.toString().toInt()
            val tarih2 = tarih.text.toString().toInt()
            if(adsoyad2.isNotEmpty() && okul2.isNotEmpty() && bolum2.isNotEmpty() && ders2.isNotEmpty() && telno2.toString().isNotEmpty()   && mail2.isNotEmpty() && iban2.toString().isNotEmpty() && tarih2.toString().isNotEmpty() ) {
                val personel= personel(adsoyad2,okul2,bolum2,ders2,telno2,mail2,iban2,tarih2)
                db.insertData(personel)


            }else{
                Toast.makeText(applicationContext,"Bos olan alanlari doldurun ",Toast.LENGTH_LONG).show()

            }
            val intent = Intent(applicationContext,yoneticiekrani::class.java)
            startActivity(intent)

        }
    }

    /*fun geridon(view: View){
        val intent = Intent(applicationContext,yoneticiekrani::class.java)
        startActivity(intent)

    }


    button9.setOnclick{
        val context = this
        val db=DataBaseHelper(context)




        val adsoyad = adsoyad.text.toString()
        val okul = okul.text.toString()
        val bolum = bolum.text.toString()
        val ders = ders.text.toString()
        val telno= telno.text.toString().toInt()
        val mail = mail.text.toString()
        val iban= iban.text.toString().toInt()
        val tarih = tarih.text.toString().toInt()
       if(adsoyad.isNotEmpty() && okul.isNotEmpty() && bolum.isNotEmpty() && ders.isNotEmpty()  && mail.isNotEmpty() ) {
            val personel= personel(adsoyad,okul,bolum,ders,telno,mail,iban,tarih)
            db.insertData(personel)


       }else{
                   Toast.makeText(applicationContext,"Bos olan alanlari doldurun ",Toast.LENGTH_LONG).show()

               }
          val intent = Intent(applicationContext,yoneticiekrani::class.java)
          startActivity(intent)

           }*/
    }

