package fundamentos

fun main () {

//    val x = 95
//
//    when(x) {
//        1 -> println("x é igual a 1")
//        2 -> println("x é igual a 2")
//        3 -> println("x é igual a 3")
//        4 -> println("x é igual a 4")
//        5, -5, 7 -> println("x é igual a 5, ou -5, ou 7")
//        10 -> {
//            println("x é igual a 10")
//            println("Isso é um bloco de código dentro do when")
//        }
//        in 11 .. 15 -> println("x está entre 11 e 15")
//        !in 16 .. 20 -> println("x não está entre 16 e 20")
//        else -> println("x não é igual a nenhum dos valores anteriores")
//    }


//    println(comecaComOi("oi, tudo certo ?"))

    val teste = "ol"
    val teste2 = false
    val teste3 = 2

    // Podemos usar o when da maneira abaixo
    when {
        teste.startsWith("ola") -> println("A variável teste começa com 'ola'")
        teste2 -> println("A variável teste2 é verdadeira")
        teste3 == 1 -> println("A variável teste3 é igual a 1")
        else -> println("Nenhuma das condições anteriores foi atendida")
    }
}


fun comecaComOi(x: Any): Boolean {
    return when(x) {
        is String -> x.startsWith("oi")
        else -> false
    }
}


