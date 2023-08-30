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
    void testeSomaDeDoisValores() {
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
    void testeSubtracaoDeDoisValores(){
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
    void testeDivisaDeDoisValores(){
        //Given
        int value1 = 6
        int value2 = 2
        int expectResult = 3

        //When
        double resultObtained = calculadoraCientificaService.div(value1, value2)

        //Then
        assertEquals(expectResult, resultObtained)
    }

    @Test
    void testeMultiplicaDoisValores(){
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
    void testeRaizQuadrada(){
        //Given
        int value1 = 25
        int expectResult = 5

        //When
        double resultObtained = calculadoraCientificaService.raizQuadrada(value1)

        //Then
        assertEquals(expectResult, resultObtained)
    }

    @Test
    void testePotenciaValores(){
        //Given
        int value1 = 2
        int value2 = 4
        int expectResult = 16

        //When
        double resultObtained = calculadoraCientificaService.pot(value1, value2)

        //Then
        assertEquals(expectResult, resultObtained)
    }

    @Test
    void testePorcentagemValores(){
        //Given
        int value1 = 150
        int value2 = 20
        int expectResult = 30

        //When
        double resultObtained = calculadoraCientificaService.porcentagem(value1, value2)

        //Then
        assertEquals(expectResult, resultObtained)
    }

    @Test
    void testeLog(){
        //Given
        int value1 = 2
        int value2 = 4
        int expectResult = 2

        //When
        double resultObtained = calculadoraCientificaService.log(value1, value2)

        //Then
        assertEquals(expectResult, resultObtained)
    }

    @Test
    void testeSeno(){
        //Given
        int value1 = 30
        double expectResult = 0.5

        //When
        double resultObtained = calculadoraCientificaService.seno(value1).round(1)

        //Then
        assertEquals(expectResult, resultObtained)
    }

    @Test
    void testeCosseno(){
        //Given
        int value1 = 60
        double expectResult = 0.5

        //When
        double resultObtained = calculadoraCientificaService.cosseno(value1).round(1)

        //Then
        assertEquals(expectResult, resultObtained)
    }

    @Test
    void testeTangente(){
        //Given
        int value1 = 45
        double expectResult = 1

        //When
        double resultObtained = calculadoraCientificaService.tangente(value1).round(1)

        //Then
        assertEquals(expectResult, resultObtained)
    }

    @Test
    void testeSecante(){
        //Given
        int value1 = 60
        double expectResult = 2

        //When
        double resultObtained = calculadoraCientificaService.secante(value1).round(1)

        //Then
        assertEquals(expectResult, resultObtained)
    }

    @Test
    void testeCosecante(){
        //Given
        int value1 = 30
        double expectResult = 2

        //When
        double resultObtained = calculadoraCientificaService.cosecante(value1).round(1)

        //Then
        assertEquals(expectResult, resultObtained)
    }


    @Test
    void testeCotangente(){
        //Given
        int value1 = 45
        double expectResult = 1

        //When
        double resultObtained = calculadoraCientificaService.cotangente(value1).round(1)

        //Then
        assertEquals(expectResult, resultObtained)
    }

    @Test
    void testeSomaDeVariosTermos() {
        // Given
        List numbers = [2.0, 3.5, 4.0]
        double expectResult = 9.5

        // When
        double resultObtained = calculadoraCientificaService.somaDeVariosTermos(numbers)

        // Then
        assertEquals(expectResult, resultObtained)
    }

    @Test
    void testeRaizEnessimaDeX() {
        // Given
        double num = 8
        double term = 3
        double expectResult = 2

        // When
        double resultObtained = calculadoraCientificaService.raizEnessimaDeX(num , term)

        // Then
        assertEquals(expectResult, resultObtained)
    }

    @Test
    void testeFatorial() {
        // Given
        double num = 5
        double expectResult = 120

        // When
        double resultObtained = calculadoraCientificaService.fatorial(num)

        // Then
        assertEquals(expectResult, resultObtained)
    }

}
