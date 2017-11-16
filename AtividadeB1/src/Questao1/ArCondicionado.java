package Questao1;
public class ArCondicionado {
    private boolean ligado = false;
    private int temperatura = 15;
    private int velocidade = 1;
    private String[] modos  = {"Frio","Ventilador"};
    private int modo  = 1;
    private  int serie;


    public ArCondicionado(int serie) {
        this.serie = serie;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado() {
        this.ligado = isLigado()? false : true;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        if(this.modo != 0 && isLigado()){
            this.temperatura += temperatura;
            if (this.temperatura < 15){
                this.temperatura = 30;
            }else if(this.temperatura > 30){
                this.temperatura = 15;
            }
        }

    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        if(isLigado()){
            this.velocidade += velocidade;
            if (this.velocidade < 1){
                this.velocidade = 3;
            }else if(this.velocidade > 3){
                this.velocidade = 1;
            }
        }
    }

    public String getModo() {
        return this.modos[this.modo];
    }

    public void setModo() {
        if(isLigado()) {
            if (this.modo + 1 == this.modos.length) {
                this.modo = 0;
            } else {
                this.modo++;
            }
        }
    }

    public String getStatus(){
        return  this.isLigado() ? "Ligado" : "Desligado";
    }


    public String Display(){
        String display = "|--------------------------------------|\n" +
                "| Status: " + this.getStatus() +"\n"+
                "| Modo: "+ (isLigado() ? this.getModo() : "...")+ "\n"+
                "| Temperatura: "+(isLigado() ? this.getTemperatura() : "...") + "\n"+
                "| Velocidade: "+ (isLigado() ? this.getVelocidade() : "...") + "\n"+
                "|--------------------------------------|";
        return display;
    }
}
