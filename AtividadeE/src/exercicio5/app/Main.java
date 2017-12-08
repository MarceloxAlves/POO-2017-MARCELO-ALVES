package exercicio5.app;

import exercicio5.model.Banco;
import exercicio5.model.Conta;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Banco b = new Banco(10);
        Scanner sc = new Scanner(System.in);
        String opcao = "";
        do {
            System.out.println("1-Cadastrar 2-Alterar 3-Excluir 9-Sair");
                    opcao = sc.next();
            switch (opcao) {
                case "1" :

                    System.out.println("Digite o Saldo e Numero");
                    Conta c = new Conta(sc.nextDouble(),sc.nextInt());
                    b.inserir(c);
                break;
            }
        } while (!opcao.equals("9") );
    }
}