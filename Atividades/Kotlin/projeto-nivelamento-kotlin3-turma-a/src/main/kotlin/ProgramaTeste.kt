fun main() {
    val onibus1 = Onibus("Viação X", "Cidade Tiradentes", 10)
    println("Empresa: ${onibus1.empresa}")
    println("Passageiros: ${onibus1.passageiros}")

    // onibus1.empresa = "Carraca Taxi" // foi definido como 'val' no construtor
    onibus1.destino = "Itam Bibi"
    onibus1.passageiros = 22

    val onibus2 = Onibus("Viação X", "Cidade Tiradentes", 10)

    println(onibus2)
    println(onibus1 == onibus2)

    val trem1 = Trem("WV", "jet1", 100)
    val trem2 = Trem("WV", "jet1", 100)
    println(trem2)
    println(trem1 == trem2)

}
