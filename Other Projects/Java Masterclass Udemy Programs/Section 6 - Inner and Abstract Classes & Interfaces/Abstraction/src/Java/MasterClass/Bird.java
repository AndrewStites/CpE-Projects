package Java.MasterClass;

//This is an abstract class extending from an abstract class
public abstract class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating.");
    }

    @Override
    public void breathe() {
        System.out.println("MOAR AIR!!!");
    }

//    //defining methods but not implementing them here
//    public abstract void fly();


    @Override
    public void fly() {
        System.out.println(getName() + " is flapping");
    }
}
