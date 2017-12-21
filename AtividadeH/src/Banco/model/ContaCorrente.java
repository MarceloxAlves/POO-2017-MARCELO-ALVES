package Banco.model;

public class ContaCorrente implements ContaTributavel{
    private double saldo;
    private String titular;
     public ContaCorrente(String titular) {
         this.saldo = 0;
         this.titular =  titular;
    }
     @Override
     public double getSaldo() {
         return this.saldo;
     }

     @Override
     public void deposita(double valor) {
        this.saldo += valor;
     }

     @Override
     public void saca(double valor) {
        this.saldo -= valor;
     }

     @Override
     public void atualiza(double taxaSelic) {
         //TODO
     }

     @Override
     public double getValorImposto() {
         return 42 + this.saldo;
     }

     @Override
     public String getTitular() {
         return this.titular;
     }

     @Override
     public String getTipo() {
         return null;
     }
 }
