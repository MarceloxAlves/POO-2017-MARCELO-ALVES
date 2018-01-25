package model;

public class ContaCorrente extends Conta{
    private double taxaSaque;
    public ContaCorrente(String titular) {
        super(titular);
        taxaSaque = 0.01;
    }

    @Override
    public void saca(double valor) {
        super.saca(valor + (valor*taxaSaque));
    }
}
