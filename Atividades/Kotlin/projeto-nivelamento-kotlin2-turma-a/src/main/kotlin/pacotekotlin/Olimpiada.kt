package pacotekotlin

import pacotejava.ProgramaJava

class Olimpiada {

    fun abertura() {
        // Instanciando um objeto do tipo pacotekotlin.Pais com tipagem dinâmica
        val pais1 = Pais()

        // Instanciando um objeto do tipo pacotekotlin.Pais com tipagem estática
        val pais2: Pais = Pais()

        // por padrão, não podemos atributir null para objetos
        //val pais3: Pais = null

// para aceitar null, usamos "?" após o tipo
        val pais3: Pais? = null
// porém, isso traz consequências... para usar esse objetos, podemos:

// opção 1: pedir pro kotlin ignorar a nulidade ("?" antes do ".")
// ou seja, nesse caso, se pais3 for null, não dá exceção
// e o programa segue p/ a próxima linha
        pais3?.registrarOuros(5)

// opção 2: pedir pro kotlin lançar a NullPointerException
// caso o bjeto seja mesmo null no momento do uso
        pais3!!.registrarOuros(5)

    }
}

fun main() {
    val paisTeste = Pais()
    paisTeste.calcularMediaMedalhas()
}



