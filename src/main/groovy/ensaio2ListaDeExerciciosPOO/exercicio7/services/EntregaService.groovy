package ensaio2ListaDeExerciciosPOO.exercicio7.services

import ensaio2ListaDeExerciciosPOO.exercicio7.entities.Endereco
import ensaio2ListaDeExerciciosPOO.exercicio7.entities.Entregador
import ensaio2ListaDeExerciciosPOO.exercicio7.entities.Pedido

import java.sql.Timestamp
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import static java.lang.Math.sqrt

class EntregaService {

  PedidoService pedidoService = new PedidoService()

  double calcularDistancia(Endereco enderecoInicial, Endereco enderecoFinal) {
    double distancia =  sqrt(Math.pow(enderecoFinal.getX() - enderecoInicial.getX(), 2) +
      Math.pow((enderecoFinal.getY() - enderecoInicial.getY()), 2))
    return distancia
  }

  double calcularDistanciaEntrega(List<Endereco> enderecos) {
    double distanciaEntregadorRestaurante = calcularDistancia(enderecos.get(0), enderecos.get(1))
    double distanciaRestauranteEntrega = calcularDistancia(enderecos.get(1), enderecos.get(2))
    double distanciaTotal = distanciaRestauranteEntrega + distanciaEntregadorRestaurante

    return distanciaTotal
  }

  BigDecimal calcularValorEntrega(Pedido pedido, List<Endereco> enderecos,
                                  Entregador entregador) {
    double distanciaEntrega = this.calcularDistanciaEntrega(enderecos)
    double valorTotal = distanciaEntrega * entregador.getPrecoPorKm() +
      pedidoService.calcularValorTotal(pedido)

    if (pedidoService.calcularPeso(pedido) > 10) {
      double pesoPedido = pedidoService.calcularPeso(pedido)
      double pesoExcedente = pesoPedido - 10
      valorTotal += pesoExcedente * entregador.precoPorKg
    }

    return valorTotal
  }

  double calcularTempoEntregaEmHoras(List<Endereco> enderecos, Entregador entregador) {
    double distanciaTotal = calcularDistanciaEntrega(enderecos)
    double velocidade = entregador.getVelocidadeDeDeslocamento()
    double tempo = distanciaTotal / velocidade
    return tempo
  }


}
