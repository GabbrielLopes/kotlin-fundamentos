package fundamentos

fun main() {
    println("Hello World")

    imprime(retornaNome(), "Golf Sapão")
    imprime(carro = "Golf", nome = retornaNome())

    imprime("Gabriel")
    imprime(nome = "Ze")
}

fun retornaNome(): String {
    return "Gabriel"
}

fun imprime(nome: String, carro: String = "Teste Carro Fixo") {
    println("Aooba ${nome}, parabens pelo ${carro}!")
}