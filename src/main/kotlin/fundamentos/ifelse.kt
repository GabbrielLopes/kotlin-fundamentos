package fundamentos

fun main () {
    println(parOuImpar(10))
    println(parOuImpar(7))


    resultadoDaNota(8)
    resultadoDaNota(2)
    resultadoDaNota(5)
}

fun parOuImpar(numero: Int) : String {
    return if (numero % 2 == 0) {
        "Par"
    } else {
        "Impar"
    }
}

// Se a nota > 6 = passou
// se a nota > 4 = recuperação
// se a nota < 4 = reprovado
fun resultadoDaNota(nota: Int) {

    if (nota >= 6) {
        println("Aprovado")
    } else if (nota >= 4) {
        println("Recuperação")
    } else {
        println("Reprovado")
    }

}