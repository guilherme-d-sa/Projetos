// Não precisamos definir uma classe para termos um main()
fun main() {
    // o ponto e vírgula ao final da linha é opcional
    println("é nóis no kotlin")
    println("tamo junto!")

    // é possível usar tipagem Dinâmica
    val bairro = "Saúde"
    val habitantes = 20000

    /*
Para fazer interpolação, usamos $ ou ${}
Para usarmos apenas o valor de uma variável,
não usamos as chaves.
Para usar o resultado de um método ou de cálculo,
é obrigatório o uso de chaves.
     */
    println("No bairro ${bairro} moram ${habitantes} pessoas")
    println("No bairro $bairro moram $habitantes pessoas")

    println("No bairro ${bairro.toUpperCase()} moram ${habitantes/2} pessoas")

    // criando variáveis usando tipagem estática (como no Java)
    val idade:Int = 25
    val altura:Double = 1.95
    val palmeirasTemMundial:Boolean = false
    val sobrenome:String = "Silva"

    // NÃO EXISTE o conceito de "tipos primitivos" em kotlin.
    // Tudo é classe e objeto.

    val numeroA:Int = "8".toInt()
    val numeroB:Double = "9.5".toDouble()

    val textoX = "444"
    val numeroC:Int = textoX.toInt()
// Multiline String (String de múltiplas linhas)
    val instrucaoSql = """
        select * from tabela
        where campox = 1
        and campoy = 0
        order by campoz
    """.trimIndent()

    /*
O .trimIndent() numa string de múltiplas linhas
elimina as 1ª e última quebras de linha
E os espaços em branco antes de cada linha
 */

    println(instrucaoSql)
}
