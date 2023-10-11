package ensaio2ListaDeExerciciosPOO.exercicio7.services

import ensaio2ListaDeExerciciosPOO.exercicio7.entities.Endereco

import static java.lang.Math.sqrt

class EntregaService {

  public double calcularDistancia(Endereco endereco, Endereco endereco2) {
    double distancia =  sqrt(Math.pow(endereco2.getX() - endereco1.getX(),
      2) +
      Math.pow((endereco2.getY() - endereco1.getY()), 2));

    return distancia
  }
}
