package com.example.komikk

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerview.Komik


class MainActivity : AppCompatActivity() {
    private lateinit var rvHero: RecyclerView
    private var list: ArrayList<Komik> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title=("List Komik")


        rvHero = findViewById(R.id.rv_hero)
        rvHero?.setHasFixedSize(true)

        list.addAll (KomikData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvHero.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListKomikAdapter(list)
        rvHero.adapter = listHeroAdapter


    }



    private fun showSelectedHero(hero: Komik) {
        Toast.makeText(this, "Kamu memilih " + hero.name, Toast.LENGTH_SHORT).show()
    }

}