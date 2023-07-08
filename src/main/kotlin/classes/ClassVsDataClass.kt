package classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main(args: Array<String>) {
    val g1 = Geladeira("Brastemp", 320)
    val g2 = Geladeira("Brastemp", 320)

    println(g1 == g2) // false -> equals, nesse vai comparar referência de memória (endereço de memória), já que o equals não foi implementado

    val tv1 = Televisao("Sansung", 32)
    val tv2 = Televisao("Sansung", 32)

    println(tv1 == tv2) // true -> para fazer o equals, o Data Class comparar todos os valores dos atributos do objeto
    println(tv1 === tv2) // false -> "===" esse compara a referência de memória (endereço de memória) também, não só o valor dos atributos
    println(tv1.toString())
    println(tv1.copy())
    println(tv1.copy(polegadas = 42))

    // Destructuring em data class, somente em classes "data class"
    val (marca, pol) = tv1
    println("$marca $pol'")
}