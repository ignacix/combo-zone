package com.example.combozone.presenter

import com.example.combozone.model.Hero

class MainPresenter{

    private val heroes = listOf<Hero>(
        Hero("Cyclop", "Mage", "Ultimate → Skill1 → Skill2 → Skill1"),
        Hero("Tigreal", "Tank", "Skill2 → Ultimate → Skill1"),
        Hero("Eudora", "Mage", "Skill3 → Skill1 → Ultimate")
    )


    fun getHeroes(): List<Hero> {
        return heroes;
    }

}