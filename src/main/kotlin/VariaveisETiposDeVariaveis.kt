/**
 * Funcao ControleDeFluxo.ControleDeFluxo.Funcoes.Funcoes.main e a primeira funcao que sera executada quando o projeto for startado, igual 'PSVM' em java.
 */
fun main() {

    // As variaveis podem ser declaradas sem tipo, o kotlin fara a atribuicao por inferencia
    // Atenção a declaração sem tipo
    val n1 = 10.0 // Qualquer número com ponto flutuante é tratado como Double
    val n2 = 10.0f // "f" faz com que o tipo agora seja Float
    val n3 = 13 // Número inteiro, caso caiba dentro do Int, será inteiro
    val n4 = 13L // Long
    val n5 = 13 // Não existe sufixo para Byte, caso deseje um tipo Byte, deve ser explícito

    // variaveis, as mesmas primitivas do Java
    var string: String = "string"
    var boolean: Boolean = true
    var byte: Byte = 127
    var short: Short = 32767
    var int: Int = 34
    var long: Long = 6546546546L
    var float: Float = 5.25F
    var double: Double = 9.75
    var char: Char = '1'

    println(
        "As variáveis do Kotlin são:" +
                "\n string: $string" +
                "\n boolean: $boolean" +
                "\n byte: $byte" +
                "\n short: $short" +
                "\n int: $int" +
                "\n long: $long" +
                "\n float: $float" +
                "\n double: $double" +
                "\n char: $char"

    );
    println("\nMAX E MIN VALUE: \n")
    println("Double: Max: " + Double.MAX_VALUE + " - Double: " + Double.MIN_VALUE)
    println("Float: Max: " + Float.MAX_VALUE + " - Min: " + Float.MIN_VALUE)
    println("Long: Max: " + Long.MAX_VALUE + " - Long: " + Long.MIN_VALUE)
    println("Int: Max: " + Int.MAX_VALUE + " - Min: " + Int.MIN_VALUE)
    println("Short: Max: " + Short.MAX_VALUE + " - Min: " + Short.MIN_VALUE)
    println("Byte: Max: " + Byte.MAX_VALUE + " - Min: " + Byte.MIN_VALUE)


    println("\nVARIAVEIS UNSIGNED \n")
    // vairiavel unsigned nao permite tipos negativos e sao so para numeros inteiros
    val unsignedByte: UByte = 255U
    val unsignedShort: UShort = 1U
    val unsignedInt: UInt = 1U
    val unsignedLong: ULong = 1U

    // USANDO AS CHAVES {} (INTERPOLACAO) ESTAMOS ACESSANDO UMA PROPRIEDADE DO OBJETO
    println("UByte Max/Min value - ${UByte.MAX_VALUE} / ${UByte.MIN_VALUE}")
    println("UShort Max/Min value - ${UShort.MAX_VALUE} / ${UShort.MIN_VALUE}")
    println("UInt Max/Min value - ${UInt.MAX_VALUE} / ${UInt.MIN_VALUE}")
    println("ULong Max/Min value - ${ULong.MAX_VALUE} / ${ULong.MIN_VALUE}")

    // Variaveis mutaveis e imutaveis
    var stringMutavel = "mutavel"
    stringMutavel = "novastring"


    // USAR VAL E UMA BOA PRATICA, POIS TRAZ PREVISIBILIDADE E EVITA ERROS NO DESENVOLVIMENTO
    val stringImutavel = "imutavel"
    // nao permitido pois 'val' e imutavel
    // stringImutavel = "novoImutavel"

}