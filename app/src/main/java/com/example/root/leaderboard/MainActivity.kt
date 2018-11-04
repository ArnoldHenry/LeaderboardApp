package com.example.root.leaderboard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import butterknife.BindView
import butterknife.ButterKnife

class MainActivity : AppCompatActivity() {
        @BindView(R.id.mylist)
        val mylist: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButterKnife.bind(this)

        val restaurant = arrayOf(
            "Mi Mero Mole",
            "Mother's Bistro",
            "Life of Pie",
            "Screen Door",
            "Luc Lac",
            "Sweet Basil",
            "Slappy Cakes",
            "Equinox",
            "Miss Delta's",
            "Andina",
            "Lardo",
            "Portland City Grill",
            "Fat Head's Brewery",
            "Chipotle",
            "Subway"
        )
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,restaurant)
        mylist?.adapter = adapter

    }

}
