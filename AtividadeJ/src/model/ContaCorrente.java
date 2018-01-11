package model;

import exceptions.ContaException;

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
         if (valor < 0)
             throw new ContaException("Você tentou depositar um valor negativo");
         this.saldo += valor;
     }

     @Override
     public void saca(double valor) {
         if (valor < 0)
             throw new ContaException("Você tentou sacar um valor negativo");
         if (this.saldo < valor)
             throw new ContaException(this.saldo);
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
