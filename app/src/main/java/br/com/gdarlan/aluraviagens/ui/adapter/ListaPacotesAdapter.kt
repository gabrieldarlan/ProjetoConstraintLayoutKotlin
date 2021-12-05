package br.com.gdarlan.aluraviagens.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import br.com.gdarlan.aluraviagens.R
import br.com.gdarlan.aluraviagens.modelo.Pacote
import br.com.gdarlan.aluraviagens.ui.activity.ListaPacotesActivity

class ListaPacotesAdapter(
    private val context: Context,
    private val pacotes: List<Pacote>
) : BaseAdapter() {

//    private val pacotes = PacoteDAO().lista()

    override fun getCount(): Int = pacotes.size

    override fun getItem(position: Int): Pacote = pacotes[position]

    override fun getItemId(position: Int): Long {
        return 0
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val viewCriada = LayoutInflater
            .from(context)
            .inflate(R.layout.item_pacote, parent, false)

        val pacote = pacotes[position]

        val local = viewCriada.findViewById<TextView>(R.id.item_pacote_local)
        local.text = pacote.local
        val dias = viewCriada.findViewById<TextView>(R.id.item_pacote_dias)
        dias.text = pacote.dias.toString()
        val preco = viewCriada.findViewById<TextView>(R.id.item_pacote_preco)
        preco.text = pacote.preco.toString()

        val imagem = viewCriada.findViewById<ImageView>(R.id.item_pacote_imagem)
        val resources = context.resources
        val idDoDrawable = resources.getIdentifier(pacote.imagem, "drawable", context.packageName)
        val drawable = ResourcesCompat.getDrawable(resources, idDoDrawable, null)
        imagem.setImageDrawable(drawable)

        return viewCriada

    }

}
