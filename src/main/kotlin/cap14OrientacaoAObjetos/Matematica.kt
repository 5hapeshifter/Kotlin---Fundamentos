package cap14OrientacaoAObjetos

/*
        EXEMPLOS DE OBJECT E COMPANION OBJECT
Usando o companion object, podemos declarar variaveis e metodos estaticos, pois a palavra 'static' nao existe em kotlin
So pode existir um companion object por classe.
Assim como em java, a variavel e metodo estaticos pertencem ao escopo da classe, nao ao dos objetos.
Podemos ter mais de um bloco 'object' e por isso temos que nomea-los para que nao tenha nenhum problema.
Tanto 'companion object' quanto 'object' aceitam o bloco init.
 */
class Matematica {

    // companion object
    companion object{
        val PI = 3.1415
        fun teste() {
        }
        init {
            println("companion object init")
        }
    }

    // object
    object obj1{
        fun getObj1() {
            println("obj1")
        }
        init {
            println("object init")
        }
    }


    object obj2{
        fun getObj2() {
            println("obj2")
        }
    }
}