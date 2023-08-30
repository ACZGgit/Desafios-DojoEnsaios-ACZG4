package ensaio1CalculadoraTests.Services

import ensaio1Calculadora.services.CalculadoraCientificaService
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    static CalculadoraCientificaService calculadoraCientificaService

    @BeforeAll
    static void instanciaDietaService(){
        calculadoraCientificaService = new CalculadoraCientificaService()
    }

    @Test
    void getLastResult() {

    }

    @Test
    void setLastResult() {

    }

    @Test
    void somaDeDoisValores() {
        //Given:
        int value1         = 2
        int value2         = 2
        int expectedResult = 4

        //When:
        double resultObtained = calculadoraCientificaService.sum(value1, value2)

        //Then:
        assertEquals(expectedResult, resultObtained)
    }

    @Test
    void subtracaoDeDoisValores(){
        //Given
        int value1 = 2
        int value2 = 3
        int expectResult = -1

        //When
        double resultObtained = calculadoraCientificaService.sub(value1, value2)

        //Then
        assertEquals(expectResult, resultObtained)
    }
    @Test
    void divisaDeDoisValores(){
        //Given
        int value1 = 6
        int value2 = 0
        int expectResult = 3

        //When
        double resultObtained = calculadoraCientificaService.div(value1, value2)

        //Then
        assertEquals(expectResult, resultObtained)
    }

    @Test
    void multiplicaDoisValores(){
        //Given
        int value1 = 3
        int value2 = 4
        int expectResult = 12

        //When
        double resultObtained = calculadoraCientificaService.mult(value1, value2)

        //Then
        assertEquals(expectResult, resultObtained)
    }

    @Test
    void raizQuadrada(){
        //Given
        int value1 = 25
        int expectResult = 5

        //When
        double resultObtained = calculadoraCientificaService.raizQuadrada(value1)

        //Then
        assertEquals(expectResult, resultObtained)
    }
}
