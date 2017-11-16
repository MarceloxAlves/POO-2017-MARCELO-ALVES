package Questao2.Model;

public class Ponto {
    private float X,Y;

    public Ponto(float x, float y) {
        this.X = x;
        this.Y = y;
    }

    public float getX() {
        return X;
    }

    public void setX(float x) {
        X = x;
    }

    public float getY() {
        return Y;
    }

    public void setY(float y) {
        Y = y;
    }


    public double distancia(Ponto B){
       return Math.sqrt(Math.pow((B.getX() - this.getX()),2) + Math.pow((B.getY() - this.getY()),2));
    }
}
