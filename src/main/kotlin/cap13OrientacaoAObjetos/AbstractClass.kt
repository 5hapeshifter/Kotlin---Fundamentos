package cap13OrientacaoAObjetos

/*
        Exemplo de abstract class e Interfaces
O uso do abstract e o mesmo do java, podemos atribuir essa caracteristica tanto aos metodos quanto a classe,
    e podemos ter metodos implementados e abstratos.
Assim como em Java, Kotlin nao suporta herancas multiplas e as interfaces podem ser implementads diversas vezes por
    classes diferentes.
Uma interface nao pode manter/guardar estados, significa que nao podemos inicializar variaveis em interfaces, ja a classe
    abstrata consegue manter estados.
Diferentemente do Java, no Kotlin nao fazemos o uso das palavras 'extends' e 'implements'.
 */
interface Selvagem {
    fun atacar()
    fun esperar(){
        println("Esperando")
    }
}

abstract class Mamifero(val nome: String) {
    open fun acordar() {
        println("acordei")
    }
    abstract fun dormir()
    abstract fun falar()

}

class Cachorro(nome: String) : Mamifero(nome), Selvagem {
    override fun acordar() {
        TODO("Not yet implemented")
    }

    override fun dormir() {
        TODO("Not yet implemented")
    }

    override fun falar() {
        TODO("Not yet implemented")
    }

    override fun atacar() {
        TODO("Not yet implemented")
    }

}


fun main() {

}