package ensaio2ListaDeExerciciosPOO.exercicio7.entities;

public class Pedido {
  List<Alimento> alimentos;
  BigDecimal preco;
  double peso;

  List<Alimento> getAlimentos() {
    return alimentos
  }

  void setAlimentos(List<Alimento> alimentos) {
    this.alimentos = alimentos
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
