import java.math.BigDecimal

fun main(args: Array<String>) {

    val cliente: Pessoa = Cliente("Marvin", "1231324324", ClienteTipoEnum.PF, "123")
    val contaCorrente: Conta = Conta(
            numero = "123", agencia = "9856", titular = cliente, saldo = BigDecimal(80000)
    )

    val banco: Banco = Banco("DigitaOne", 13)

    println(contaCorrente)
    println(banco.info())

    //Enum
    println(ClienteTipoEnum.PF.descricao)
    ClienteTipoEnum.values().forEach {
        println("${it.name} - ${it.descricao} " )
    }
    //Abstração de pessoa - especialização cliente
    println(cliente.pessoaInfo())

    //Abstração de funcionário
    val gerente: Gerente = Gerente("Mario", "23737373", BigDecimal(10000),"231")
    println(gerente.pessoaInfo() + "salario> ${gerente.mostraSalario()}")
    gerente.bonus()
    println(gerente.pessoaInfo() + "salario> ${gerente.mostraSalario()}")

    val coordenador: Coordenador = Coordenador("Maria", "123141241", BigDecimal(7053), "123")
    println(coordenador.pessoaInfo() + " Salário: ${coordenador.mostraSalario()}")
    coordenador.bonus()
    println(coordenador.pessoaInfo() + " Salário: ${coordenador.mostraSalario()}")
}