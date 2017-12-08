package exercicio6.Empresa.model;

public class Diarista extends Empregado{

    public Diarista() {
        super();
    }

    @Override
    public double calcSalario() {
        return super.calcSalario()/30;
    }
}
