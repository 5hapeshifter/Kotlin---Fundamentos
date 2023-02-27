package cap13OrientacaoAObjetos

class Receita(){
    /*
    Toda variavel 'lateinit' deve ser val, senao nao sera possivel atribuir valor posteriormente.
    'lateinit' serve para informa o Kotlin que a variavel sera inicializada depois, dessa forma nao precisamos tratar
    o nulo e nem atribuir um valor default.
    Temos que tomar cuidado e garantir que a variavel SEMPRE tera valor quando usamos o lateinit.
    'lateinit' e bastante utilizado quando precisamos executar uma logica antes de atribuir um valor a variavel
     */
    lateinit var instrucoes: String

    fun geraReceita() {
        instrucoes = "Lave as maos."
    }

    fun imprimeReceita() {
        // Forma de fazer a verificacao de inicializacao de uma variavel lateinit
        if (!this::instrucoes.isInitialized) {
            instrucoes = "Lave as maos."
        }
    }
}

fun main() {

    var r: Receita = Receita()
    r.imprimeReceita()
    println(" ${r.instrucoes}")

}