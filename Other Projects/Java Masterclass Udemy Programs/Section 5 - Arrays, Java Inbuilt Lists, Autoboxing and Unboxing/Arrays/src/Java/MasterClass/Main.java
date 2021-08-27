package Java.MasterClass;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        for(int i = 0; i < myIntegers.length; i++)
        {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

        System.out.println("The average is " + getAverage(myIntegers));

//        //Creates an array of 10 elements
//	    int[] myIntArray = new int[25]; //{1,2,3,4,5,6,7,8,9,10};
//	    //this would put 50 at element 6 of the array due to starting at 0
////	    myIntArray[5] = 50;
////	    myIntArray[6] = 5;
////	    myIntArray[7] = 8;
//
//        //Can use a for loop to initialize an array
//        //myIntArray.length is a field that gives us the amount of elements
//        for (int i = 0; i < myIntArray.length; i++)
//        {
//            myIntArray[i] = i * 10;
//        }
//
//        printArray(myIntArray);
//
//    }
//
//    public static void printArray(int[] array)
//    {
//        for (int i = 0; i < array.length; i++)
//        {
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }
   }

   //This method is returns an int array
   public static int[] getIntegers(int number)
   {
       //prints to the console asking the user for a "number" of elements
       System.out.println("Enter " + number + " integer values.\r");

       //an array is created with a number set for each elements
       int[] values = new int[number];

       //for loop takes in each answer and initializes the array
       for(int i = 0; i < values.length; i++)
       {
           values[i] = input.nextInt();
       }

       //returns the array
       return values;
   }

   //this method returns a double but the parameter is an array
   public static double getAverage(int[] array)
   {
       int sum = 0;
       for (int i = 0; i < array.length; i++)
       {
           sum += array[i];
       }

       return (double) sum / (double)array.length;
   }
}
