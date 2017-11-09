public class Circulo {
    private  double raio;
    private  double diametro;

    public  double calcularCircunferencia(){
        return  2*3.14*this.raio;
    }

    public  double calcularArea(){
        return  3.14*this.raio*this.raio;
    }
}
