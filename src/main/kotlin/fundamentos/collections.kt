package fundamentos

fun main () {

    var mapNomeIdade = mutableMapOf<String, Int>(
        "Gabriel" to 21,
        "João" to 22,
        "Maria" to 20
    )

    mapNomeIdade.put("Ana", 19)
    mapNomeIdade["José"] = 23

    println(mapNomeIdade)

    mapNomeIdade.remove("João")

    println(mapNomeIdade)

    mapNomeIdade.putIfAbsent("Gabriel", 22)

    mapNomeIdade.putIfAbsent("Teste", 33)

    println(mapNomeIdade)

//    var lista = mutableListOf(1, 2, 3, 2)
//    println("Lista: $lista")
//
//    var setNumeros = mutableSetOf(1, 2, 3, 2)
//
//    println(setNumeros)
//    println(setNumeros.contains(2))


//
//    lista.sort()
//
//    println(lista)
//
//    lista.shuffle()
//
//    println(lista)

//    var listaNomes = mutableListOf("Gabriel", "João", "Maria", "Ana")
//
//    listaNomes.sort()
//
//    println(listaNomes)


//    lista.add(8)
//
//    lista.removeAt(0)
//    lista.remove(3)

//    lista[0] = 20

//    for (numero in lista) {
//        println(numero)
//    }

//    println(lista[0])
//    println(lista.get(0))
//    println(lista.size)
//    println(lista.indexOf(6))


}