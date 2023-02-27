package cap13OrientacaoAObjetos
/*
    As classes em kotlin sao utilizadas para estabelecermos comportamentos e atributos, assim como em java
    No Kotlin nao e necessario criar getters/setters pq ele ja faz isso automaticamente, mas mesmo assim podemos cria-los
        caso haja uma necessidade especial, como implementar uma verificacao do atributo.

 */
class Pessoa (val anoNascimento: String, var nome: String) {

    /*
     Init é um bloco de codigo que sera executado antes de o objeto da classe ser instanciado.
     Podemos ter mais de um bloco chamado init
     */
    init {
//        println("Cheguei antes")
    }

    // Quando criamos uma variavel na classe devemos declarar ela no novo construtor e receber o valor dela nesse atributo
    var documento: String? = null

        // Quando criarmos um getter, temos que retornar a palavra 'field' e nao o proprio atributo, senao sera criado
        // um loop infinito, pois o get criado chamara o get que ja existe no kotlin sucessivamente.
        get(){
            println("Acesso get")
            return field // field foi criado para o problema do loop ser resolvido, pois ele encerra o loop
        }

        set(value){
            println("Acesso set")
            field = value
        }


    /*
    Quando criamos um construtor, o construtor padrao nao e sobrescrito, e temos que referenciar ele com a palavra
    reservada 'this' que se refere a instancia da classe, ao objeto gerado.
    Para evitar os erros do construtor, temos que passar os mesmo astributos do construtor padrao no novo construtor,
    na referencia do objeto apos o 'this' e adicionar um atributo novo, senao dara conflito entre os construtores.
     */
    constructor(anoNascimento: String, nome: String, documento: String) : this (anoNascimento, nome){
        // Nova variavel declarada
        this.documento = documento

        // podemos incluir logica no construtor
        if (documento == "") {
            this.documento =  "00000000000"
        }
    }

    fun acordar(){
        println("Acordado")
    }

    fun dormir(){
        println("Dormindo")
    }

    override fun toString(): String {
        return "Pessoa(anoNascimento='$anoNascimento', nome='$nome', documento=$documento)"
    }


}