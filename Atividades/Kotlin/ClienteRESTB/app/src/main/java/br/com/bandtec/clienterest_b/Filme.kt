package br.com.bandtec.clienterest_b

import android.os.Parcelable
import java.io.Serializable

data class Filme(
    val id: Int?,
    val nome: String,
    val custoProducao: Double,
    val classico: Boolean,
):Serializable