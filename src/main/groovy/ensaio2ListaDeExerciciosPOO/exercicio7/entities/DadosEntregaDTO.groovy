package ensaio2ListaDeExerciciosPOO.exercicio7.entities

class DadosEntregaDTO {

    String nomeEntregador
    Double tempoEntrega
    Double valorEntrega

    DadosEntregaDTO(String nomeEntregador, Double tempoEntrega, Double valorEntrega) {
        this.nomeEntregador = nomeEntregador
        this.tempoEntrega = tempoEntrega
        this.valorEntrega = valorEntrega
    }

    @Override
    String toString(){
        return "Entregador: ${this.nomeEntregador}, Tempo: ${this.tempoEntrega.trunc(3)}, " + 'Preco: R$ ' + "${this.valorEntrega.round(2)}\n"
    }
}
