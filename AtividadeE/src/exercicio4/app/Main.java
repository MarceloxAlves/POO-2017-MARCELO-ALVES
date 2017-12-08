package exercicio4.app;

import exercicio4.model.Pilha;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.empilhar(5);
        pilha.empilhar(4);
        pilha.empilhar(3);
        pilha.empilhar(2);
        pilha.empilhar(1);
        System.out.println(pilha.exibir());
        System.out.println(pilha.retornarTopo());
    }
}
