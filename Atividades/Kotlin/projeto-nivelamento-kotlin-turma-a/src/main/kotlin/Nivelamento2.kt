fun main() {
    // com 'val' criamos uma variável IMUTÁVEL
    val palmeirasTemMundial = false
    // palmeirasTemMundial = true
    // A linha acima não compila, pois não podemos reatribuir valor à variável

    // com 'var' criamos uma variável MUTÁVEL
    var contador = 0
    contador = 1
    contador++
    // foi possível reatribuit a variável pois ela é 'var'
    // contador = "ok"
    // mas não é possível mudar o valor para outro tipo

}