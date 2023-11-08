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
    static Endereco posicaoEntregador2
    static Endereco posicaoEntregador3
    static Endereco enderecoEntrega
    static Restaurante restaurante
    static Entregador entregador
    static Entregador entregador2
    static Entregador entregador3
    static EntregaService entregaService
    static Pedido pedido
    static List<Alimento> alimentos

    @BeforeAll
    static void instanciaCenario() {

        alimentos = [new Alimento("Alimento A", 5, 3),
                     new Alimento("Alimento B", 5, 3),
                     new Alimento("Alimento C", 5, 6)
        ]

        enderecoRestaurante = new Endereco(10, 20)
        posicaoEntregador = new Endereco(30, 40)
        posicaoEntregador2 = new Endereco(20, 20)
        posicaoEntregador3 = new Endereco(15, 30)
        enderecoEntrega = new Endereco(50, 60)

        restaurante = new Restaurante("Restaurante A", enderecoRestaurante, [])
        pedido = new Pedido(alimentos, 15 as BigDecimal, enderecoEntrega)

        entregador = new Entregador("Entregador A",
          new Veiculo("Carro A", 70), 50,
            30, [], posicaoEntregador, 10 as BigDecimal, 10 as BigDecimal)
        entregador2 = new Entregador("Entregador B",
                new Veiculo("Carro B", 60), 40,
                25, [], posicaoEntregador2, 12 as BigDecimal, 12 as BigDecimal)
        entregador3 = new Entregador("Entregador C",
                new Veiculo("Carro C", 80), 60,
                35, [], posicaoEntregador3, 11 as BigDecimal, 11 as BigDecimal)


        entregaService = new EntregaService()

    }

    @Test
    void calculoDeDistanciaRestauranteEntregadorTest() {
        //given:
        double distanciaEsperada = 28.28

        //when:
        double distanciaObtida = entregaService.calcularDistancia(enderecoRestaurante, posicaoEntregador).round(2)

        //then:
        assertEquals(distanciaEsperada, distanciaObtida)
    }

    @Test
    void calculoDeDistanciaEntregaTest() {
        //given:
        double distanciaEsperada = 28.28 + 56.57

        //when:
        List<Endereco> enderecos = [ posicaoEntregador, enderecoRestaurante, enderecoEntrega]
        double distanciaObtida = entregaService
          .calcularDistanciaEntrega(enderecos)
          .round(2)

        //then:
        assertEquals(distanciaEsperada, distanciaObtida)
    }

    @Test
    void cobrancaPesoExcedenteTest() {
        //given:
        BigDecimal valorEsperado = 883.53

        //when:
        List<Endereco> enderecos = [ posicaoEntregador, enderecoRestaurante, enderecoEntrega]
        BigDecimal valorCalculado = entregaService
          .calcularValorEntrega(pedido, enderecos, entregador).round(2)

        //then:
        assertEquals(valorEsperado, valorCalculado)

    }

    @Test
    void calculoDeTempoDaEntrega() {
        //given:
        double tempoDeEntregaEsperado = 1.697

        //when:
        List<Endereco> enderecos = [ posicaoEntregador, enderecoRestaurante, enderecoEntrega]
        double tempoDeEntrega = entregaService.calcularTempoEntregaEmHoras(enderecos, entregador).round(3)

        //then:
        assertEquals(tempoDeEntregaEsperado, tempoDeEntrega)
    }

    @Test
    void processarTempoDeEntregaPorEntregadorTest() {
        //Na frente de cada tempo, consta o preço do frete, calculado pelo peso dos pedidos e km rodados na entrega;
        //given:
        String saidaEsperada = "Entregador: Entregador B, Tempo: 1.331, Preco: " +
                ""
        //when:
        pr

    }
}