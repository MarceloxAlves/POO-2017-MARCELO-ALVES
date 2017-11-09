package banco;

import main.Pessoa;

public class Conta {
    private double saldo;
    private Pessoa titular;
    private int numero;

    public Conta(Pessoa titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public  boolean sacar(double valor){
        if(this.saldo >= valor && valor > 0){
            this.saldo -=  valor;
            return  true;
        }
        return  false;
    }

    public  boolean depositar(double valor){
        if(valor > 0){
            this.saldo +=  valor;
            return  true;
        }
        return  false;
    }
}
