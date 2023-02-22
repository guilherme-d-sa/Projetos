package br.com.bandtec.estadoevriastelasa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        // recurando os parâmetros que vieram de uma tela anterior
        // intent.getXXXExtra("<nome do dado>", <valor padrão>)
        // XXX -> Tipo de Dado
        val votosFruta1 = intent.getIntExtra("votos_fruta1", 0)
        val votosFruta2 = intent.getIntExtra("votos_fruta2", 0)
        val totalVotos:Double = votosFruta1.toDouble() + votosFruta2.toDouble()

        val porcentagemFruta1 = votosFruta1 / totalVotos * 100
        val porcentagemFruta2 = votosFruta2 / totalVotos * 100

        val resultado = getString(R.string.txt_resultado,
                            getString(R.string.txt_bt_fruta1),
                            porcentagemFruta1,
                            getString(R.string.txt_bt_fruta2),
                            porcentagemFruta2
        )

        val tvResultado:TextView = findViewById(R.id.tv_resultado)
        tvResultado.text = resultado
    }
}