package OOP2.refactoring;

public abstract class Car {
    private Engine engine;
    private String color;
    private String name;

    public Car() {
    }

    protected void start() {
        System.out.println("Car starting");
    }//нигде не используется, можно стереть

    public abstract void open();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
