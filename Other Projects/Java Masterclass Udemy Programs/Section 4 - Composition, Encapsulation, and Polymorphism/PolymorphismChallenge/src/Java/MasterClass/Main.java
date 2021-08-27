package Java.MasterClass;

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Engine has started";
    }

    public String accelerate() {
        return "Vehicle is accelerating";
    }

    public String brake()
    {
        return "Vehicle is stopping";
    }
}

class Toyota extends Car
{
    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        //First gets the class which is "Toyota", then copys the name
        return getClass().getSimpleName() + " Engine has started" ;
    }

    @Override
    public String accelerate() {
        return "Corolla is accelerating";
    }

    @Override
    public String brake() {
        return "Corolla is stopping";
    }
}

class Tesla extends Car
{
    public Tesla(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "TeslaP100's Engine has started" ;
    }

    @Override
    public String accelerate() {
        return "TeslaP100 is accelerating";
    }

    @Override
    public String brake() {
        return "TeslaP100 is stopping";
    }
}

class Batmobile extends Car
{
    public Batmobile(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Batmobile's Engine has started" ;
    }

    @Override
    public String accelerate() {
        return "Batmobile is accelerating";
    }

    @Override
    public String brake() {
        return "Batmobile is stopping";
    }
}

class MysteryMachine extends Car
{
    public MysteryMachine(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Batmobile's Engine has started" ;
    }

    @Override
    public String accelerate() {
        return "Batmobile is accelerating";
    }

    @Override
    public String brake() {
        return "Batmobile is stopping";
    }
}

class Ford extends Car
{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "TeslaP100's Engine has started" ;
    }

    @Override
    public String accelerate() {
        return "TeslaP100 is accelerating";
    }

    @Override
    public String brake() {
        return "TeslaP100 is stopping";
    }
}

public class Main {

    public static void main(String[] args) {
	    Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Toyota corolla = new Toyota(4, "Corolla");
        System.out.println(corolla.startEngine());
        System.out.println(corolla.accelerate());
        System.out.println(corolla.brake());

        Ford ford = new Ford(6, "Fusion");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

    }


}
