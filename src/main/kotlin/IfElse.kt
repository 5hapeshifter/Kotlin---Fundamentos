fun main() {

    println("Primeiro bom dia: ${bomDia(true)}")
    println("Segundo bom dia: ${bomDia2(false)}")
    println("Terceiro bom dia: ${bomDia3(1)}")
    println("Terceiro bom dia: ${bomDia3(3)}")
}

fun bomDia(dia: Boolean): String {
    if (dia) {
        return "Bom dia"
    } else {
        return "Boa noite"
    }
}

fun bomDia2(dia: Boolean): String {
    return if (dia) {
        "Bom dia"
    } else {
        "Boa noite"
    }
}

fun bomDia3(dia: Int): String {
    return if (dia in 1..2) {
        "Bom dia"
    } else {
        "Boa noite"
    }
}

