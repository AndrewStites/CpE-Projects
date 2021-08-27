package Java.MasterClass;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[]args)
    {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit)
        {
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice)
            {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
                default:
                    System.out.println("Null");
                    break;
            }
        }
    }

    public static void printInstructions()
    {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an ite4m in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem()
    {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(input.nextLine());
    }

    public static void modifyItem()
    {
        System.out.print("Current item name: ");
        String itemName = input.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = input.nextLine();
        groceryList.modifyGroceryItem(itemName, newItem);
    }

    public static void removeItem()
    {
        System.out.print("Enter the item name: ");
        String itemName = input.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void searchForItem()
    {
        System.out.print("Item to search for: ");
        String searchItem = input.nextLine();
        if (groceryList.onFile(searchItem))
        {
            System.out.println("Found " + searchItem);
        }
        else
        {
            System.out.println(searchItem + " is not on file");
        }
    }

    public static void processArrayList()
    {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

//    /*Allows the Array made to resized*/
//
//    private static Scanner input = new Scanner(System.in);
//    private static int[] baseData = new int[10];
//
//    public static void main(String[] args) {
//        System.out.println("Enter 10 Integers: ");
//        getInput();
//        printArray(baseData);
//        resizeArray();
////        System.out.println("Enter 12 Integers: ");
////        getInput();
//        baseData[10] = 67;
//        baseData[11] = 54;
//        printArray(baseData);
//    }
//
//    private static void getInput()
//    {
//        for(int i = 0; i < baseData.length; i++)
//        {
//            baseData[i] = input.nextInt();
//        }
//    }
//
//    private static void printArray(int[] arr)
//    {
//        for(int i = 0; i < arr.length; i++)
//        {
//            System.out.print(arr[i] + " ");
//            System.out.println();
//        }
//    }
//
//    private static void resizeArray()
//    {
//        int[] original = baseData;
//
//        baseData = new int[12];
//        for (int i = 0; i < original.length; i++)
//        {
//            baseData[i] = original[i];
//        }
//    }

}
