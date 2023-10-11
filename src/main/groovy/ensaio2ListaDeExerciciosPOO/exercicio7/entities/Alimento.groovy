package ensaio2ListaDeExerciciosPOO.exercicio7.entities;

public class Alimento {
  String nome
  BigDecimal preco
  double peso

  String getNome() {
    return nome
  }

  void setNome(String nome) {
    this.nome = nome
  }

  BigDecimal getPreco() {
    return preco
  }

  void setPreco(BigDecimal preco) {
    this.preco = preco
  }

  double getPeso() {
    return peso
  }

  void setPeso(double peso) {
    this.peso = peso
  }
}
