package br.com.gdarlan.aluraviagens.dao

import br.com.gdarlan.aluraviagens.modelo.Pacote
import java.math.BigDecimal

class PacoteDAO {
    fun lista(): List<Pacote> {
        val pacotes = mutableListOf(
            Pacote(
                local = "São Paulo",
                imagem = "sao_paulo_sp",
                dias = 2,
                preco = BigDecimal("243.99")
            ),
            Pacote(
                local = "Belo Horizonte",
                imagem = "belo_horizonte_mg",
                dias = 3,
                preco = BigDecimal("421.50")
            ),
            Pacote(
                local = "Recife",
                imagem = "recife_pe",
                dias = 4,
                preco = BigDecimal("754.20")
            ),
            Pacote(
                local = "Rio de Janeiro",
                imagem = "rio_de_janeiro_rj",
                dias = 6,
                preco = BigDecimal("532.55")
            ),
            Pacote(
                local = "Salvador",
                imagem = "salvador_ba",
                dias = 5,
                preco = BigDecimal("899.99")
            ),
            Pacote(
                local = "Foz do Iguaçu",
                imagem = "foz_do_iguacu_pr",
                dias = 1,
                preco = BigDecimal("289.90")
            )
        )
        return pacotes.toList()
    }
}