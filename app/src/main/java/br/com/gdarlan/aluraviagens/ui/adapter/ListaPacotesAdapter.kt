package br.com.gdarlan.aluraviagens.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import br.com.gdarlan.aluraviagens.R
import br.com.gdarlan.aluraviagens.modelo.Pacote
import br.com.gdarlan.aluraviagens.util.DiasUtil
import br.com.gdarlan.aluraviagens.util.MoedaUtil
import br.com.gdarlan.aluraviagens.util.ResourcesUtil

class ListaPacotesAdapter(
    private val context: Context,
    private val pacotes: List<Pacote>
) : BaseAdapter() {

    override fun getCount(): Int = pacotes.size

    override fun getItem(position: Int): Pacote = pacotes[position]

    override fun getItemId(position: Int): Long = 0

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = criaView(parent)
        val pacote = pacotes[position]

        mostraLocal(view, pacote)
        mostraImagem(view, pacote)
        mostraDias(view, pacote)
        mostraPreco(view, pacote)
        return view
    }

    private fun mostraPreco(
        view: View,
        pacote: Pacote
    ) {
        val preco = view.findViewById<TextView>(R.id.item_pacote_preco)
        val moedaBrasileira = MoedaUtil().formataParaBrasileiro(pacote.preco)
        preco.text = moedaBrasileira
    }

    private fun mostraDias(view: View, pacote: Pacote) {
        val dias = view.findViewById<TextView>(R.id.item_pacote_dias)
        val diasEmTexto = DiasUtil().formataEmTexto(pacote.dias)
        dias.text = diasEmTexto
    }

    private fun mostraImagem(
        view: View,
        pacote: Pacote
    ) {
        val imagem = view.findViewById<ImageView>(R.id.item_pacote_imagem)
        val drawable =
            ResourcesUtil().devolveDrawable(context = context, drawableEmTexto = pacote.imagem)
        imagem.setImageDrawable(drawable)
    }

    private fun mostraLocal(
        view: View,
        pacote: Pacote
    ) {
        val local = view.findViewById<TextView>(R.id.item_pacote_local)
        local.text = pacote.local
    }

    private fun criaView(parent: ViewGroup?) = LayoutInflater
        .from(context)
        .inflate(R.layout.item_pacote, parent, false)

}
