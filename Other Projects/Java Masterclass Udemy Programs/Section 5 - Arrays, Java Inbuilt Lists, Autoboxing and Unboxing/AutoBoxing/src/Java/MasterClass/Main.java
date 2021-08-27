package Java.MasterClass;

import java.lang.reflect.Array;
import java.util.ArrayList;

//This is actually a wrapper
class IntClass
{
    //This is a private variable
    private int myValue;

    //This is the only way to update it
    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    //This is the only way to get it
    //It has to be through the class
    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        //ArrayList cannot work with a primitive datatype
        //They need classes and that is why String works
        //ArrayList<int> intArrayList = new ArrayList<int>();

        //This uses the class/wrapper above to add values of int to a ArrayList
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        //The difference between an int and Integer is that Integer is a class
        //This is the old way of autoboxing
        Integer integer = new Integer(54);

        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++)
        {
            //This is the old way of autoboxing
            //autoboxing is taking a primitive type and using a wrapper on it
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i <= 10; i++)
        {
            //intArrayList.get(i).intValue() this is the old way of unboxing
            //unboxing converts it from being wrapped back to a primitive type
            System.out.println(i + " ---> " + intArrayList.get(i).intValue());
        }


        //This is the short way of using autoboxing and unboxing with an int
        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue; // myInt.intValue();

        //This is the short way of using autoboxing and unboxing with an double
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();

        for (double dbl = 0.0; dbl <= 10.0; dbl+= 0.5)
        {
            myDoubleValues.add(dbl);
        }

        for (int i = 0; i <= myDoubleValues.size(); i++)
        {
            double value = myDoubleValues.get(i);
            System.out.println(i + " ----> " + value);
        }
    }
}
