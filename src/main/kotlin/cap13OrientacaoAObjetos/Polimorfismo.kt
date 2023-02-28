package cap13OrientacaoAObjetos
/*
Quando criamos uma variavel em uma interface, temos que sobrescreve-las nas classes quando essa interface for
    implementada, nesse caso e a variavel salario.
O metodo 'mostraBonus' demonstra o polimorfismo, tendo em vista que ele aceita qualquer classe que implmenta
    Funcionario, no nosso caso as classes 'Analista' e 'Funcionario', igual java.
 */
interface Funcionario {

    var salario: Float
    fun bonus(): Float
}

class Gerente(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.5F
    }

}

class Analista(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.3F
    }

}

fun mostraBonus(g: Funcionario){
    println(g.bonus())
}

fun main() {

    mostraBonus(Gerente(5000F))
    mostraBonus(Analista(4000F))

}