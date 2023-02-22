fun main() {
    val frutas = listOf("acabate", "maçã", "uva", "jabuticaba", "melão")
    // frutas.add("tomate")
    // frutas.remove("uva")
    // uma lista criada com listOf() é IMUTÁVEL (somente leitura)
    // assim, nem podemos inserir nem remover elementos da lista

    val cidades = mutableListOf("São Paulo", "Curitiba", "Belo Horizonte")
    cidades.add("Cuiabá")
    println(cidades)
    cidades.remove("Curitiba")
    cidades.removeAt(0)
    // uma lista criada com mutableListOf() é MUTÁVEL
    // ou seja, podemos inserir e remover elementos
    cidades.set(1, "Palmas") // atualizando o valor do elemento na posição 1

    println("Primeira fruta: ${frutas[0]}")
    println("Primeira fruta: ${frutas.first()}")
    println("Última fruta: ${frutas.last()}")

    // usando nome automático de elemento da iteração (it)
    frutas.forEach {
        println(it)
    }

    // usando nome explícito de elemento da iteração
    frutas.forEach { fruta ->
        println(fruta)
    }

    // podemos iterar usando uma variável que representa o índice (ou posição)
    // nesse caso, a primeira variável é o índice e a segunda o valor de cada elemento
    frutas.forEachIndexed { contador, fruta ->
        println("fruta na posição $contador - $fruta")
    }

    // filtrando uma lista a partir de um critério simples
    var frutasComM = frutas.filter { it.contains("m") }
    println("Frutas com M: $frutasComM")

}