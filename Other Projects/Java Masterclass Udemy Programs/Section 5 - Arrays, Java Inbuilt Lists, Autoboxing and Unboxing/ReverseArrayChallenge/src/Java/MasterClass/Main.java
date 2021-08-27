package Java.MasterClass;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] myArray = {1,2,3,4,5};

        System.out.println("Array = " + Arrays.toString(myArray));

	    reverse(myArray);

        System.out.println("Reversed array = " + Arrays.toString(myArray));
    }

    private static void reverse(int[] array)
    {
      int maxIndex = array.length - 1;
      int halfLength = array.length / 2;
      for (int i = 0; i < halfLength; i++)
      {
          int temp = array[i];
          array[i] = array[maxIndex - i];
          array[maxIndex - i] = temp;
      }

    }

//    private static void reverse(int[] array)
//    {
//        int[] reversedArray = array;
//
//        for (int i = 0; i < array.length; i++)
//        {
//            System.out.println("Non-reversed: " + array[i]);
//        }
//
//        System.out.println("\r");
//
//        for (int i = 1; i <= reversedArray.length - 1; i++)
//        {
//            reversedArray[i - 1] = array[array.length - i];
//
//        }
//
//        for (int i = 0; i < reversedArray.length; i++)
//        {
//            System.out.println("Reversed: " + reversedArray[i]);
//        }
//    }
}
