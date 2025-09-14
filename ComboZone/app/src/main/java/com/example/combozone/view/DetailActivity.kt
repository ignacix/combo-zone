package com.example.combozone.view

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.combozone.R
import com.example.combozone.model.Hero

class DetailActivity : AppCompatActivity() {

    private lateinit var tvHeroName: TextView
    private lateinit var tvHeroRole: TextView
    private lateinit var tvHeroCombo: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_detail)


        tvHeroName = findViewById(R.id.tvHeroName)
        tvHeroRole = findViewById(R.id.tvHeroRole)
        tvHeroCombo = findViewById(R.id.tvHeroCombo)

        val hero = intent.getSerializableExtra("hero") as Hero

        hero?.let {
            tvHeroName.text = it.name
            tvHeroRole.text = it.role
            tvHeroCombo.text = it.combo
        }





    }
}