package app;

import model.Conta;

public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
        System.out.println("SALDO ANTERIOR: "+c.getSaldo());
        c.atualiza(this.selic);
        System.out.println("SALDO FINAL: "+c.getSaldo());
        this.saldoTotal += c.getSaldo();
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }
}
