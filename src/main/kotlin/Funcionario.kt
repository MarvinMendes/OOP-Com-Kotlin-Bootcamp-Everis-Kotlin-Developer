import java.math.BigDecimal

abstract class Funcionario(nome: String, cpf: String, var salario: BigDecimal, senha: String) : Pessoa(nome, cpf, senha), Logavel  {
    abstract fun bonus()
    abstract fun mostraSalario()
    //validação para saber se a senha é logável
    override fun isLogavel(senha: String): Boolean = senha.length > 0
    override fun toString(): String = "NOME: $nome, CPF: $cpf"
}