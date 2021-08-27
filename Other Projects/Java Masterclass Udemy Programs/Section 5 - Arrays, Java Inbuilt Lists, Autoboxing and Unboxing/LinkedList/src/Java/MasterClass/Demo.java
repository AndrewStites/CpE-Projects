package Java.MasterClass;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    //psvm
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Redding");
        addInOrder(placesToVisit, "Red Bluff");
        addInOrder(placesToVisit, "Chico");
        addInOrder(placesToVisit, "Anderson");
        addInOrder(placesToVisit, "Namek");
        addInOrder(placesToVisit, "Hoth");
        addInOrder(placesToVisit, "San Jose");
        addInOrder(placesToVisit, "Mortville");

       printList(placesToVisit);

       addInOrder(placesToVisit, "New Namek");
       addInOrder(placesToVisit, "Mortville");

       printList(placesToVisit);

       visit(placesToVisit);

//        //a feature of the LinkedList, akin to the ArrayList, is to add to a list seamlessly
//        //previously "Redding" was pointing to "Red Bluff"
//        //now "Redding" will point to "Texas"
//        placesToVisit.add(1, "Texas");
//        //this will print the updated list with "Texas" indexed at 1
//        printList(placesToVisit);
//
//        //removes the entry indexed at 4
//        placesToVisit.remove(4);
//        //prints the updated list
//        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList)
    {
        //using an iterator to go through the list
        //.iterator is a method for LinkedList<>
        Iterator<String> i = linkedList.iterator();

        //.hasNext() returns the next element in the iteration
        while (i.hasNext())
        {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("==========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity)
    {
        //gives more flexibility for inserting records
        //the code below ranks them alphabetical
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext())
        {
            //takes the index of the previous and compares it to the new index
            //it uses the difference between the two to assign to comparison
            int comparison = stringListIterator.next().compareTo(newCity);
            //checks to see if the city is already added
            if (comparison == 0)
            {
                //equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            }
            else if (comparison > 0)
            {
                //newCity should appear before this one
                //Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if (comparison < 0)
            {
                //move on to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities)
    {
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        //helps with the lists error of doubling cities
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty())
        {
            System.out.println("No cities in the it");
            return;
        }
        else
        {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit)
        {
            int action = input.nextInt();
            input.nextLine();

            switch(action)
            {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward)
                    {
                        if (listIterator.hasNext())
                        {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    }
                    else
                    {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward)
                    {
                        if(listIterator.hasPrevious())
                        {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious())
                    {
                        System.out.println("Now visiting " + listIterator.previous());
                    }
                    else
                    {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
                default:
                    System.out.println("Invalid Number");

            }
        }
    }

    private static void printMenu()
    {
        System.out.println("Available actions: \n Press");
        System.out.println("0 - to quit\n"
                + "1 - go to next city\n"
                + "2 - go to previous city\n"
                + "3 - print menu options");
    }

}
