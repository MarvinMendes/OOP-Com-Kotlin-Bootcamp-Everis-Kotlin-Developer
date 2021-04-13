import java.math.BigDecimal
import java.util.*

class Analista(nome: String, cpf: String, senha: String, salario: BigDecimal) : Funcionario(nome, cpf, salario, senha), Logavel {
    override fun bonus() {
        val bonus = this.salario * BigDecimal(0.35)
        val valorConvertido = bonus.toDouble()
        println("O bônus de analista é de R$${Math.round(valorConvertido)}")
    }

    override fun mostraSalario() {
        println("O salário de ${this.nome} é de R$${this.salario}")
    }
}