package OOP2.refactoring;

public class LightWeightCar  extends Car implements Moveable{

    @Override
    public void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

}
