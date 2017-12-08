package exercicio5.model;

public class Calculadora {
    private  double operando1;
    private  double operando2;

    public Calculadora(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public double somar(){
        return  this.operando1 + this.operando2;
    }

    public double subtrair(){
        return  this.operando1 - this.operando2;
    }


    public double multiplicar(){
        return  this.operando1 * this.operando2;
    }

    public double dividir(){
        return  this.operando1 / this.operando2;
    }





}
