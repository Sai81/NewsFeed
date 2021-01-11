package com.saigorti.newsfeed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NewsItemClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val items = fetchData()
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter: NewsListAdapter = NewsListAdapter(items, this)
        recyclerView.adapter = adapter
    }

    private fun fetchData(): ArrayList<String> {
        val url ="http://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=57c0fcb51bc74ebbb71643ef42293cdd"

    }

    override fun onItemClicked(item: String) {
        Toast.makeText(this,"clicked item is $item",Toast.LENGTH_LONG).show()
    }
}