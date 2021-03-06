package model;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
       return  base*altura/2;
    }

    @Override
    public double getPerimetro() {
        return base*3;
    }
}
