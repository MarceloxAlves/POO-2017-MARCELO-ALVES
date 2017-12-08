package exercicio6.Calculadora.model;
public class CalculadoraCientifica extends Calculadora {

    public CalculadoraCientifica(double operando1, double operando2) {
        super(operando1, operando2);
    }


    public double exponenciar(double base, int expoente) {
        double resultado = base;
        for (int i = 1; i < expoente; i++) {
            resultado *= base;
        }

        return resultado;
    }

}
