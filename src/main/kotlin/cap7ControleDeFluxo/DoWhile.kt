package cap7ControleDeFluxo

fun main() {
    var i = 0

    do {
        print("Qual o seu nome: ")
        val value = readlnOrNull()
    } while (value == "")
}