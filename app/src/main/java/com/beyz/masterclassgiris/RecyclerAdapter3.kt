
package com.beyz.masterclassgiris

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*


class RecyclerAdapter3(val ogrenciisimlist : ArrayList<String>) : RecyclerView.Adapter<RecyclerAdapter3.OgrenciListesiVH>(){

    class OgrenciListesiVH(itemView: View) : RecyclerView.ViewHolder(itemView){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OgrenciListesiVH {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return OgrenciListesiVH(itemView)
    }

    override fun getItemCount(): Int {
        return ogrenciisimlist.size
    }
    override fun onBindViewHolder(holder: OgrenciListesiVH, position: Int) {
        holder.itemView.recyclerViewTextView.text= ogrenciisimlist.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,personelekran3::class.java)
            intent.putExtra("ogrenciismi",ogrenciisimlist.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

}