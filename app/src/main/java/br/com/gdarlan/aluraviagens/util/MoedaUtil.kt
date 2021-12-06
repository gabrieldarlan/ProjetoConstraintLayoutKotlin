package br.com.gdarlan.aluraviagens.util

import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.*

class MoedaUtil {

    companion object {
        private const val PORTUGUES = "pt"
        private const val BRASIL = "br"
    }

    fun formataParaBrasileiro(valor: BigDecimal): String? {
        val formatoBrasileiro = DecimalFormat.getCurrencyInstance(
            Locale(
                PORTUGUES,
                BRASIL
            )
        )
        val moedaBrasileira = formatoBrasileiro.format(valor)
        return moedaBrasileira
    }
}