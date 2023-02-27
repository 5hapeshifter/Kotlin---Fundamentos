package cap13OrientacaoAObjetos

fun main() {

    // Construtor padrao
    var pessoa1: Pessoa = Pessoa("1988","Suleiman")
    println(pessoa1)

    // Novo construtor
    var pessoa2: Pessoa = Pessoa("1988","Suleiman", "11133355566")

    pessoa2.documento
    println(pessoa2)

    pessoa2.documento = "novo documento"
    println(pessoa2)

    for (enum in EnumTeste.values()) {
        println("TESTE ENUM: ${enum}" )

    }
}