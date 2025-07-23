package fundamentos

fun main () {

    var lista : List<String?> = listOf("Gabriel", null, "João") // lista de string e os atributos podem ser nulos
//    lista = null -> nao pode ser atribuido null pra essa lista, pode null apenas nos atributos

    var listNullable : List<String>? = null // Lista de string e a lista pode ser nula, mas seus atributos nao
//    listNullable = listOf("Gabriel", null, "João") // nao pode atribuir null para os atributos da lista

    var listaTudoNullable : List<String?>? = null // Lista de string e a lista pode ser nula, e os atributos também podem ser nulos
    listaTudoNullable = listOf("Gabriel", null, "João")


    //    --------------------------

    var nome : String? = null

    var tamanho : Int = nome?.length ?: 0

    println(tamanho)

//    --------------------------

//    var nome : String? = "Gabriel"

//    nome = null

//    val toShort : Short = nome!!.length.toShort()

}