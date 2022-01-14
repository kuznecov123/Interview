package OOP3.polymorphism;

public class Square implements Figure{

    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public void squareOfFigure() {
        System.out.println("Квадрат имеет площадь: " + a*a);
    }
}
