package br.com.bandtec.variastelasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun irTela2(v:View) {
        /*
        Intent -> Intenção de inicialização de Activity
        this -> "tela pai" da próxima
        Tela2::class.java -> classe da Activity a ser chamada

        startActivity() -> Inicializa a Activity da Intent
         */
        startActivity(Intent(this, Tela2::class.java))
    }
}