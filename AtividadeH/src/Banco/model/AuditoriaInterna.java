package Banco.model;


public class AuditoriaInterna {

    private Tributavel[] tributavels;
    int ponteiro;

    public AuditoriaInterna(int tamanho) {
        this.tributavels = new Tributavel[tamanho];
        ponteiro = 0;
    }

    public void adicionar(Tributavel tributavel){
        this.tributavels[this.ponteiro++] = tributavel;
    }

    public double calcularTributos(){
        double soma = 0;
        for (int i = 0; i < this.ponteiro ; i++) {
            soma += this.tributavels[i].getValorImposto();
        }

        return soma;
    }


}
