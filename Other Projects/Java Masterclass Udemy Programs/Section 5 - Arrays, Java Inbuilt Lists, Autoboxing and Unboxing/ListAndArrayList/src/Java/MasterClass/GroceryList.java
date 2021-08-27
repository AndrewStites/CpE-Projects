package Java.MasterClass;

import java.util.ArrayList;

public class GroceryList {
    //ArrayLists hold objects
    //ArrayList is a class
    //The "<String>" tells Java the type of list
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item)
    {
        //automatically adds the item abstractly to the ArrayList
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList()
    {
        return groceryList;
    }

    public void printGroceryList()
    {
        System.out.println("You have " + groceryList.size() + " items in your groceryList");
        for (int i = 0; i < groceryList.size(); i++)
        {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem)
    {
        int position = findItem(currentItem);
        if (position >= 0)
        {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem( int position, String newItem)
    {
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(String item)
    {
        int position = findItem(item);
        if (position >= 0)
        {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position)
    {
        groceryList.remove(position);
        //Milk
        //Cheese
        //Bread

        //if we removed Cheese then Bread would move up
    }

    private int findItem(String searchItem) {
       return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem)
    {
        int position = findItem(searchItem);
        if (position >= 0)
        {
            return true;
        }

        return false;
    }

//    public String findItem(String searchItem) {
//        //This is part of the ArrayList functionality
//        //So it saves the developer from having to code a search for each item in the list
//        //This works by accessing the "groceryList" by ".contains" and returns a boolean depending on existence
//        //boolean exists = groceryList.contains(searchItem);
//
//        //The indexOf function
//        //searches for the item and returns the index position of the item
//        int position = groceryList.indexOf(searchItem);
//
//        //if the position index is greater than 0 then it will return the String attached to the int
//        if (position >= 0)
//        {
//            return  groceryList.get(position);
//        }
//
//        //if nothing is found, then this
//        //null works with String class
//        return null;
//    }
}
