package br.com.gdarlan.aluraviagens.util

class DiasUtil {

    companion object {
        private const val SINGULAR = "dia"
        private const val PLURAL = "dias"
    }

    fun formataEmTexto(quantidadeDeDias: Int): String {
        return if (quantidadeDeDias <= 1) "$quantidadeDeDias ${SINGULAR}" else "$quantidadeDeDias ${PLURAL}"
    }
}