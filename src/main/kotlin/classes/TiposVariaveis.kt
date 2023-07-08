package classes
// Variável Top Level
val diretamenteNoArquivo = "Bom dia"
// Função Top Level
fun topLevel() {
    val local = "Fulano!"
    println("$diretamenteNoArquivo $local")
}

class Coisa {
    var variavelDeInstancia: String = "Boa noite"
    // "companion object" serve para colocar membros estático, se colocar fora vai gerar erro
    companion object {
        @JvmStatic val constanteDeClasse = "Ciclano" // "@JvmStatic" declarando explicitamente um membro estático, mas pode usar Top Level
    }

    fun fazer() {
        val local: Int = 7

        if (local > 3) {
            val variavelDeBloco = "Beltrano"
            println("$variavelDeInstancia, $constanteDeClasse, $local e $variavelDeBloco!")
        }
    }
}

fun main(args: Array<String>) {
    topLevel()
    Coisa().fazer() // "Coisa()" acessando a partir de uma instância a função ".fazer()"
    println(Coisa.constanteDeClasse)
}