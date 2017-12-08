package exercicio5.model;

public class ContaImposto {
    private double saldo;
    private int numero;

    public ContaImposto(double saldo, int numero) {
        this.saldo = saldo;
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void credito(){

    }

    public void debito(){
        retemImposto(0.038);
    }

    private  void retemImposto(double valoDebito){
        //implementações
    }
}
