package Java.MasterClass;

public class Main {

    /*Abstract classes define methods, but do not provide implementation*/
    public static void main(String[] args) {
	    Dog dog = new Dog("Yorkie");
	    dog.breathe();
	    dog.eat();

	    Parrot parrot = new Parrot("Australian Ringneck");
	    parrot.breathe();
	    parrot.eat();
	    parrot.fly();

	    Penguin penguin = new Penguin("Emperor");
	    penguin.breathe();
	    penguin.fly();
	    penguin.eat();
    }
}
