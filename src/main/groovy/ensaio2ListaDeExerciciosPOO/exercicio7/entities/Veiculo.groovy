package ensaio2ListaDeExerciciosPOO.exercicio7.entities;

public class Veiculo {
	String nome;
	final double velocidadeMax;

	public Veiculo(double velocidadeMax) {this.velocidadeMax = velocidadeMax;}

	Veiculo(String nome, double velocidadeMax) {
		this.nome = nome
		this.velocidadeMax = velocidadeMax
	}
}
