package com.example.combozone.model

import java.io.Serializable

data class Hero(
    val name: String,
    val role: String,
    val combo: String
): Serializable

