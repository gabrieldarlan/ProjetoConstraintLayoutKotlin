package br.com.gdarlan.aluraviagens.ui.activity

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.gdarlan.aluraviagens.R
import br.com.gdarlan.aluraviagens.modelo.Pacote
import br.com.gdarlan.aluraviagens.util.DiasUtil
import br.com.gdarlan.aluraviagens.util.MoedaUtil
import br.com.gdarlan.aluraviagens.util.ResourcesUtil
import java.math.BigDecimal

class ResumoPacoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumo_pacote)

        val pacoteSaoPaulo = Pacote(
            local = "São Paulo",
            imagem = "sao_paulo_sp",
            dias = 2,
            preco = BigDecimal("243.99")
        )

        val local = findViewById<TextView>(R.id.resumo_pacote_local)
        local.text = pacoteSaoPaulo.local

        val imagem = findViewById<ImageView>(R.id.resumo_pacote_imagem)
        val drawableDoPacote = ResourcesUtil().devolveDrawable(this, pacoteSaoPaulo.imagem)
        imagem.setImageDrawable(drawableDoPacote)

        val dias = findViewById<TextView>(R.id.resumo_pacote_dias)
        val diasEmTexto = DiasUtil().formataEmTexto(pacoteSaoPaulo.dias)
        dias.text = diasEmTexto

        val preco = findViewById<TextView>(R.id.resumo_pacote_preco)
        val moedaBrasileira = MoedaUtil().formataParaBrasileiro(pacoteSaoPaulo.preco)
        preco.text = moedaBrasileira

    }
}