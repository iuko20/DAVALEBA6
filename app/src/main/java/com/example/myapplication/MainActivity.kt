package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyvleview)

        val pictures = arrayListOf<pictures>()

        pictures.add(pictures(1, "სურათი 1", R.drawable.e38523b03f3fe7223a35f906e4636d2b))
        pictures.add(pictures(2, "სურათი 2", R.drawable.maxresdefault))
        pictures.add(pictures(3,"სურათი 3", R.drawable.top_wave_02))
        pictures.add(pictures(4, "სურათი 4", R.drawable.wp2628093))
        pictures.add(pictures(1, "სურათი 1", R.drawable.e38523b03f3fe7223a35f906e4636d2b))
        pictures.add(pictures(2, "სურათი 2", R.drawable.maxresdefault))
        pictures.add(pictures(3,"სურათი 3", R.drawable.top_wave_02))
        pictures.add(pictures(4, "სურათი 4", R.drawable.wp2628093))
        pictures.add(pictures(1, "სურათი 1", R.drawable.e38523b03f3fe7223a35f906e4636d2b))
        pictures.add(pictures(2, "სურათი 2", R.drawable.maxresdefault))
        pictures.add(pictures(3,"სურათი 3", R.drawable.top_wave_02))
        pictures.add(pictures(4, "სურათი 4", R.drawable.wp2628093))
        pictures.add(pictures(1, "სურათი 1", R.drawable.e38523b03f3fe7223a35f906e4636d2b))
        pictures.add(pictures(2, "სურათი 2", R.drawable.maxresdefault))
        pictures.add(pictures(3,"სურათი 3", R.drawable.top_wave_02))
        pictures.add(pictures(4, "სურათი 4", R.drawable.wp2628093))
        pictures.add(pictures(1, "სურათი 1", R.drawable.e38523b03f3fe7223a35f906e4636d2b))
        pictures.add(pictures(2, "სურათი 2", R.drawable.maxresdefault))
        pictures.add(pictures(3,"სურათი 3", R.drawable.top_wave_02))
        pictures.add(pictures(4, "სურათი 4", R.drawable.wp2628093))
        pictures.add(pictures(1, "სურათი 1", R.drawable.e38523b03f3fe7223a35f906e4636d2b))
        pictures.add(pictures(2, "სურათი 2", R.drawable.maxresdefault))
        pictures.add(pictures(3,"სურათი 3", R.drawable.top_wave_02))
        pictures.add(pictures(4, "სურათი 4", R.drawable.wp2628093))
        pictures.add(pictures(1, "სურათი 1", R.drawable.e38523b03f3fe7223a35f906e4636d2b))
        pictures.add(pictures(2, "სურათი 2", R.drawable.maxresdefault))
        pictures.add(pictures(3,"სურათი 3", R.drawable.top_wave_02))
        pictures.add(pictures(4, "სურათი 4", R.drawable.wp2628093))
        pictures.add(pictures(1, "სურათი 1", R.drawable.e38523b03f3fe7223a35f906e4636d2b))
        pictures.add(pictures(2, "სურათი 2", R.drawable.maxresdefault))
        pictures.add(pictures(3,"სურათი 3", R.drawable.top_wave_02))
        pictures.add(pictures(4, "სურათი 4", R.drawable.wp2628093))
        pictures.add(pictures(1, "სურათი 1", R.drawable.e38523b03f3fe7223a35f906e4636d2b))
        pictures.add(pictures(2, "სურათი 2", R.drawable.maxresdefault))
        pictures.add(pictures(3,"სურათი 3", R.drawable.top_wave_02))
        pictures.add(pictures(4, "სურათი 4", R.drawable.wp2628093))


        val adapter = PicturesAdapter(pictures)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter

    }
}