package br.com.bandtec.estadoevriastelasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var contador = 0
    var fruta1 = 0
    var fruta2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun contar(v:View) {
        contador++
        // recuperando um texto i18N do strings.xml
        /*
        getString(R.string.<chave i18n que deseja usar>, <parâmetros p/ o texto>)
        como o nome sugere, sempre retorna uma String
         */
        val mensagem = getString(R.string.txt_contador, contador)
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show()
    }

    fun votarFruta(botao:View) {
        when (botao.id) {
            R.id.bt_fruta1 -> fruta1++
            R.id.bt_fruta2 -> fruta2++
        }

        // recuperando um texto i18N do strings.xml
        /*
        getString(R.string.<chave i18n que deseja usar>)
        como o nome sugere, sempre retorna uma String
         */
        val txtFruta1 = getString(R.string.txt_bt_fruta1)
        val txtFruta2 = getString(R.string.txt_bt_fruta2)

        /*
        getString(R.string.<chave i18n que deseja usar>, <parâmetros p/ o texto>)
        como o nome sugere, sempre retorna uma String
         */
        val placar = getString(R.string.txt_votacao, txtFruta1, fruta1, txtFruta2, fruta2)

        val tvVotacao:TextView = findViewById(R.id.tv_votacao)
        tvVotacao.text = placar

        // chamando a Tela2 caso o total de votos for 11
        // vamos passar dados para ela
        if (fruta1 + fruta2 == 11) {
            // Criando um "intenção" de ir para uma outra tela (Tela)
            val tela2 = Intent(this, Tela2::class.java)

            // inserindo alguns parâmetros para a próxima tela
            // putExtra("<nome do dado>", <valor do dado>)
            tela2.putExtra("votos_fruta1", fruta1)
            tela2.putExtra("votos_fruta2", fruta2)

            // inicializar a Tela2
            startActivity(tela2)
        }
    }

}