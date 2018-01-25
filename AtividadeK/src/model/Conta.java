package model;

public  class Conta  implements Comparable<Conta> {

    private double saldo;
    private String titular;

    public Conta(String titular) {
        this.saldo = 0;
        this.titular =  titular;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void deposita(double valor) {
        if (valor < 0)
            throw new IllegalArgumentException("Você tentou depositar um valor negativo");
        this.saldo += valor;
    }

    public void saca(double valor) {
        if (valor < 0)
            throw new IllegalArgumentException("Você tentou sacar um valor negativo");
        if (this.saldo < valor)
            throw new IllegalArgumentException("O saldo é insuficiente: " + this.saldo);
        this.saldo -= valor;

    }

    public void atualiza(double taxaSelic) {
        //TODO
    }

    public int compareTo(Conta outraConta) {
        return this.titular.compareTo(outraConta.titular);
    }


}
