package ControleDeFluxo

fun main() {

    val s = "Kotlin"
    for (char in s) {
        println("$char")
    }

    // step serve para incrementar o laço em mais de uma unidade
    for (i in 1..10 step 2) {
        println(i)
    }

    for (i in 0..20 step 2) {
        println(i)
    }

    for (i in 20 downTo 15 step 2) {
        println(i)
    }
}