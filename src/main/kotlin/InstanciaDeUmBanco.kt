class InstanciaDeUmBanco() {
    val listaDePessoas: ArrayList<Pessoa> = arrayListOf()
    fun adicionaPessoa(pessoa: Pessoa) {
        listaDePessoas.add(pessoa)
    }
    fun removePessoa(pessoa: Pessoa) {
        listaDePessoas.removeIf { it -> it.cpf == pessoa.cpf }.or( throw NoSuchElementException() )
    }
    fun getPessoa(pessoa: Pessoa) : List<Pessoa> {
        return listaDePessoas.filter { it -> it.cpf == pessoa.cpf }
    }

}