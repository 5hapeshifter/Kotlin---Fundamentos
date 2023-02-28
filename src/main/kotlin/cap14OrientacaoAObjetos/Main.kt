package cap14OrientacaoAObjetos

fun main() {

    // EXEMPLOS DE HERENCA, MODIFICADORES DE ACESSO, OVERRIDE E OVERLOAD
    var c: Computador = Computador("DELL")
    c.ligar()
    c.desligar()
    c.marca

    // Obejct e companion object
    println(Matematica.PI)
    println(Matematica.PI)
    println(Matematica.PI)
    println(Matematica.teste())
    Matematica.obj1.getObj1()
    Matematica.obj2.getObj2()


}