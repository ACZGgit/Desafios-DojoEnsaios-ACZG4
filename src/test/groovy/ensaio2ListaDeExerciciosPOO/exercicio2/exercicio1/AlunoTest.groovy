package ensaio2ListaDeExerciciosPOO.exercicio2.exercicio1

import ensaio2ListaDeExerciciosPOO.exercicio1.JogadorDeFotebol
import ensaio2ListaDeExerciciosPOO.exercicio1.Posicao
import groovy.test.GroovyTestCase
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test


class AlunoTest extends GroovyTestCase{

    static Aluno aluno

    @BeforeAll
    static void instanciaIdentificadorDePalavrasService() {

        aluno = new Aluno(
                "231123654123",
                "Gesrivaldo Pinto",
                8.3,
                4.6,
                7
        )

    }


    @Test
    void calculaIdadeDoJogadorTest() {
        //given:
        int idadeEsperadaEmAnos = 523

        //when:
        int idadeObtida = jogadorDeFotebol.getIdade()

        //then:
        assertEquals(idadeEsperadaEmAnos, idadeObtida);
    }

}


