package ControleDeFluxo

fun main() {
    // Encerra o fluxo igual ao java
    while (true) {
        break
    }
    var i = 0
//    while (i < 10000000) {
//        if(i == 55) {
//            break
//        }
//        print("$i ")
//        i++
//    }

    // mesma coisa do java tambem, faz o fluxo do laco continuar se sobrepondo a condicional de parada
    while (i < 100) {
        if(i == 55) {
            i++
            continue
        }
        print("$i ")
        i++
    }
}