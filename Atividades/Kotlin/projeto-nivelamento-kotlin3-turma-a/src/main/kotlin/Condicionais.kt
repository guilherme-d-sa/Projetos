import javax.swing.JOptionPane

fun main() {
    val t1 = JOptionPane.showInputDialog("digite o texto 1")
    val t2 = JOptionPane.showInputDialog("digite o texto 2")

    println("são iguais? ${t1==t2}")

    // NÃO existe Operador Ternário no Kotlin
    // porém, existe o if-else de uma linha
    val idade = 99
    val txtIdade = if (idade >= 16) "pode votar" else "ainda não vota"
    println(txtIdade)
    println(if (idade >= 16) "pode votar" else "ainda não vota")

    when (idade) {
        0 -> println("Bebezinho")
        3 -> println("Criança esperta")
        in 12..19 -> println("Adolescente rebelde")
        45 -> {
            println("Pessoa madura")
            println("Paga boletos")
            println("Foge de balada")
        }
        else -> println("IDADE não mapeada!!!")
    }

    val salario:Double = 2000.0
    val situacao = when(salario) {
        in 0.0..1500.0 -> "Ganha muito pouco"
        in 1500.01..2500.0 -> "Ganha razoável"
        in 2500.01..5000.0 -> "Ganha bem"
        else -> "#ostentação"
    }
    print(situacao)


}