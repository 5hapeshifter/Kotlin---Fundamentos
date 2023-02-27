package cap13OrientacaoAObjetos

fun main() {

    val f1 = Forma(10, 8)
    val f2 = Forma(10, 8)
    // todos objetos tem por padrao os metodos toString, equals e hashcode
    val equals = f1.equals(f2)
    println(f1.toString())
    println(f1.hashCode())
    println("--------------------------")
    println(f2.toString())
    println(f2.hashCode())

    println("F1 e F2 sao iguais? $equals")

    println("\nUtilizando o Data Class que ja implementa os metodos toString, equals e hashcode, " +
            "componentN(para permitir o uso do Destructuring Declaration) e copy (para copiar o objeto com " +
            "flexibilidade) por padrao")

    val f3 = FormaData(10, 8)
    val f4 = FormaData(10, 8)
    // todos objetos tem por padrao os metodos toString, equals e hashcode
    println(f3.toString())
    println(f4.hashCode())
    println("--------------------------")
    println(f3.toString())
    println(f4.hashCode())

    println("F1 e F2 sao iguais? $equals")

    println("\n-------------- Usando o copy -------------")
    val f5: FormaData
    f5 = f4.copy(50)
    println("F5 valor: $f5")

}

class Forma(val a: Int, val b: Int) {

    override fun equals(other: Any?): Boolean {
        return if (other is Forma) {
            (other.a == this.a && other.b == this.b)
        } else {
            return false
        }
    }
    override fun toString(): String {
        return "Forma(a=$a, b=$b)"
    }
}

/*
 Quando utilizamos 'data class' temos que informar se a variavel e constante ou nao.
 O Data Class e mais utilizado quando a classe nao tera comportamentos, ou seja, sera utilizada so para armazenar valores.
 */
data class FormaData(var a: Int, val b: Int)
