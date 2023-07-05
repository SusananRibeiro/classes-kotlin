package classes
class Pessoa1(var nome: String)
class Pessoa2(val nome: String)
class Pessoa3(nomeInicial: String) { // Se não colocar “var” ou “val” na declaração, está dizendo que essa variável vai ser usada apenas no processo de inicialização, ou seja, não vai ser usado para criar nem um atributo de instância ou um atributo de objeto.
    val nome: String = nomeInicial
}
fun main(args: Array<String>) {
    val p1 = Pessoa1(nome = "João")
    p1.nome = "Guilherme"
    println("${p1.nome} sabe programar!")

    val p2 = Pessoa2("Maria")
    val p3 = Pessoa3(nomeInicial = "Pedro")
    println("${p2.nome} e ${p3.nome} são legais!")
}