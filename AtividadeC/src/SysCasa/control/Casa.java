package SysCasa.control;

public class Casa {
    private String cor;
    private Porta portas[];
    int pos;

    public Casa(String cor, int totalDePortas) {
        pinta(cor);
        this.portas = new Porta[totalDePortas];
        this.pos = 0;
    }

    void pinta(String s){
        this.cor =  s;
    }

    public void adiciona(Porta p){
        if (!this.cheio())
            this.portas[pos++] = p;

    }

    int getPortasEstaoAbertas(){
        int cont = 0;
        for (int i = 0; i < this.totalDePortas() ; i++) {
            if(this.portas[i].isAberta())
                cont++;
        }
        return cont;
    }

    int totalDePortas(){
        return this.pos;
    }

    public  boolean cheio(){
        return  this.pos == this.portas.length;
    }

    @Override
    public String toString() {
        String texto = "#CASA#\n" +
                "Cor: " + this.cor + "\n" +
                "Total de Portas: " + this.totalDePortas() + "\n" +
                "Portas Abertas: " + this.getPortasEstaoAbertas();
        return texto;
    }
}
