package br.com.bandtec.meuappandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueLoko(v:View) {
        val tvLinha2:TextView = findViewById(R.id.tv_linha2)
        val etBairro:EditText = findViewById(R.id.et_bairro)

        tvLinha2.text = "Seu bairro é ${etBairro.text}"
    }

}