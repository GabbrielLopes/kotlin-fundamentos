package fundamentos

class Carro(var cor: String, val anoFabricacao: Int, val dono: Dono) {

}

data class Dono(var nome: String, var idade: Int) {
}

fun main() {
    var carro = Carro("azul", 2020, Dono("Gabriel", 21))

    println(carro.cor)

    carro.cor = "vermelho"
    println(carro.cor)

    println(carro.dono.nome)
    carro.dono.nome = "João"

    println(carro.dono.nome)
}