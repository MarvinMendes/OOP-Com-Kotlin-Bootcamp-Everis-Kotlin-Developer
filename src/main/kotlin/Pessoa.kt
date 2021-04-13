abstract class Pessoa(val nome: String, val cpf: String, internal val senha: String) {
    open fun pessoaInfo() = "Nome $nome, CPF: $cpf"
}