package com.arvafik.evaluacion2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//Jessica Janet Grajeda Castellanos
// 17100229

class activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(findViewById(R.id.toolbar))
        setContentView(R.layout.activity_activity2)

        //Recycleview
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        val adapter = AdapterRecycle()

        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=adapter

    }
}