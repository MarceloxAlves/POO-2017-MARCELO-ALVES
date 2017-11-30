package Banco.model;

public class Conta {
    private double saldo;

    public Conta() {

    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }
}
