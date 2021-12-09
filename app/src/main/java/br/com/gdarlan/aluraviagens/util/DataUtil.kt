package br.com.gdarlan.aluraviagens.util

import java.text.SimpleDateFormat
import java.util.*

class DataUtil {

    companion object {
        private const val DIA_E_MES = "dd/MM"
    }

    fun periodoEmTexto(dias: Int): String {
        val dataIda = Calendar.getInstance()
        val dataVolta = Calendar.getInstance()
        dataVolta.add(Calendar.DATE, dias)
        val formatoBrasileiro = SimpleDateFormat(DIA_E_MES)
        val dataFormataIDa = formatoBrasileiro.format(dataIda.time)
        val dataFormatadaVolta = formatoBrasileiro.format(dataVolta.time)
        val dataFormatadaDaViagem =
            "$dataFormataIDa - $dataFormatadaVolta de ${dataVolta.get(Calendar.YEAR)}"
        return dataFormatadaDaViagem
    }
}