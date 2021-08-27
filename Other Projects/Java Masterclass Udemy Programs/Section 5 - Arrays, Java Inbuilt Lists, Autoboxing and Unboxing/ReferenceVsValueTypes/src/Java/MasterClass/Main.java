package Java.MasterClass;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 10;
	    int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntValue = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntValue = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        //Reference types such as Arrays point to a point in memory and share that same point if equal to eachother like above
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        //This changes the array due to de-referencing from "myIntArray"
        anotherArray = new int[] {4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array)
    {
        array[0] = 2;
        //This points to a different array due to the "new int[]"
        array = new int[] {1,2,3,4,5};
    }
}
