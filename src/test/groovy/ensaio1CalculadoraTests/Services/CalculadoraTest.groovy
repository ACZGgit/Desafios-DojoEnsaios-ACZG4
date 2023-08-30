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
        int value2 = 2
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

    @Test
    void potenciaValores(){
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
    void porcentagemValores(){
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
    void log(){
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
    void testaSeno(){
        //Given
        int value1 = 30
        double expectResult = 0.5

        //When
        double resultObtained = calculadoraCientificaService.seno(value1).round(1)

        //Then
        assertEquals(expectResult, resultObtained)
    }

    @Test
    void testaCosseno(){
        //Given
        int value1 = 60
        double expectResult = 0.5

        //When
        double resultObtained = calculadoraCientificaService.cosseno(value1).round(1)

        //Then
        assertEquals(expectResult, resultObtained)
    }

    @Test
    void testaTangente(){
        //Given
        int value1 = 45
        double expectResult = 1

        //When
        double resultObtained = calculadoraCientificaService.tangente(value1).round(1)

        //Then
        assertEquals(expectResult, resultObtained)
    }

    @Test
    void testSecante(){
        //Given
        int value1 = 60
        double expectResult = 2

        //When
        double resultObtained = calculadoraCientificaService.secante(value1).round(1)

        //Then
        assertEquals(expectResult, resultObtained)
    }

    @Test
    void testCosecante(){
        //Given
        int value1 = 30
        double expectResult = 2

        //When
        double resultObtained = calculadoraCientificaService.cosecante(value1).round(1)

        //Then
        assertEquals(expectResult, resultObtained)
    }


    @Test
    void testCotangente(){
        //Given
        int value1 = 45
        double expectResult = 1

        //When
        double resultObtained = calculadoraCientificaService.cotangente(value1).round(1)

        //Then
        assertEquals(expectResult, resultObtained)
    }

    @Test
    void testaSomaDeVariosTermos() {
        // Given
        List numbers = [2.0, 3.5, 4.0]
        double expectResult = 9.5

        // When
        double resultObtained = calculadoraCientificaService.
    }


}
