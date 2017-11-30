package Calculadora.app;

import Calculadora.model.Calculadora;
import Calculadora.model.CalculadoraCientifica;

public class Main {
    public static void main(String[] args) {
        CalculadoraCientifica calculadora = new CalculadoraCientifica(2, 3);
        System.out.println(calculadora.exponenciar(2,8));

    }
}
