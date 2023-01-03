package com.beyz.masterclassgiris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_yoneticiekran2.*
import kotlinx.android.synthetic.main.activity_yoneticiekrani.*

class yoneticiekran2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoneticiekran2)

        val context = this
        var db =DataBaseHelper(context)

        val veri = db.readData2()


        var ogrenciisimlist = ArrayList<String>()


        for(i in 0 until veri.size){
            val a:String =  veri.get(i).adsoyad.toString() +"\n"+veri.get(i).ders.toString()
            ogrenciisimlist.add(a)
        }
        val intent =intent
        val secilenpersonelismi= intent.getStringExtra("personelismi")
        textView5.text= secilenpersonelismi

        /*var ogrenciisimlist = ArrayList<String>()
        ogrenciisimlist.add("Şeyma Yılmaz \nMatematik")
        ogrenciisimlist.add("Aslan Kaplan \nMatematik")
        ogrenciisimlist.add("Feyza Öz \nMatematik")
        ogrenciisimlist.add("Nisa Güzel \nMatematik")
        ogrenciisimlist.add("Aras Akıncı \nMatematik")
        ogrenciisimlist.add("Can Yazgı \nMatematik")
        ogrenciisimlist.add("Ayşe Tığlı \nMatematik")*/

        val layoutManager = LinearLayoutManager(this)
        recyclerView1.layoutManager =layoutManager
        val adapter= RecyclerAdapter2(ogrenciisimlist)
        recyclerView1.adapter =adapter

    }
    fun eklemeyiac(view: View){
        val intent = Intent(applicationContext,ogrencieklemeekrani::class.java)
        startActivity(intent)
    }
}


