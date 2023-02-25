package ExcecoesENullSafety

import java.lang.Exception

fun main() {
    /*
     Por padrao o Kotlin nao aceita variaveis nulas, temos que adicionar o ponto de interrogacao depois do tipo da
     variavel e na variavel se formos utiliza-la.
     Quando utilizamos esse ponto, passamos o tratamento do erro para o Kotlin, quando utilizamos "!!" estamos informando
     ao Kotlin que nós trataremos o erro.
     */
    var teste: String? = null

    println(teste?.length)

    // Aqui da excecao NullPointerException
    var teste2: String? = null

    // igual java, inclusive a pilha de erros,a unica coisa que muda é a ordem da variável e tipo de exception no catch
    try {
        // ArithmeticException
        var teste3 = 10/0
        println(teste2!!.length)
    } catch (e: NullPointerException) {
        println("NullPointerException capturada")
    } catch (e: ArithmeticException) {
        println("ArithmeticException capturada")
    } catch (e: Exception) {
        println("Toda Exception é capturada se passar pelos niveis anteriores")
    } finally {
        println("Bloco de código sempre executado, assim como no java")
    }

    println("Fim")

//    var teste3 = readln()
//    println(teste3!!.length) // utlizar quando tiver certeza que a excessao e nao nula
//    println(teste3?.length)

    // Parece o operador ternário do java que não existe em Kotlin.
    var teste4: String? = null
    // caso a variável seja nula, será impresso nulo, faz uso do operador Elvis ("?:")
    println(teste4 ?: "nulo" )
    // nao nulo
    teste4 = "Kotlin"
    println(teste4 ?: "nulo" )

    // Opção mais próxima do operador ternário
    if(!teste4.isNullOrBlank()) println("teste4") else println("Nulo")

    /*
     a palavra reservada "let" permite a gente criar um bloco de código que sera executado caso a variavel nao seja nula.
     Quando usamos o "let" por causa do escopo da funcao, a variável "teste5" dentro do bloco de execução passa a se chamar
     "it"
     */
    var teste5: String? = "não nula"
    teste5?.let{
        teste5 = "novo nome de teste5"
        it.uppercase() // nova referencia da variavel como "it"
        println("Teste5 não é nulo, código executado: variável '$teste5'")
    }
}

