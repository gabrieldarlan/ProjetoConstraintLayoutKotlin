package br.com.gdarlan.aluraviagens.modelo

import java.math.BigDecimal

data class Pacote(
    val local: String,
    val imagem: String,
    val dias: Int,
    val preco: BigDecimal
)
