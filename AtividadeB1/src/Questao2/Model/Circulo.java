package Questao2.Model;

public class Circulo {
    private  double raio;
    private  double diametro;
    private  Ponto centro;

    public Circulo(Ponto centro) {
        this.centro = centro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public  double getCircunferencia(){
        return  2*3.14*this.raio;
    }

    public  double calcularArea(){
        return  3.14*this.raio*this.raio;
    }

    public  Ponto getCentro(){
        return  this.centro;
    }

    public  void  movimentar(Ponto ponto){
        this.centro = ponto;
    }


    public boolean isInSide(Ponto B){
        if(centro.distancia(B) < this.raio){
            return true;
        }
        return false;
    }

    public String relacaoCirculo(Circulo B){

        if (this.centro.distancia(B.getCentro()) == (this.raio+B.getRaio())){
            return "Tangente";
        }else  if (this.centro.distancia(B.getCentro()) < (this.raio+B.getRaio())){
            return "Secante";
        }else{
            return "Externos";
        }

    }





}
