package com.beyz.masterclassgiris


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ogrenciekmeleekrani2.*


class ogrenciekmeleekrani2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_ogrenciekmeleekrani2)
        val button13 = findViewById<Button>(R.id.button13)
        val button12 = findViewById<Button>(R.id.button12)
        val adsoyad = findViewById<EditText>(R.id.adsoyad3)
        val okul = findViewById<EditText>(R.id.okul3)
        val sinif = findViewById<EditText>(R.id.sınıf3)
        val ders = findViewById<EditText>(R.id.ders3)
        val dersgunleri = findViewById<EditText>(R.id.dersgunleri3)
        val derssaatleri = findViewById<EditText>(R.id.derssaatileri3)
        val telno = findViewById<EditText>(R.id.telno3)
        val velino = findViewById<EditText>(R.id.velino3)
        val mail = findViewById<EditText>(R.id.mail3)
        val tarih = findViewById<EditText>(R.id.tarih3)

        button13.setOnClickListener {
            val intent = Intent(applicationContext,yoneticiekran2::class.java)
            startActivity(intent)

        }


        button12.setOnClickListener {
            val context = this
            val db =DataBaseHelper(context)


            val adsoyad2 = adsoyad.text.toString()
            val okul2 = okul.text.toString()
            val ders2 = ders.text.toString()
            val dersgunleri2 = dersgunleri.text.toString()
            val derssaatleri2 = derssaatleri.text.toString()
            val sinif2 = sinif.text.toString()
            val telno2= telno.text.toString()
            val velino2= velino.text.toString()
            val mail2 = mail.text.toString()
            val tarih2 = tarih.text.toString()

            if(adsoyad2.isNotEmpty() && okul2.isNotEmpty() &&ders2.isNotEmpty() && dersgunleri2.isNotEmpty()&& derssaatleri2.isNotEmpty()&& sinif2.isNotEmpty() && telno2.isNotEmpty()&& velino2.isNotEmpty() && mail2.isNotEmpty() && tarih2.isNotEmpty()) {
                val ogrenci = ogrenci(adsoyad2,okul2,ders2,dersgunleri2,derssaatleri2,sinif2,telno2.toInt(),velino2.toInt(),mail2,tarih2.toInt())


                db.insertData2(ogrenci)

                val intent = Intent(applicationContext,personelekran2::class.java)
                startActivity(intent)



            }else{
                Toast.makeText(applicationContext,"Bos olan alanlari doldurun ", Toast.LENGTH_LONG).show()

            }


        }
            }

          /*  fun geridon(view: View) {
                val intent = Intent(applicationContext, personelekran2::class.java)
                startActivity(intent)
            }


                fun kaydet(view: View){
                    val context = this
                    val db =DataBaseHelper(context)


                    val adsoyad = adsoyad3.text.toString()
                    val okul = okul3.text.toString()
                    val ders = ders3.text.toString()
                    val dersgunleri = dersgunleri3.text.toString()
                    val derssaatleri = derssaatileri3.text.toString()
                    val sinif = sınıf3.text.toString()
                    val telno= telno3.text.toString()
                    val velino = velino3.text.toString()
                    val mail = mail3.text.toString()
                    val tarih = tarih3.text.toString()
                    if(adsoyad.isNotEmpty() && okul.isNotEmpty() &&ders.isNotEmpty() && dersgunleri.isNotEmpty()&& derssaatleri.isNotEmpty()&& sinif.isNotEmpty() && telno.isNotEmpty()&& velino.isNotEmpty() && mail.isNotEmpty() && tarih.isNotEmpty()) {
                        val ogrenci = ogrenci(adsoyad,okul,ders,dersgunleri,derssaatleri,sinif,telno.toInt(),velino.toInt(),mail,tarih.toInt())
                        db.insertData2(ogrenci)



                            val intent = Intent(applicationContext,personelekran2::class.java)
                            startActivity(intent)


                }else{
                    Toast.makeText(applicationContext,"Bos olan alanlari doldurun ",Toast.LENGTH_LONG).show()

                }

            }*/
        }