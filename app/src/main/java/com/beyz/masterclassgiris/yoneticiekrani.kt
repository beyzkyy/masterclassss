package com.beyz.masterclassgiris

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_personeleklemeekrani.*
import kotlinx.android.synthetic.main.activity_yoneticiekrani.*
import kotlinx.android.synthetic.main.recycler_row.view.*


class yoneticiekrani : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoneticiekrani)

        val button21 = findViewById<Button>(R.id.button21)
        button21.setOnClickListener {

            val intent = Intent(applicationContext,YoneticiDilekSikayet::class.java)
            startActivity(intent)

        }
        val context = this
        var db =DataBaseHelper(context)

       val veri = db.readData()


        var personelisimlist = ArrayList<String>()


        for(i in 0 until veri.size){
            val a:String =  veri.get(i).adsoyad.toString() +"\n"+veri.get(i).ders.toString()
            personelisimlist.add(a)
        }

        /*personelisimlist.add("Melike Güneş\n Matematik")
        personelisimlist.add("Enes Demir\n İngilizce")
        personelisimlist.add("Sıla Yazıcı\n Matematik")
        personelisimlist.add("Gufran Kırcaoğlu\n Matematik")
        personelisimlist.add("Çağrı Bayrak\n Fen Bilimleri")
        personelisimlist.add("Efe Turan\n Matematik")*/
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager =layoutManager
        val adapter= RecyclerAdapter(personelisimlist)
        recyclerView.adapter =adapter

    }

    fun eklemeyiac(view: View){
        val intent = Intent(applicationContext,personeleklemeekrani::class.java)
        startActivity(intent)
    }
}