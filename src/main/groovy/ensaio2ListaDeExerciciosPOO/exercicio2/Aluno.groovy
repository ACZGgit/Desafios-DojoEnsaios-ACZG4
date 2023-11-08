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
        Double mediaProva = ((aluno.getProva1() * 2.5) + (aluno.getProva2() * 2.5)) / 5
        Double mediaTrabalho = (aluno.getTrabalho() * 2) / 2
        Double media = (mediaProva + mediaTrabalho)/2

        return media;
    }
}
