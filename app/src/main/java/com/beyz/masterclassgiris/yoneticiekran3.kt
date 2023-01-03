package com.beyz  .masterclassgiris

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.beyz.masterclassgiris.DataBaseHelper
import com.beyz.masterclassgiris.R
import kotlinx.android.synthetic.main.activity_yoneticiekran2.*
import kotlinx.android.synthetic.main.activity_yoneticiekran3.*

class yoneticiekran3 : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoneticiekran3)



        val intent= intent
        val secilenogrenciismi= intent.getStringExtra("ogrenciismi")
        textView28.text= secilenogrenciismi


        var delimiter = "\n"

        val parts = secilenogrenciismi?.split(delimiter)
        val context = this
        var db = DataBaseHelper(context)

        val veri = db.readData2()


        val ogrencilist:String


        for(i in 0 until veri.size){
            if(parts?.get(0) ==veri.get(i).adsoyad && parts?.get(1) == veri.get(i).ders){
              ogrencilist=  veri.get(i).adsoyad.toString() +"\n"+veri.get(i).okul.toString()+"\n"+veri.get(i).ders.toString()+"\n"+veri.get(i).dersgunleri.toString()+"\n"+veri.get(i).derssaatleri.toString()+"\n"+veri.get(i).sinif.toString()+"\n"+veri.get(i).telno.toString()+"\n"+veri.get(i).velino.toString()+"\n"+veri.get(i).mail.toString()+"\n"+veri.get(i).tarih.toString()
                textView25.text= ogrencilist
                break
            }
        }
        for(i in 0 until veri.size){
            if(parts?.get(0) ==veri.get(i).adsoyad && parts?.get(1) == veri.get(i).ders){
               if(veri.get(i).id==1){

                val onay=db.readData3()


                val text1= onay.get(0).onay1.toString() + "    "+ onay.get(0).onay2.toString() + "    "+ onay.get(0).onay3.toString() + "    "+ onay.get(0).onay4.toString()
                val text2= onay.get(1).onay1.toString() + "    "+ onay.get(1).onay2.toString() + "    "+ onay.get(1).onay3.toString() + "    "+ onay.get(1).onay4.toString()


                textView15.text=text1
                textView16.text=text2
                break
               }
            }
        }


    }
}


