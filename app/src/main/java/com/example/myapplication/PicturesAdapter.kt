package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PicturesAdapter(private val pictures: List<pictures>) : RecyclerView.Adapter<PicturesAdapter.PictureViewHolder>() {

    class PictureViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)

    }

    override fun getItemCount(): Int = pictures.size



    override fun onBindViewHolder(holder: PictureViewHolder, position: Int) {

        val p = pictures[position]

        holder.imageView.setImageResource(p.image)

        holder.textView.text = p.title

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PictureViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.picture_item, parent, false)

        return PictureViewHolder(view)

    }

}