package AnyUnitNothing

fun main() {
    /*
    Any e o tipo mais generico em Kotlin, assim como Object em java.
     */
    valores("string")
    valores(5)
    valores(8L)
    valores(true)

}

fun valores(value: Any) {

}

// Unit e o void em java
fun funUnit(value: Any): Unit {

}

// Nothing e usado geralmente quando queremos retornar uma excecao da funcao ou quando a implementacao ainda nao foi
// concluida
fun funNothing(value: Any): Nothing {
    // call save
    save()
}

fun save(): Nothing {
    TODO("NÃO TIVE TEMPO DE FAZER")
}