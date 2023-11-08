package ensaio2ListaDeExerciciosPOO.exercicio1

import java.time.LocalDate

class JogadorDeFotebol {

    private String nome
    private String dataNascimento
    private String nacionalidade
    private Double alturaEmMetros
    private Double pesoEmKg

    String getNome() {
        return nome
    }

    String getDataNascimento() {
        return dataNascimento
    }

    String getNacionalidade() {
        return nacionalidade
    }

    Double getAlturaEmMetros() {
        return alturaEmMetros
    }

    Double getPesoEmKg() {
        return pesoEmKg
    }

    void setNome(String nome) {
        this.nome = nome
    }

    void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento
    }

    void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade
    }

    void setAlturaEmMetros(Double alturaEmMetros) {
        this.alturaEmMetros = alturaEmMetros
    }

    void setPesoEmKg(Double pesoEmKg) {
        this.pesoEmKg = pesoEmKg
    }

    @Override
    String toString() {
        return "Nome: ${this.nome}" +
                "Posicao: ${this.posicao}" +
                "Data de nascimento: ${this.dataNascimento}" +
                "Nacionalidade: ${this.nacionalidade}" +
                "Altura: ${this.alturaEmMetros}" +
                "Peso: ${this.pesoEmKg}"
    }

    Integer CalculdaIdade() {

        Date data = this.dataNascimento
    }
}
