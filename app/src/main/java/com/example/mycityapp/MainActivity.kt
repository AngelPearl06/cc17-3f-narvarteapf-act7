package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cc173faboutme.adapter.adapter
import com.example.cc173faboutme.adapter.city
import com.example.mycityapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recv)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter(createplace())
    }

    private fun createplace(): List<city> {
        return listOf(
            city(R.drawable.florence_espresso_1, "Coffee Shops", createplace()))
            city(R.drawable.lorenzo, "Restaurant", createplace())


    }



}


