package ensaio2ListaDeExerciciosPOO.exercicio1

import java.time.LocalDate
import java.time.LocalDateTime

class JogadorDeFotebol {

    private String nome
    private Posicao posicao
    private String dataNascimento
    private String nacionalidade
    private Double alturaEmMetros
    private Double pesoEmKg

    JogadorDeFotebol(String nome, Posicao posicao, String dataNascimento, String nacionalidade, Double alturaEmMetros,
                     Double pesoEmKg) {
        this.nome = nome
        this.posicao = posicao
        this.dataNascimento = dataNascimento
        this.nacionalidade = nacionalidade
        this.alturaEmMetros = alturaEmMetros
        this.pesoEmKg = pesoEmKg
    }

    String getNome() {
        return nome
    }

    Posicao getPosicao() {
        return posicao
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

    void setPosicao(Posicao posicao) {
        this.posicao = posicao
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

    Integer getIdade() {
        LocalDate data
        this.dataNascimento.split("-")
        LocalDate dataAtual = LocalDate.now()

        return dataAtual.minus(data)
    }
}
