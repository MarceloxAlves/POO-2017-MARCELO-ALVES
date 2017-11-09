package montadora;

public class Veiculo {
    private double aceleracao;
    private int serie;
    private String modelo;
    private String placa;
    private boolean ligado = false;
    private Montadora montadora;

    public Veiculo(int serie, String modelo, Montadora montadora) {
        this.serie = serie;
        this.modelo = modelo;
        this.montadora = montadora;
    }

    public void acelerar(double aceleracao){
        this.aceleracao += aceleracao;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
