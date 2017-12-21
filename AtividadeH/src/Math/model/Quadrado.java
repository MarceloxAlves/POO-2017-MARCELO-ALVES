package Math.model;

public class Quadrado implements FiguraGeometrica, Comparavel {
    private  double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return this.lado * this.lado;
    }

    @Override
    public double getPerimetro() {
        return this.lado * 4;
    }

    @Override
    public int comparar(FiguraGeometrica figuraGeometrica) {
        return  this.getArea() < figuraGeometrica.getArea() ? -1 : this.getArea() == figuraGeometrica.getArea() ? 0 : 1;
    }
}
