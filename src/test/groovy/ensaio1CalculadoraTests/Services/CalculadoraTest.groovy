package ensaio1CalculadoraTests.Services

import ensaio1Calculadora.services.CalculadoraCientificaService
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    static CalculadoraCientificaService calculadoraCientificaService;

    @BeforeAll
    static void instanciaDietaService(){
        calculadoraCientificaService = new CalculadoraCientificaService();
    }

    @Test
    void getLastResult() {

    }

    @Test
    void setLastResult() {

    }

    @Test
    void sum() {
        //Given:
        int value1         = 2;
        int value2         = 2;
        int expectedResult = 4;

        //When:
        double resultObtained = calculadoraCientificaService.sum(2,2);

        //Then:
        assertEquals(expectedResult, resultObtained);
    }

}
