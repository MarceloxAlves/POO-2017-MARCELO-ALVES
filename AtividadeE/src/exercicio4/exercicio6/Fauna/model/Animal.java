package exercicio6.Fauna.model;

public abstract class  Animal {
    private String especie;
    private String nome;

    public Animal(String especie, String nome) {
        this.especie = especie;
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getNome() {
        return nome;
    }
}
