package com.example.combozone.view

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.combozone.R
import com.example.combozone.presenter.MainPresenter

class MainActivity : AppCompatActivity() {

    private lateinit var presenter: MainPresenter
    private lateinit var listHero: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        presenter = MainPresenter()

        listHero = findViewById(R.id.lvHeroes)

        val heroes = presenter.getHeroes()

        val names = heroes.map {it.name}

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)

        listHero.adapter = adapter

        // Escucho cuando el usuario toca un héroe
        listHero.setOnItemClickListener { _, _, position, _ ->
            val selectedHero = heroes[position] // tomo el héroe que tocó
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("hero", selectedHero) // lo mando al DetailActivity
            startActivity(intent)
        }
    }
}