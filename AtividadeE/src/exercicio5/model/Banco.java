package exercicio5.model;

public class Banco {
    private int indice;
    private Conta[] contas;

    public Banco(int quantidade) {
        this.indice = 0;
        this.contas = new Conta[quantidade];
    }

    public void inserir(Conta conta){
        this.contas[this.indice++] = conta;
    }
    private boolean estaCheia(){
        if (this.indice == this.contas.length)
            return true;
        return false;
    }

}
