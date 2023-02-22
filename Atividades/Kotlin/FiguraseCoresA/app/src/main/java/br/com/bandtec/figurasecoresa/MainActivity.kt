package br.com.bandtec.figurasecoresa

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mudarCor(v: View) {
        val tvCamaleao: TextView = findViewById(R.id.tv_camaleao)

        // alterando a cor usando uma cor "fixa"
        // tvCameleao.setTextColor(Color.BLUE)

        // alterando a cor usando código RGB
        tvCamaleao.setTextColor(Color.parseColor("#22EEAA"))
    }
}