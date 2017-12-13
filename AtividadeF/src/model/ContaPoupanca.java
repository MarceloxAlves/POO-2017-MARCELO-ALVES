package model;

public class ContaPoupanca extends Conta {


    public ContaPoupanca(double saldo, int numero) {
        super(saldo, numero);
    }

    @Override
    public void atualiza(double taxa) {

    }

    /*@Override
    public void atualiza(double taxa) {
        super.atualiza(taxa*3);
    }*/
}
