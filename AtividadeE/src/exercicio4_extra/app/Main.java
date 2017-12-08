package exercicio4_extra.app;

import exercicio4_extra.model.Pilha;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(50);
        pilha.empilhar(5);
        pilha.empilhar(4);
        System.out.println(pilha.exibir());
        System.out.println(pilha.retornarTopo());
    }
}
