package br.com.bandtec.clienterest_b


import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ClienteApiFilmes {

    @GET("/filmes")
    fun getFilmes(): Call<List<Filme>>

    @GET("/filmes/{id}")
    fun getFilme(@Path("id") id:Int): Call<Filme>

    @POST("/filmes")
    fun postFilme(@Body novoFilme:Filme):Call<Void>
}