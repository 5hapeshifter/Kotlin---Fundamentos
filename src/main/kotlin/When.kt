fun main() {
    var bonus = acharBonus("Assistente adm")
    var bonus2 = acharBonus("Desenvolvedor")
    var bonus4 = acharBonus("Errado")
    var bonus3 = acharBonus("Gerente")
    println(bonus)
    println(bonus2)
    println(bonus3)
    println(bonus4)

    test2(3)
    test2(13)
    test2(23)
    test2(33)
}

// Semelhante ao switch/case do java
fun acharBonus(cargo: String): Float {
    var bonus = when (cargo) {
        "Desenvolvedor" -> 2000F
        "Gerente" -> 5000F
        "Assistente adm" -> 1000F
        else -> 500F
    }
    return bonus
}

fun test2(num: Int) {
    return when (num) {
        in 1..10 -> println("1..10")
        in 11..20 -> println("11..20")
        in 21..30 -> println("21..30")
        else -> println("> 30")
    }

}