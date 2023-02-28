package cap15Colecoes

fun main() {
    // ------------- SET ---------------
    // listOf e imutavel, aceita adicionar nem remover elementos
    val list1: List<Int> = listOf(1, 2, 3, 4, 5)

    listOf<Int>()

    // mutableListOf
    val list2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    // list1.forEach { i -> println(i) }

    list2.add(8)
    list2.add(10)
    list2.remove(8)
    list2.removeAt(0)
    println(list2)

    /* ------------- SET ---------------
     Assim como em Java, nao aceita valores repetidos e nao e um conjunto ordenado, por isso nao conseguimos acessar
     os elementos atraves do indice, so conseguimos verificar se existe um elemento pelo contains.
     */
    val set1: Set<String> = setOf("Paris", "Berlim", "Madrid", "Madrid")
    val set2: MutableSet<String> = mutableSetOf()

    println(set1)

    set2.add("Sao Paulo")
    set2.add("Parana")
    set2.add("Minas Gerais")

    println(set2.contains("Parana"))
    println(set2)

    // ------------- MAP ---------------
    /*
     Assim como em java, funciona com chave e valor, a chave tem que ser unica, e o ultimo valor atribuido a uma chave
     existente sobrescreve o anterior.
     */

    val map1 = mapOf<String, String>(Pair("Franca", "Paris"), Pair("Alemanha", "Berlim"), Pair("Alemanha", "xpto"))
    val map2 = mutableMapOf<String, String>(Pair("Franca", "Paris"), Pair("Alemanha", "Berlim"))

    println(map1)
    println(map1.keys)
    println(map1.values)

    map2["Brasil"] = "Brasilia"
    map2.put("Argentina", "Buenos Aires")

    println(map2)
    println(map2.keys)
    println(map2.values)

    println(map2.contains("Brasil"))
    println(map2.containsValue("Berlim"))

}
