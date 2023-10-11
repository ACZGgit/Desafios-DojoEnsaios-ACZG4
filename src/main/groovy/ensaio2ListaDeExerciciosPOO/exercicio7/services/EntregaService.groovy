package ensaio2ListaDeExerciciosPOO.exercicio7.services

import ensaio2ListaDeExerciciosPOO.exercicio7.entities.Endereco

import static java.lang.Math.sqrt

class EntregaService {

  double calcularDistancia(Endereco enderecoInicial, Endereco enderecoFinal) {
    double distancia =  sqrt(Math.pow(enderecoFinal.getX() - enderecoInicial.getX(), 2) +
      Math.pow((enderecoFinal.getY() - enderecoInicial.getY()), 2));
    return distancia
  }
}
