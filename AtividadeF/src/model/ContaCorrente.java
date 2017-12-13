package model;

public class ContaCorrente extends Conta{


    public ContaCorrente(double saldo, int numero) {
        super(saldo, numero);
    }

    @Override
    public void atualiza(double taxa) {

    }

    @Override
    public void deposita(double valor) {
        super.deposita(valor - 0.10);
    }

}