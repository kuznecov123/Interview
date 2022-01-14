package OOP3.polymorphism;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Figure circle = new Circle(10);
        Figure square = new Square(15);
        Figure triangle = new Triangle(2, 4, 5);

        List<Figure> figures = Arrays.asList(circle, square, triangle);
        for (Figure s : figures) {
            s.squareOfFigure();
        }
    }
}
