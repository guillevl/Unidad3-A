package com.example.ejerciciou2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MainAdapter(private val mDataSet: List<Lista>, var onClick: (Lista) -> Unit) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.fragment_card, parent, false)
        return MainViewHolder(v)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val data = mDataSet.get(position)
        holder.bindItems(data)
        holder.itemView.setOnClickListener {
            onClick(data)
        }
    }


    override fun getItemCount(): Int {
        return mDataSet.size
    }

    inner class MainViewHolder(var v: View) : RecyclerView.ViewHolder(v) {
        fun bindItems(data: Lista) {
            val mytexto = v.findViewById<TextView>(R.id.mytexto)
            val imageneee = v.findViewById<ImageView>(R.id.myImg)
            Picasso.get()
                .load(data.image).into(imageneee)
            mytexto.text = data.name
        }
    }
}