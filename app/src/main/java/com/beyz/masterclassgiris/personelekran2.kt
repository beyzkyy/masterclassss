package com.beyz.masterclassgiris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_yoneticiekran2.*

class personelekran2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personelekran2)

        val context = this
        var db =DataBaseHelper(context)

        val veri = db.readData2()


        var ogrenciisimlist = ArrayList<String>()

        //textView38.append(data.get(0).adsoyad.toString() +"\n"+data.get(0).ders.toString())
        for(i in 0 until veri.size){
            val a:String =  veri.get(i).adsoyad.toString() +"\n"+veri.get(i).ders.toString()
            ogrenciisimlist.add(a)
        }

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
        val adapter= RecyclerAdapter3(ogrenciisimlist)
        recyclerView1.adapter =adapter
    }
    fun eklemeyiac(view: View){

        val intent = Intent(applicationContext,ogrenciekmeleekrani2::class.java)
        startActivity(intent)

    }
}