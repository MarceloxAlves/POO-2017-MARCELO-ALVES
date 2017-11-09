package apartamento;


import main.Pessoa;

public class Apartamento {
    private double area;
    private String localizacao;
    private int quantidadeQuarto;
    private int quantidadeBanheiro;
    private Pessoa proprietario;

    public Apartamento(Pessoa proprietario, String localizacao) {
        this.area = area;
        this.localizacao = localizacao;
        this.proprietario = proprietario;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getQuantidadeQuarto() {
        return quantidadeQuarto;
    }

    public void setQuantidadeQuarto(int quantidadeQuarto) {
        this.quantidadeQuarto = quantidadeQuarto;
    }

    public int getQuantidadeBanheiro() {
        return quantidadeBanheiro;
    }

    public void setQuantidadeBanheiro(int quantidadeBanheiro) {
        this.quantidadeBanheiro = quantidadeBanheiro;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }




    public void vender(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
}
