package ensaio2ListaDeExerciciosPOO.exercicio7.entities;

public class Entregador {
  String nome;
  Veiculo veiculo;
  double pesoMax;
  List<Pedido> pedidos;
  Endereco posicaoAtual;
  BigDecimal precoPorKm;
  BigDecimal precoPorKg;

  Entregador(String nome, Veiculo veiculo, double pesoMax, List<Pedido> pedidos, Endereco posicaoAtual,
             BigDecimal precoPorKm, BigDecimal precoPorKg) {
    this.nome = nome
    this.veiculo = veiculo
    this.pesoMax = pesoMax
    this.pedidos = pedidos
    this.posicaoAtual = posicaoAtual
    this.precoPorKm = precoPorKm
    this.precoPorKg = precoPorKg
  }

  String getNome() {
    return nome
  }

  void setNome(String nome) {
    this.nome = nome
  }

  Veiculo getVeiculo() {
    return veiculo
  }

  void setVeiculo(Veiculo veiculo) {
    this.veiculo = veiculo
  }

  double getPesoMax() {
    return pesoMax
  }

  void setPesoMax(double pesoMax) {
    this.pesoMax = pesoMax
  }

  List<Pedido> getPedidos() {
    return pedidos
  }

  void setPedidos(List<Pedido> pedidos) {
    this.pedidos = pedidos
  }

  Endereco getPosicaoAtual() {
    return posicaoAtual
  }

  void setPosicaoAtual(Endereco posicaoAtual) {
    this.posicaoAtual = posicaoAtual
  }

  BigDecimal getPrecoPorKm() {
    return precoPorKm
  }

  void setPrecoPorKm(BigDecimal precoPorKm) {
    this.precoPorKm = precoPorKm
  }

  BigDecimal getPrecoPorKg() {
    return precoPorKg
  }

  void setPrecoPorKg(BigDecimal precoPorKg) {
    this.precoPorKg = precoPorKg
  }
}
