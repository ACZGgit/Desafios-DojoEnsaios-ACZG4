package ensaio2ListaDeExerciciosPOO.exercicio2

import ensaio2ListaDeExerciciosPOO.exercicio1.JogadorDeFotebol
import ensaio2ListaDeExerciciosPOO.exercicio1.Posicao
import ensaio2ListaDeExerciciosPOO.exercicio2.Aluno
import groovy.test.GroovyTestCase
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test


class AlunoTest extends GroovyTestCase {

    static Aluno aluno

    @BeforeAll
    static void instanciarAluno() {

        aluno = new Aluno(
                "231123654123",
                "Gesrivaldo Pinto",
                8.3,
                4.6,
                7
        )

    }


    @Test
    void calculaMediaFinalAluno() {
        //given
        Double expect = 6.6
        //when
        Double actual = aluno.mediaTotal().trunc(1)

        //then
        assertEquals(expect, actual)
    }

    @Test
    void calculaNotaFaltanteParaAprovacaoTest() {

        //given
        Double notaMinima = 7.0
        Double expect = 0.3

        //when
        Double actual = aluno.calculoNotaFaltanteParaAprovacao(notaMinima).trunc(1)

        //then
        assertEquals(expect, actual)
    }

    @Test
    void calculaNotaFaltanteParaAprovacao2Test() {

        //given
        Double notaMinima = 6.0
        Double expect = 0

        //when
        Double actual = aluno.calculoNotaFaltanteParaAprovacao(notaMinima).trunc(1)

        //then
        assertEquals(expect, actual)
    }

}


