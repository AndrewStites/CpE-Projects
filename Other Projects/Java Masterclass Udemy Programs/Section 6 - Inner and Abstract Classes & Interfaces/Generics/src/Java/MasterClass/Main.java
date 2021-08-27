package Java.MasterClass;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //ArrayList is a Generic type
        //when we provide a type parameter to generic type, this is called a parameterized type
        //we are using this ArrayList as a raw type
	    //ArrayList items = new ArrayList();
        ArrayList<Integer> items = new ArrayList<>();
	    //utilizing autoboxing to add an integer to the ArrayList
        //converting the primitive type into an "Integer"
	    items.add(1);
	    items.add(2);
	    items.add(3);
	    items.add(4);
	    items.add(5);

	    printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n)
    {
        for (Object i : n)
        {
            //we have to cast i as an Integer
            System.out.println((Integer) i * 2);
        }
    }
}
