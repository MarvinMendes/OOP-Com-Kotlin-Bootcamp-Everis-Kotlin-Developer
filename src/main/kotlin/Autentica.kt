import kotlin.math.log

abstract class Autentica {
    companion object {
        //para estar autenticado deve verificar a regra de ser logável e as senhas passadas por parâmetro devem ser iguais
       fun estaAutenticado(logavel: Logavel,login: Pessoa, senha: String) {
           if (logavel.isLogavel(senha) && login.senha == senha) {
               println("O usuário ${login.nome} está autenticado na plataforma")
           }
            else {
               println("O usuário ${login.nome} não foi autenticado com sucesso")
           }
       }
    }



}