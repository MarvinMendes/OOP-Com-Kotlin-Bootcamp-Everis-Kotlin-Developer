class Cliente(nome: String, cpf: String, val tipo: ClienteTipoEnum, senha: String) : Pessoa(nome, cpf, senha), Logavel {

    override fun pessoaInfo(): String {
        return "Nome: $nome, CPF: $cpf, Tipo de Cliente: ${tipo.clienteTipoInfo()} "
    }

    override fun isLogavel(senha: String): Boolean = senha.length > 0
}