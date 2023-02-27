package cap13OrientacaoAObjetos

fun main() {

    val p: Pessoa = Pessoa("1985", "Frank")

    /*
    Podemos utilizar o with para acessar todos os metodos de um objeto de uma forma facil.
    Podemos utilizar a palavra this se quiser, para chamar os metodos, mas nao e obrigatorio
     */
    with(p) {
        acordar()
        this.dormir()
    }
}