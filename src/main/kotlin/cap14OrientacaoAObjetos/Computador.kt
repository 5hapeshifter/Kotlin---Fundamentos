package cap14OrientacaoAObjetos

/*
        EXEMPLOS DE HERENCA, MODIFICADORES DE ACESSO, OVERRIDE E OVERLOAD
Para usar a heranca em Kotlin temos que informar o atributo da classe superior no construtor sem 'var' ou 'val',
    senao estariamos criando mais uma variavel marca, nesse caso e o atributo 'marca', e passar para o construtor da
    superclasse (Eletronico) e adicionar o 'open' a classe superior 'open class Eletronico'.
O uso é um pouto diferente do java, mas o comportamento e o mesmo.
Usando a palavra private 'private class Eletronico' na classe, impedimos ela de ser herdada.
Por padrao a classe, variaveis, construtor sao publics.
O protected da acesso a classe e as classe que herdam, quem esta de fora nao consegue acessar.
Para usar o 'override' temos que adicionar a palavra 'open' no metodo da superclasse
Assim como em java, atraves da palavra super temos acesso aos atributos e metodos da superclasse
Assim como em java, a sobre carga de metodo pode ser feita desde que os parametros (a assinatura) sejam alterados de um para o outro
 */
class Computador(marca: String) : Eletronico(marca) {



    fun instalarSoftware() {}

    fun processar(){
        // utilizando o modificador 'protected'
        ativarCorrente()
    }

    fun save() {

    }
    // Overload / Sobrecarga de metodo
    fun save(a: Int) {

    }

    override fun desligar() {
        save()
        super.desligar()
    }

}