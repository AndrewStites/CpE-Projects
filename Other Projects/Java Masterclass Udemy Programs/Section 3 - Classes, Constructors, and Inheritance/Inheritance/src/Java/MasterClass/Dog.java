package Java.MasterClass;

//"extends" allows us to use "inheritance" from the class "Animal"
public class Dog extends Animal {

    //Add some more fields that are pertinent to a "Dog"
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        //"super" is the keyword used to call the data from the higher ranked class i.e. "Animal"
        //This initializes the data of "Animal"
        //In this animal scenario, these variables are the base traits for animals
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew()
    {
        System.out.println("Dog.chew() called");
    }

    //literally overrides to add some functionality to "Dog" such as "chew()";
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        //This calls the method in this class
        chew();
        //This calls the method for the "super class" which is "Animal"
        super.eat();
    }

    public void walk()
    {
        System.out.println("Dog.walk() called");
        //This will call the "Animal" class' method for "move()"
        super.move(5);
    }

    public void run()
    {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed)
    {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
