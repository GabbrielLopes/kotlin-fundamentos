package fundamentos

fun main() {
    var nome: String = "Gabriel"
    val idade: Int = 21

    println("Nome: $nome, Idade: $idade")

    // Variáveis mutáveis
    nome = "José"

    println("Nome: $nome, Idade: $idade")

    // Dentro de função não é necessário atribuir valor a variável val
    val teste: String
    teste = "Teste"
}

class variaveis {
    // Dentro de classe precisa atribuir um valor a variável val
    val teste: String = "Teste"

    lateinit var teste2: String

    fun iniciaVariaveis() {
        teste2 = "Teste 2"
    }
}