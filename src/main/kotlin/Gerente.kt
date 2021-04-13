import java.math.BigDecimal

class Gerente(nome: String, cpf: String, salario: BigDecimal, senha: String) : Funcionario(nome, cpf, salario, senha) {
    override fun bonus() {
        val bonus = this.salario * BigDecimal(0.50)
        val valorConvertido = bonus.toDouble()
        println("O bônus é de:  ${Math.round(valorConvertido)}")
    }

    override fun mostraSalario() {
      return println("O salário do funcionário ${this.nome} é R$ ${Math.round(this.salario.toFloat())}")
    }


}
