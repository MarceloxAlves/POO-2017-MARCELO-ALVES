package Banco.model;

public class ContaPoupanca implements Conta {
    private double saldo;

    public ContaPoupanca() {
        this.saldo = 0;
    }

    public  void render(){
        // TODO
    }

    @Override
    public double getSaldo() {
        return 0;
    }

    @Override
    public void deposita(double valor) {
        //TODO
    }

    @Override
    public void saca(double valor) {

    }

    @Override
    public void atualiza(double taxaSelic) {
        //TODO
    }
}
