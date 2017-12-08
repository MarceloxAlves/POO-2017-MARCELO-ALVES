package exercicio5.model;

public class Conta {
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

    public double getSaldo() {
        return this.saldo;
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }
}
