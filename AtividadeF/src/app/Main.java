package app;
import model.*;

public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente(1000,1);
        Conta contaPoupanca = new ContaPoupanca(1000,1);

        AtualizadorDeContas atualizadorDeContas = new AtualizadorDeContas(0.01);

        atualizadorDeContas.roda(contaCorrente);
        atualizadorDeContas.roda(contaPoupanca);

        System.out.println("Saldo Total: " + atualizadorDeContas.getSaldoTotal());
    }
}
