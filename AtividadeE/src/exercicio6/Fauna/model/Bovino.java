package exercicio6.Fauna.model;

public class Bovino extends Animal {
    private  float producaoLeite;

    public Bovino(String especie, String nome) {
        super(especie, nome);
    }

    public float getProducaoLeite() {
        return producaoLeite;
    }

    public void setProducaoLeite(float producaoLeite) {
        this.producaoLeite = producaoLeite;
    }
}
