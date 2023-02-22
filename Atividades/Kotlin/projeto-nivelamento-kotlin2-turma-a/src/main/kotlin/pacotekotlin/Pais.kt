package pacotekotlin

import java.math.BigDecimal

class Pais {

    var nome:String? = null
    var ouros:Int = 0
    var pratas:Int = 0
    var bronzes:Int = 0
/*
Quando usamos 'lateinit' antes de um atributo de instância,
estamos nos comprometendo a dar um valor para ele antes de
acessá-lo. E este valor NÃO pode ser null.
Caso seja invocado um método do objeto lateinit antes de ele
ser inicializado, tomamos uma UninitializedPropertyAccessException
que indica exatamente o atributo não inicializado.
NÃO podemos usar 'lateinit' com 'val'. Só com 'var'.
 */
    lateinit var mediaMedalhasDia:BigDecimal
    // lateinit var bronzes:Int

    // por padrão os métodos de uma classe são PÚBLICOS

    // ex. de função SEM retorno
    fun iniciar() {
        println("País iniciado!")
    }

    // ex. de função COM retorno (no caso, String)
    fun elogiar():String {
        return "Todo país tem suas qualidades"
    }

    // ex. de função com 1 parâmetro e sem retorno
    fun registrarOuros(quantidade:Int) {
        // os parâmetros são IMUTÁVEIS
        // quantidade = 99
        println("$quantidade medalhas de ouro registradas")
    }

    // ex. de função com 2 parâmetros e sem retorno
    fun registrarPrata(atleta:String, recorde:Boolean) {
        println("""
            O(a) atleta $atleta conquistou uma prata.
            Foi recorde? $recorde
        """)
    }

    // ex. de função com 1 parâmetro (Int) e com retorno (String)
    fun registrarBronze(quantidade: Int): String {
        return "Acabamos de ganhar $quantidade medalhas de bronze"
    }

    fun calcularMediaMedalhas() {
        val media = mediaMedalhasDia.divide(30.toBigDecimal())
        println("Média: $media")
    }
}