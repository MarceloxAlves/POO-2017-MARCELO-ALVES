package Desafios;

import Utilities.Fibonacci;

public class Desafios4 {
    public Desafios4() {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 1; i <= 6; i++) {
            int resultado = fibonacci.calculaFibonacci(i);
            System.out.println(resultado);
        }
    }
}
