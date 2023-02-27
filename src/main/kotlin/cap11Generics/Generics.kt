package cap11Generics

fun main() {

    val media = media(false,10F, 8F, true, "Não me achou")
    println(media)

}

/*
 Para utilizar o generics temos que daclarar usando a letra entre o diamond operator '<T>' e, assim como no java,
 o vararg deve ser o ultimo parametro recebido no metodo.
 O proposito e o mesmo do java, utilizar quando o metodo nao sabe o tipo da variavel em tempo de compilacao
 Devemos o verificar o tipo do dado para executar uma determinada operacao para evitar erros.
 */
fun <T, J> media(abc: J,vararg notas: T): Float{
    var soma = 0F
    var contador = 0
    for(n in notas){
        if (n is Float) {
            soma += n
            contador++
        }
    }
    return (soma / contador)
}