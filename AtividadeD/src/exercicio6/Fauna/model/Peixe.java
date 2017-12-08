package exercicio6.Fauna.model;

public class Peixe extends Animal {
    private int profundidade;

    public Peixe(String especie, String nome) {
        super(especie, nome);
    }

    public int getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(int profundidade) {
        this.profundidade = profundidade;
    }
}
