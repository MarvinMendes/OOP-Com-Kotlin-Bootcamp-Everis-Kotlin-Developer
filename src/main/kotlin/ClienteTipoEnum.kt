enum class ClienteTipoEnum(val descricao: String) {
    PF("Pessoa Física"),
    PJ("Pessoa Jurídica");

    fun clienteTipoInfo() = "${this.name} - ${this.descricao}"

}