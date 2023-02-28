package cap13OrientacaoAObjetos
/*
Quando precisamos de uma determinada interface para ser executada e nao temos uma implementacao concreta dela, podemos
    utilizar as classes anonimas, que sao implementadas automaticamente direto no parametro do metodo.
    Dessa forma, uma classe implementando a interface e criada e seu ciclo de vida dura somente do inicio da execucao do
        metodo ate a conclusao dele, como demonstrado na linha 23. Dessa forma criamos um contexto especifico para o metodo.
 */
interface Event {
    fun onSuccess()
}

class Programa {
    fun salvar(e: Event) {
        println("Abrindo conexões")
        println("Salvando valores")
        println("Sucesso. Conexões fechadas")
        e.onSuccess()
    }
}

fun main() {
    val p = Programa()
    p.salvar(object : Event{
        override fun onSuccess() {
            println("on success")
        }

    })
}