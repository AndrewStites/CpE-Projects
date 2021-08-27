package Java.MasterClass;

public class Main {

    public static void main(String[] args) {
        //Car is a new datatype created
        //Car class needs to be initialized in order to be used
        //porsche is the object being created using class Car
	    Car porsche = new Car();
	    Car holden = new Car();
	    //By creating a public method in class Car, access is granted here
        //We have successfully named the model of our object porsche
        //would print out null cause String is its own weird class
        //System.out.println("Model is " + porsche.getModel());
	    porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
