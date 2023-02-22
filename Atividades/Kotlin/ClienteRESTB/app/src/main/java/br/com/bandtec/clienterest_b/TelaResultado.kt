package br.com.bandtec.clienterest_b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TelaResultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_resultado)

        // recuperando dados enviados da tela anterior
        val usuario = intent.getStringExtra("usuario")
        val id = intent.getIntExtra("id", 0) // 0 é padrão caso não encontre

        val tvResultado:TextView = findViewById(R.id.tv_resultado)

        val cliente = ClienteRest.criar()

        cliente?.getFilme(id)?.enqueue(object : Callback<Filme> {
            override fun onResponse(call: Call<Filme>, response: Response<Filme>) {
                if (response.isSuccessful) {
                    tvResultado.text = """
                        O usuário $usuario consultou o filme:
                        ${response.body()?.id} - ${response.body()?.nome}  
                     """.trimIndent()
                }
            }

            override fun onFailure(call: Call<Filme>, t: Throwable) {
                tvResultado.text = "Erro na API: ${t.message}"
            }
        })

    }
}