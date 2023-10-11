package ensaio2ListaDeExerciciosPOO.exercicio7.services

import ensaio2ListaDeExerciciosPOO.exercicio1.JogadorDeFotebol
import ensaio2ListaDeExerciciosPOO.exercicio7.entities.Alimento
import ensaio2ListaDeExerciciosPOO.exercicio7.entities.Endereco
import ensaio2ListaDeExerciciosPOO.exercicio7.entities.Entregador
import ensaio2ListaDeExerciciosPOO.exercicio7.entities.Pedido
import ensaio2ListaDeExerciciosPOO.exercicio7.entities.Restaurante
import ensaio2ListaDeExerciciosPOO.exercicio7.entities.Veiculo
import groovy.test.GroovyTestCase
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test


class EntregaServiceTest extends GroovyTestCase {

    static Endereco enderecoRestaurante
    static Endereco posicaoEntregador
    static Restaurante restaurante
    static Entregador entregador

    @BeforeAll
    static void instanciaIdentificadorDePalavrasService() {
        Endereco enderecoRestaurante = new Endereco(10, 20)
        Endereco posicaoEntregador = new Endereco(30, 40)
        restaurante = new Restaurante("Restaurante A", enderecoRestaurante, [])

        entregador = new Entregador("Entregador A",
          new Veiculo("Carro A", 70),
            30, [], posicaoEntregador, 10 as BigDecimal, 10 as BigDecimal)

    }

    @Test
    void calculoDeDistanciaTest() {
        //given:
        double distanciaEsperada = 28.284271247462

        //when:
        double distanciaObtida = EntregaService
          .calcularDistancia(enderecoRestaurante, posicaoEntregador)

        //then:
        assertEquals(distanciaEsperada, distanciaObtida)
    }




}
