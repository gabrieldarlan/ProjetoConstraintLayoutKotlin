package br.com.gdarlan.aluraviagens.ui.activity

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import br.com.gdarlan.aluraviagens.R
import br.com.gdarlan.aluraviagens.dao.PacoteDAO
import br.com.gdarlan.aluraviagens.ui.adapter.ListaPacotesAdapter

class ListaPacotesActivity : AppCompatActivity() {

    companion object {
        private const val TITULO_APPBAR = "Pacotes"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        supportActionBar?.hide() //comando pra tirar a barra de titulo

        setContentView(R.layout.activity_lista_pacotes)
        title = Companion.TITULO_APPBAR
        configuraLista()
    }

    private fun configuraLista() {
        val listaDePacotes = findViewById<ListView>(R.id.lista_pacotes_listview)
        listaDePacotes.adapter = ListaPacotesAdapter(this, PacoteDAO().lista())
    }
}