package testes

import Analista
import Cliente
import Conta
import Coordenador
import Gerente
import java.math.BigDecimal

fun main() {

    //instanciando classe especifica de pessoa
    val cliente = Cliente(nome = "Gilberto", cpf = "123.123.321.12", ClienteTipoEnum.PF, senha = "senhaPadrao")
    println("********************Cliente********************")
    println(cliente.pessoaInfo())
    Autentica.estaAutenticado(cliente, cliente, "senhaPadrao")

    //instanciando classe especifica de funcionário

    val funcionarioUm = Gerente("Felipe", "456.465.444.44", BigDecimal.valueOf(13000), "senhaPadrao")
    println("********************Gerente********************")
    println(funcionarioUm)
    funcionarioUm.mostraSalario()
    funcionarioUm.bonus()
    Autentica.estaAutenticado(funcionarioUm, funcionarioUm, "senhaPadrao")

    val funcionarioDois = Coordenador("Eduardo", "999.999.999.99", BigDecimal(9000), "errandoASenha")
    println("********************Coordenador********************")
    println(funcionarioDois)
    funcionarioDois.mostraSalario()
    funcionarioDois.bonus()
    Autentica.estaAutenticado(funcionarioDois, funcionarioDois, "AgoraDeveDarErro")

    val funcionarioTres = Analista("Marvin Mendes Lopes", "777.777.777.77", "senha@123", BigDecimal(5000))
    println("********************Analista********************")
    println(funcionarioTres)
    funcionarioTres.mostraSalario()
    funcionarioTres.bonus()
    Autentica.estaAutenticado(funcionarioTres, funcionarioTres, "senha@123")

    //criando uma conta
    val contaUm = Conta(agencia = "132", numero = "97485-8" , funcionarioTres, BigDecimal(80000))
    println(contaUm)

}