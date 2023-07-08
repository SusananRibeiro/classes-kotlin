package classes
class Calculadora {
    private var resultado: Int = 0 // variavel de instância, vai pertencer a cada objeto criado

    fun somar(vararg valores: Int): Calculadora {
        valores.forEach { resultado += it } // "it" significa "item corrente", pertencente às funções lambdas
        return this // significa que vai retorna a classe Calculadora
    }

    fun multiplicar(valor: Int): Calculadora {
        resultado *= valor
        return this // significa que vai retorna a classe Calculadora
    }

    fun limpar(): Calculadora {
        resultado = 0
        return this // significa que vai retorna a classe Calculadora
    }

    fun print(): Calculadora {
        println(resultado)
        return this // significa que vai retorna a classe Calculadora
    }

    fun obterResultado(): Int {
        return resultado
    }
}
fun main(args: Array<String>) {
    val calculadora = Calculadora()
    calculadora.somar(1, 2, 3).multiplicar(3).print() // Encadeamento de funções (Chaining)
    calculadora.somar(7, 10).print().limpar() // Encadeamento de funções (Chaining)

    println(calculadora.obterResultado())
}