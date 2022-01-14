package OOP3.polymorphism;

public class Circle implements Figure{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    @Override
    public void squareOfFigure() {
        System.out.println("Круг имеет площадь: " + radius*radius*Math.PI);
    }
}
