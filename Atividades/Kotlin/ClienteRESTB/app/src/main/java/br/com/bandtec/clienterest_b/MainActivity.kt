package br.com.bandtec.clienterest_b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvLista: TextView = findViewById(R.id.tv_lista)

        // criar meu client REST
        val cliente = ClienteRest.criar()

        val filmeLoko = Filme(null, "AVENTURAS DA ISABELA!!!", 1.99, false)

        cliente?.postFilme(filmeLoko)?.enqueue(object : Callback<Void> {
            override fun onResponse(call: Call<Void>, response: Response<Void>) {
                if (response.isSuccessful) {
                    Toast.makeText(baseContext, "Filme cadastrado com sucesso", Toast.LENGTH_SHORT).show()

                    cliente?.getFilmes()?.enqueue(object : Callback<List<Filme>> {
                        override fun onResponse(call: Call<List<Filme>>, response: Response<List<Filme>>) {
                            if (response.isSuccessful) {
                                var lista = ""
                                response.body()?.forEach {
                                    lista = "$lista \n ${it.id} - ${it.nome}"
                                }
                                tvLista.text = lista
                            }
                        }

                        override fun onFailure(call: Call<List<Filme>>, t: Throwable) {
                            tvLista.text = "Erro na API: ${t.message}"
                        }

                    })

                }
            }

            override fun onFailure(call: Call<Void>, t: Throwable) {
                tvLista.text = "Erro na API: ${t.message}"
            }

        })
    }

    fun irTelaResultado(v:View) {
        val etIdFilme:EditText = findViewById(R.id.et_id_filme)
        val id = etIdFilme.text.toString().toInt()

        // preparando a chamada da próxima
        val telaResultado = Intent(this, TelaResultado::class.java)

        // passando dados para a próxima tela
        /*
        putExtra("<NOME do dado>", <VALOR do dado>)
         */
        telaResultado.putExtra("usuario", "Zé Ruela")
        telaResultado.putExtra("id", id)
        telaResultado.putExtra("filmeCompleto", Filme(null, "kkkkk", 1000.0, false))

        // invocando a próxima tela
        startActivity(telaResultado)

    }


}