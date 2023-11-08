//package ensaio2ListaDeExerciciosPOO.exercicio1
//
//import groovy.test.GroovyTestCase
//import org.junit.jupiter.api.BeforeAll
//import org.junit.jupiter.api.Test
//
//
//class JogadorDeFotebolTest extends GroovyTestCase{
//
//    static JogadorDeFotebol jogadorDeFotebol
//
//    @BeforeAll
//    static void instanciaIdentificadorDePalavrasService() {
//
//        jogadorDeFotebol = new JogadorDeFotebol(
//                "Gesrivaldo Pinto",
//                Posicao.ATACANTE,
//                "1500-02-29",
//                "brasileiro",
//                1.60,
//                90
//        )
//
//    }
//
//
//    @Test
//    void calculaIdadeDoJogadorTest() {
//        //given:
//        int idadeEsperadaEmAnos = 523
//
//        //when:
//        int idadeObtida = jogadorDeFotebol.getIdade()
//
//        //then:
//        assertEquals(idadeEsperadaEmAnos, idadeObtida);
//    }
//
//    @Test
//    void calculaTempoParaJogadorAposentarTest() {
//        //given:
//        int idadeDoJogador                    = 523
//        int tempoParaAtacanteAposentar        = 35
//        int tempoEsperadoParaJogadorAposentar = tempoParaAtacanteAposentar - idadeDoJogador
//
//        //when:
//        int tempoObtidoParaJogadorAposentar = jogadorDeFotebol.getTempoParaAposentar()
//
//        //then:
//        assertEquals(tempoEsperadoParaJogadorAposentar, tempoObtidoParaJogadorAposentar);
//    }
//
//}


