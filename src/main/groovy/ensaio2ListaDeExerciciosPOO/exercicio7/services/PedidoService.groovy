package ensaio2ListaDeExerciciosPOO.exercicio7.services

import ensaio2ListaDeExerciciosPOO.exercicio7.entities.Pedido

class PedidoService {
  double calcularPeso(Pedido pedido) {
    double pesoTotal = 0
    pedido.getAlimentos().forEach {it ->
      pesoTotal += it.getPeso()
    }
    return pesoTotal
  }

  double calcularValorTotal(Pedido pedido) {
    double valorTotal = 0

  }
}
