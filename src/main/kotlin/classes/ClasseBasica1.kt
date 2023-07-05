package classes
class Cliente {
    var nome: String = ""
}
fun main(args: Array<String>) {
    val cliente = Cliente() // criar objeto, ou seja, chamar o construtor da classe para instanciar um objeto
    cliente.nome = "João" // Notação Ponto deve ser usada quando se quer acessar membros de um objeto
    print("O cliente é ${cliente.nome}")
}