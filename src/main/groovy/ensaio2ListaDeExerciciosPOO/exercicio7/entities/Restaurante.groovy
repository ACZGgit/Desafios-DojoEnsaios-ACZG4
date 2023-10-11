package ensaio2ListaDeExerciciosPOO.exercicio7.entities;

public class Restaurante {

	String nome
	Endereco endereco
	List<Alimento> cardapio

	Restaurante(String nome, Endereco endereco, List<Alimento> cardapio) {
		this.nome = nome
		this.endereco = endereco
		this.cardapio = cardapio
	}

	String getNome() {
		return nome
	}

	void setNome(String nome) {
		this.nome = nome
	}

	Endereco getEndereco() {
		return endereco
	}

	void setEndereco(Endereco endereco) {
		this.endereco = endereco
	}

	List<Alimento> getCardapio() {
		return cardapio
	}

	void setCardapio(List<Alimento> cardapio) {
		this.cardapio = cardapio
	}
}
