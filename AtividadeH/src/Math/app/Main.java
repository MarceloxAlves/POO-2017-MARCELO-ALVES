package Math.app;

import Math.model.Quadrado;
import Math.model.Triangulo;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        System.out.println("Área do Quadrado: "+quadrado.getArea());
        Triangulo triangulo = new Triangulo(10,5);
        System.out.println("Área do triangulo: "+triangulo.getArea());

        switch (triangulo.comparar(quadrado)){
            case -1:
                System.out.println("Área Menor");
                break;
            case 0:
                System.out.println("Área Igual");
                break;
            case 1:
                System.out.println("Área Maior");
                break;

        }

    }
}
