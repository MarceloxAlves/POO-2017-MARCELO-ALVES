package model;

public abstract class Conta {
    private double saldo;
    private int numero;

    public Conta(double saldo, int numero) {
        this.saldo = saldo;
        this.numero = numero;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo()
    {
        this.atualiza(10);
        return this.saldo;
    }

    public abstract void atualiza(double taxa);
}
