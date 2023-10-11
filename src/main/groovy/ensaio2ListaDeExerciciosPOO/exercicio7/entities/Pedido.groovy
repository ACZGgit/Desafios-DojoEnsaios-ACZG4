package ensaio2ListaDeExerciciosPOO.exercicio7.entities;

public class Pedido {
  List<Alimento> alimentos;
  BigDecimal preco;
  Endereco enderecoEntrega;

  Pedido(List<Alimento> alimentos, BigDecimal preco, Endereco enderecoEntrega) {
    this.alimentos = alimentos
    this.preco = preco
    this.enderecoEntrega = enderecoEntrega
  }

  Endereco getEnderecoEntrega() {
    return enderecoEntrega
  }

  void setEnderecoEntrega(Endereco enderecoEntrega) {
    this.enderecoEntrega = enderecoEntrega
  }

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

}
