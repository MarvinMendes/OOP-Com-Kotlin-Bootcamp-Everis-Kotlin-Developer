import javafx.util.converter.BigDecimalStringConverter
import java.math.BigDecimal
import java.math.MathContext
import java.text.NumberFormat
import java.util.*

class Coordenador(nome: String, cpf: String, salario: BigDecimal, senha: String) : Funcionario(nome, cpf, salario, senha) {
    override fun bonus() {
        val bonus = this.salario * BigDecimal(0.40)
        val valorConvertido = bonus.toDouble()
        println("O bônus é de: ${Math.round(valorConvertido)}")
    }

    override fun mostraSalario() {
        println( "O salário do funcionário ${this.nome} é R$ ${Math.round(salario.toDouble())}")
    }

}