package br.com.bandtec.segundoprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cadastrar(v:View) {
        // recuperando componentes da Activity
        /*
        1 - definimos o nome da variável (ex: val etPais)
        2 - definimos o tipo do componente (ex: :EditText)
        3 - recuperamos o componente pelo seu id (ex: findViewById(R.id.et_pais))
findViewById(R.id.xxx) -> recupera um componente de XML a partir do id
         */
        val etPais:EditText = findViewById(R.id.et_pais)
        val etAltura:EditText = findViewById(R.id.et_altura)
        // val etAltura = findViewById<EditText>(R.id.et_altura)
        val etIdade:EditText = findViewById(R.id.et_idade)

        // recuperando o conteúdo digitado nas EditText

        // apenas recuperando o que está digitado (sempre vem como String)
        val pais = etPais.text.toString()

        // recuperando o que está digitado e convertendo para Double
        val altura = etAltura.text.toString().toDouble()

        // recuperando o que está digitado e convertendo para Int
        val idade = etIdade.text.toString().toInt()

        // colocando um mensagem de erro num componente
        if (idade < 0 || idade > 150) {
            etIdade.error = "Idade deve estar entre 0 e 150"
            return;
        }

        // recuperando o componente e o que está digitado na mesma instrução
        // val meuPais = findViewById<EditText>(R.id.et_pais).text.toString()

        val msg = "Você é do país $pais, sua altura é $altura e tem $idade anos"

        // esta instrução mostra uma pequena janela de mensagem no canto inferior da tela
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

        val tvResultado:TextView = findViewById(R.id.tv_resultado)
        tvResultado.text = msg

        // alterando um atributo de um componente numa instrução
        // findViewById<TextView>(R.id.tv_resultado).text = msg
    }
}