package Funcoes

fun main() {

    endereco("street", "city", "sp", "5868")

    /*
     Podemos alterar a ordem de atribuicao dos valores conforme a nossa necessidade, mas uma vez alterada a
     ordem, temos que nomear e atribuir valor a todas variaveis, senao o Kotlin nao sera capaz de mapear os dados
     */
    endereco(cidade ="city", rua="street", cep = "5868", estado = "sp")

    // Utilizando o vararg. Serve para quando uma funcao receber diversos parametros, nao tendo limite
    val media = media(10F, 8F)
    println(media)

}

// Podemos adicionar um valor padrao a variavel do metodo utilizando o '=' mais ou valor que deve ser do tipo da variavel
fun endereco(rua: String, cidade: String, estado: String, cep: String, num: Int = 0) {

}

fun media(vararg notas: Float): Float{
    var soma = 0F
    for(n in notas){
        soma += n
    }
    return (soma / notas.size)
}