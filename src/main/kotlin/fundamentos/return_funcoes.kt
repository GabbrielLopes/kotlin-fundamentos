package fundamentos

fun main () {

    println(retornaNumeroPorExtenso(10))

}

fun retornaNumeroPorExtenso(numero: Int): String {
    if (numero == 1) return "um"
    if (numero == 2) return "dois"
    if (numero == 3) return "três"
    if (numero == 4) return "quatro"
    if (numero == 5) return "cinco"
    if (numero == 6) return "seis"
    if (numero == 7) return "sete"
    if (numero == 8) return "oito"
    if (numero == 9) return "nove"

    return "Número fora do intervalo de 1 a 9"
}
