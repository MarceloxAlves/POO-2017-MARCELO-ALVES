package  exercicio6.Calculadora.app;
import exercicio6.Calculadora.model.CalculadoraCientifica;

public class Main {
    public static void main(String[] args) {
        CalculadoraCientifica calculadora = new CalculadoraCientifica(2, 3);
        System.out.println(calculadora.exponenciar(2,8));

    }
}
