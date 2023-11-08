package ensaio2ListaDeExerciciosPOO.exercicio2

import groovy.transform.Canonical

@Canonical
class Aluno {

    private String matricula
    private String nome
    private Double prova1
    private Double prova2
    private Double trabalho

    Aluno(String matricula, String nome, Double prova1, Double prova2, Double trabalho) {
        this.matricula = matricula
        this.nome = nome
        this.prova1 = prova1
        this.prova2 = prova2
        this.trabalho = trabalho
    }

    String getMatricula() {
        return matricula
    }

    String getNome() {
        return nome
    }

    Double getProva1() {
        return prova1
    }

    Double getProva2() {
        return prova2
    }

    Double getTrabalho() {
        return trabalho
    }

    Double mediaTotal(){

        Double media = ((this.prova1 * 2.5) + (this.prova2 * 2.5) + (this.trabalho * 2)) / 7
        return media

    }

    double calculoNotaFaltanteParaAprovacao(Double notaMinima){

        double nota = notaMinima - this.mediaTotal()

        if(nota>0) {
            return nota
        }
        return 0

    }
}
