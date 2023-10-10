package ensaio3.desafio.onetwothree.tests

import ensaio3.desafio.onetwothree.IdentificadorDePalavrasService
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertEquals

class IdentificadorDePalavrasServiceTest {

    static IdentificadorDePalavrasService identificadorService;

    @BeforeAll
    static void instanciaIdentificadorDePalavrasService(){

        identificadorService = new IdentificadorDePalavrasService();

    }

    @Test
    void entrada1Test() {
        //given:
        String palavrasDeEntrada = "3,owe,too,theee";
        String saidaEsperada = "1,2,3";

        //when:
        String resultadoObtido = identificadorService.execute(palavrasDeEntrada);

        //then:
        assertEquals(saidaEsperada , resultadoObtido);
    }

}
