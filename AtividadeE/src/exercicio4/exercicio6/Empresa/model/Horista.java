package exercicio6.Empresa.model;
public class Horista extends Diarista {

    public Horista() {
        super();
    }

    @Override
    public double calcSalario() {
        return super.calcSalario()/24;
    }
}
