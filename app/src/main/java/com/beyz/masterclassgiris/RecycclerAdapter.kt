package com.beyz.masterclassgiris

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*


class RecyclerAdapter(val personelisimlist : ArrayList<String>) : RecyclerView.Adapter<RecyclerAdapter.PersonelListesiVH>(){

    class PersonelListesiVH(itemView: View) : RecyclerView.ViewHolder(itemView){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonelListesiVH {
      val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
      return PersonelListesiVH(itemView)
    }

    override fun getItemCount(): Int {
       return personelisimlist.size
    }
    override fun onBindViewHolder(holder: PersonelListesiVH, position: Int) {
       holder.itemView.recyclerViewTextView.text= personelisimlist.get(position)
       holder.itemView.setOnClickListener {
           val intent = Intent(holder.itemView.context,yoneticiekran2 :: class.java)
           intent.putExtra("personelismi",personelisimlist.get(position))
           holder.itemView.context.startActivity(intent)
       }
    }

}


