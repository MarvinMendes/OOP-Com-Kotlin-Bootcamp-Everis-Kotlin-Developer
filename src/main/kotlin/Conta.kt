import java.math.BigDecimal

class Conta(val agencia: String, val numero: String, val titular: Pessoa, val saldo: BigDecimal) {
    override fun toString(): String {
        return "Agência: $agencia, Conta: $numero," +
                "Titular: ${titular.pessoaInfo()}, Saldo: $saldo"

    }
}