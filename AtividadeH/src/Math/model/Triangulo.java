package Math.model;

public class Triangulo implements FiguraGeometrica , Comparavel{
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

    @Override
    public int comparar(FiguraGeometrica figuraGeometrica) {
        return  this.getArea() < figuraGeometrica.getArea() ? -1 : this.getArea() == figuraGeometrica.getArea() ? 0 : 1;
    }
}
