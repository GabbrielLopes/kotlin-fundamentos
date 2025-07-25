package fundamentos

class MinhaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    companion object {
        fun criarComValoresPadrao(): MinhaClasse {
            return MinhaClasse("Gabriel", "Rua A, 123", 21)
        }

        fun mapToMinhaClasse(segundaClasse: SegundaClasse): MinhaClasse {
            return MinhaClasse(
                segundaClasse.nome,
                segundaClasse.endereco,
                segundaClasse.idade
            )
        }
    }

    override fun toString(): String {
        return "MinhaClasse(nome='$nome', endereco='$endereco', idade=$idade)"
    }


}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    fun criarComValoresPadrao(): SegundaClasse {
        return SegundaClasse("Gabriel", "Rua A, 123", 21)
    }

}


fun main() {

//    var segundaClasse = SegundaClasse().criarComValoresPadrao()

    var minhaClasseValoresPadrao = MinhaClasse.criarComValoresPadrao()

    var segundaClasse = SegundaClasse("João", "Rua B, 456", 22)
    var minhaClasse = MinhaClasse.mapToMinhaClasse(segundaClasse)

    println(minhaClasse.toString())

}