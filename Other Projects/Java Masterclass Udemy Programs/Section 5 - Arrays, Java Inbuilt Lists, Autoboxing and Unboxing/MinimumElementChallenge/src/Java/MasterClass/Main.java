package Java.MasterClass;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Please enter the count:");
        int userEnteredCount = input.nextInt();

        int[] userArray = readIntegers(userEnteredCount);
        int[] minValue = findMin(userArray);

        printArray(minValue);
    }

    private static int[] readIntegers (int count)
    {
        //prints to the console asking the user for a "number" of elements
        System.out.println("Enter " + count + " integer values.\r");

        //an array is created with a number set for each element
        int[] values = new int[count];

        //for loop takes in each answer and initializes the array
        for(int i = 0; i < values.length; i++)
        {
            values[i] = input.nextInt();
        }

        //returns the array
        return values;
    }

    private static void printArray(int[] array)
    {
            System.out.println("Minimum Element value is " + array[array.length - 1]);
    }

    private static int[] findMin(int[] array)
    {
        //This is the code above but just streamlined
        int[] findMinArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while (flag)
        {
            flag = false;
            for (int i = 0; i < findMinArray.length - 1; i++)
            {
                if (findMinArray[i] < findMinArray[i + 1])
                {
                    temp = findMinArray[i];
                    findMinArray[i] = findMinArray[i + 1];
                    findMinArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return findMinArray;
    }
}


