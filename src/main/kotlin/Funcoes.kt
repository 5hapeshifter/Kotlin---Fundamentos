import kotlin.math.*

fun main() {

    helloWorld()
    helloWorldUnit()
    println("Funcao soma: ${sum(2, 5)}")
    println("Funcao soma de uma linha: ${sumsum(5, 4)}")
    helloWorld2()
    println("Funcao divisao de uma linha: ${divisao(11.0F, 5.5F)}")

    // Funcoes padrao do Kotlin
    val str = "Kotlin"
    println("Tamanho string: ${str.length}")
    println("Chars string: ${str.chars()}")
    println("Posicao 0 string: ${str[1]}")
    println("String comeca com: ${str.startsWith("t", true)}")
    println("Pedaco da string: ${str.substring(1, 3)}")
    println("Trocar caracter da string: ${str.replace("K", "k")}")

    println("Maior numero: ${max(5, 7)}")
    println("Menor numero: ${min(5, 7)}")
    println("Potencia de um numero: ${2.0.pow(3.0)}")
    println("Arredondamento de um numero: ${round(1561.5)}")
    println("Valor de pi: $PI")


}

fun helloWorld() {
    println("Hello, world!")
}

// Diferentemente do java, o tipo do retorno da funcao e declarado apos os parenteses
fun sum(a: Int, b: Int): Int {
    return a + b
}

// Funcao de uma linha, nao e necessario declarar o tipo explicitamente
//fun sumsum(c: Int, d: Int): Int = c + d
fun sumsum(c: Int, d: Int) = c + d


// Usar o 'Unit' explicita que a funcao nao tem retorno
fun helloWorldUnit(): Unit {
    println("Hello, world!")
}

fun helloWorld2() = println("Funcao de uma linha: Hello, world!")

fun divisao(a: Float, b: Float) = a / b

