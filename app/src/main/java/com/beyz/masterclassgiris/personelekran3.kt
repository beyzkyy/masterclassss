package com.beyz.masterclassgiris

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_personelekran3.*
import kotlinx.android.synthetic.main.activity_yoneticiekran3.*

class personelekran3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personelekran3)


        val intent = intent
        val secilenogrenciismi = intent.getStringExtra("ogrenciismi")
        textView6.text = secilenogrenciismi


        var delimiter = "\n"

        val parts = secilenogrenciismi?.split(delimiter)
        val context = this
        var db = DataBaseHelper(context)

        val veri = db.readData2()


        val ogrencilist: String


        for (i in 0 until veri.size) {
            if (parts?.get(0) == veri.get(i).adsoyad && parts?.get(1) == veri.get(i).ders) {
                ogrencilist =
                    veri.get(i).adsoyad.toString() + "\n" + veri.get(i).okul.toString() + "\n" + veri.get(
                        i
                    ).ders.toString() + "\n" + veri.get(i).dersgunleri.toString() + "\n" + veri.get(
                        i
                    ).derssaatleri.toString() + "\n" + veri.get(i).sinif.toString() + "\n" + veri.get(
                        i
                    ).telno.toString() + "\n" + veri.get(i).velino.toString() + "\n" + veri.get(i).mail.toString() + "\n" + veri.get(
                        i
                    ).tarih.toString()
                textView14.text = ogrencilist
                break
            }
        }

        val button14 = findViewById<Button>(R.id.button14)
        val onay1 = findViewById<CheckBox>(R.id.checkBox)
        val onay2 = findViewById<CheckBox>(R.id.checkBox2)
        val onay3 = findViewById<CheckBox>(R.id.checkBox3)
        val onay4 = findViewById<CheckBox>(R.id.checkBox4)

        button14.setOnClickListener {
            val context = this
            val db = DataBaseHelper(context)


            val onay11 = onay1.isChecked
            val onay22 = onay2.isChecked
            val onay33 = onay3.isChecked
            val onay44 = onay4.isChecked


            val onay = onay( onay11.toString(), onay22.toString(), onay33.toString(), onay44.toString())
            db.insertData3(onay)

        }
    }
}