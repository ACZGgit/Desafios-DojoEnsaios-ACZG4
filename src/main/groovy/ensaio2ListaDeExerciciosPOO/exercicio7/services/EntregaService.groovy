package ensaio2ListaDeExerciciosPOO.exercicio7.services

import ensaio2ListaDeExerciciosPOO.exercicio7.entities.Endereco
import ensaio2ListaDeExerciciosPOO.exercicio7.entities.Entregador

import static java.lang.Math.sqrt

class EntregaService {

  double calcularDistancia(Endereco enderecoInicial, Endereco enderecoFinal) {
    double distancia =  sqrt(Math.pow(enderecoFinal.getX() - enderecoInicial.getX(), 2) +
      Math.pow((enderecoFinal.getY() - enderecoInicial.getY()), 2));
    return distancia
  }

  double calcularDistanciaEntrega(List<Endereco> enderecos) {
    double distanciaEntregadorRestaurante = calcularDistancia(enderecos.get(0), enderecos.get(1))
    double distanciaRestauranteEntrega = calcularDistancia(enderecos.get(1), enderecos.get(2))
    double distanciaTotal = distanciaRestauranteEntrega + distanciaEntregadorRestaurante

    return distanciaTotal
  }

//  BigDecimal calcularValorEntrega(BigDecimal precoPedido,
//                                  Entregador entregador,
//                                  Endereco enderecoRestaurante) {
//
//   double distanciaEntregadorRestaurante =  this
//     .calcularDistancia(enderecoRestaurante,
//     entregador.getPosicaoAtual())
//
//
//  }
}
