package br.com.gdarlan.aluraviagens.ui.activity

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.gdarlan.aluraviagens.R
import br.com.gdarlan.aluraviagens.modelo.Pacote
import br.com.gdarlan.aluraviagens.util.DataUtil
import br.com.gdarlan.aluraviagens.util.DiasUtil
import br.com.gdarlan.aluraviagens.util.MoedaUtil
import br.com.gdarlan.aluraviagens.util.ResourcesUtil
import java.math.BigDecimal
import java.text.SimpleDateFormat
import java.util.*

class ResumoPacoteActivity : AppCompatActivity() {

    companion object {
        private const val TITULO_APPBAR = "Resumo do pacote"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumo_pacote)
        title = TITULO_APPBAR

        val pacoteSaoPaulo = Pacote(
            local = "São Paulo",
            imagem = "sao_paulo_sp",
            dias = 2,
            preco = BigDecimal("243.99")
        )

        mostraLocal(pacoteSaoPaulo)
        mostraImagem(pacoteSaoPaulo)
        mostraDias(pacoteSaoPaulo)
        mostraPreco(pacoteSaoPaulo)
        mostraData(pacoteSaoPaulo)
    }

    private fun mostraData(pacote: Pacote) {
        val data = findViewById<TextView>(R.id.resumo_pacote_data)
        val dataFormatadaDaViagem = DataUtil().periodoEmTexto(pacote.dias)
        data.text = dataFormatadaDaViagem
    }

    private fun mostraPreco(pacote: Pacote) {
        val preco = findViewById<TextView>(R.id.resumo_pacote_preco)
        val moedaBrasileira = MoedaUtil().formataParaBrasileiro(pacote.preco)
        preco.text = moedaBrasileira
    }

    private fun mostraDias(pacote: Pacote) {
        val dias = findViewById<TextView>(R.id.resumo_pacote_dias)
        val diasEmTexto = DiasUtil().formataEmTexto(pacote.dias)
        dias.text = diasEmTexto
    }

    private fun mostraImagem(pacote: Pacote) {
        val imagem = findViewById<ImageView>(R.id.resumo_pacote_imagem)
        val drawableDoPacote = ResourcesUtil().devolveDrawable(this, pacote.imagem)
        imagem.setImageDrawable(drawableDoPacote)
    }

    private fun mostraLocal(pacote: Pacote) {
        val local = findViewById<TextView>(R.id.resumo_pacote_local)
        local.text = pacote.local
    }
}