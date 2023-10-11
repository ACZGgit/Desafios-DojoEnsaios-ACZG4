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
    static EntregaService entregaService

    @BeforeAll
    static void instanciaIdentificadorDePalavrasService() {
        enderecoRestaurante = new Endereco(10, 20)
        posicaoEntregador = new Endereco(30, 40)
        restaurante = new Restaurante("Restaurante A", enderecoRestaurante, [])

        entregador = new Entregador("Entregador A",
          new Veiculo("Carro A", 70),
            30, [], posicaoEntregador, 10 as BigDecimal, 10 as BigDecimal)

        entregaService = new EntregaService()
    }

    @Test
    void calculoDeDistanciaTest() {
        //given:
        double distanciaEsperada = 28.28

        //when:
        double distanciaObtida = entregaService.calcularDistancia(enderecoRestaurante, posicaoEntregador).round(2)

        //then:
        assertEquals(distanciaEsperada, distanciaObtida)
    }

    @Test
    void cobrancaPesoExcedenteTest() {
        //given:
        BigDecimal valorEsperado =

        //when:
        BigDecimal valorCalculado = entregaService.calcularValorEntrega(precoPedido, entregador)

        //then:
        as

    }


}
