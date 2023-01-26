package com.example.ejerciciou2

data class Lista(
    val name: String,
    val price: Double,
    val image: String,
    val stock: Int
)

data class ListaResponse(
    val `data`: List<Lista>
)
