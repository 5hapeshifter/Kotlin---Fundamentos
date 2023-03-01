package cap16ProjetoPortariaOrientadoAObjetos.control

import cap16ProjetoPortariaOrientadoAObjetos.business.ConvidadoBusiness
import cap16ProjetoPortariaOrientadoAObjetos.entity.Convidado

class Portaria {

    private val convidadoBusiness = ConvidadoBusiness()

    // Estamos inicializando automaticamente o metodo
    init {
        println("Portaria inicializada.")
        println(controle())
    }

    private fun controle(): String {
        val idade = Console.readInt("Qual sua idade? ")
        val convidado = Convidado(idade = idade)

        if (!convidadoBusiness.maiorDeIdade(convidado.idade)) {
            return "Negado. Menores de idade nao sao permitidos."
        }

        convidado.tipo = Console.readString("Qual é o tipo de convite? ")
        if (!convidadoBusiness.tipoValido(convidado.tipo)) {
            return "Negado. Convite inválido."
        }

        convidado.codigo = Console.readString("Qual é o código do convite? ")
        if (!convidadoBusiness.convidadoValido(convidado)) {
            return "Negado. Convite inválido."
        }

        return "Welcome! :)"
    }
}
