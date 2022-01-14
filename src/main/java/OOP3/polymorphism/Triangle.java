package OOP3.polymorphism;

public class Triangle implements Figure {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void squareOfFigure() {
        double p = (a + b + c)*1.0/2;
        double s = Math.sqrt(p*(p - 1.0*a)*(p - 1.0*b)*(p -1.0*c));
        System.out.println("Площадь треугольника: " + s);
    }
}
