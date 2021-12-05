package br.com.gdarlan.aluraviagens.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import br.com.gdarlan.aluraviagens.R
import br.com.gdarlan.aluraviagens.dao.PacoteDAO
import br.com.gdarlan.aluraviagens.databinding.ActivityListaPacotesBinding
import br.com.gdarlan.aluraviagens.modelo.Pacote
import br.com.gdarlan.aluraviagens.ui.adapter.ListaPacotesAdapter

class ListaPacotesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide() //comando pra tirar a barra de titulo
        setContentView(R.layout.activity_lista_pacotes)

        val listaDePacotes = findViewById<ListView>(R.id.lista_pacotes_listview)
        listaDePacotes.adapter = ListaPacotesAdapter(this, PacoteDAO().lista())

    }
}