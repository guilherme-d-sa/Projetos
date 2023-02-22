package br.com.bandtec.clienterest_b

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClienteRest {

    fun criar(): ClienteApiFilmes? {
        return Retrofit.Builder()
            .baseUrl("https://5f861cfdc8a16a0016e6aacd.mockapi.io/bandtec-api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ClienteApiFilmes::class.java)
    }
}