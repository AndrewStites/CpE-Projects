package Java.MasterClass;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    /*shows off the difference between comparable and comparator*/

    public static void main(String[] args) {
	    Theater theater = new Theater("Olympian", 8, 12);
	    //This was older code used
//	    List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
//	    printList(seatCopy);

	    //This is a different reference to the same object as the code above
//	    seatCopy.get(1).reserve();
        //This was older code used


	    if (theater.reserveSeat("D12"))
        {
            System.out.println("Please pay for D12");
        }
        else
        {
            System.out.println("Seat already reserved");
        }

        if (theater.reserveSeat("B13"))
        {
            System.out.println("Please pay for B13");
        }
        else
        {
            System.out.println("Seat already reserved");
        }

        List<Theater.Seat> reverseSeats = new ArrayList<>(theater.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        //This utilizes the comparator
        List<Theater.Seat> priceSeats = new ArrayList<>(theater.getSeats());
        priceSeats.add(theater.new Seat("B00", 13.00));
        priceSeats.add(theater.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theater.PRICE_ORDER);
        printList(priceSeats);

        //This was older code used
//        //This shows off the methods that are in the Collections class
//        Collections.shuffle(seatCopy);
//        System.out.println("Printing seatCopy");
//        printList(seatCopy);
//        System.out.println("Printing theater.seat");
//        printList(theater.seats);
//
//       Theater.Seat minSeat = Collections.min(seatCopy);
//       Theater.Seat maxSeat = Collections.max(seatCopy);
//       System.out.println("Min seat number is " + minSeat.getSeatNumber());
//       System.out.println("Max seat number is " + maxSeat.getSeatNumber());
//
//       sortList(seatCopy);
//       System.out.println("Printing sorted seatCopy");
//       printList(seatCopy);

//       //This sets the capacity of the necessary amount of elements but actually contains none
//        //This will incur a runtime error
//       List<Theater.Seat> newList = new ArrayList<>(theater.seats.size());
//       Collections.copy(newList, theater.seats);
        //This was older code used

    }

    //The parameter in the diamond brackets are accessing the inner class of Seat in Theater
    public static void printList(List<Theater.Seat> list)
    {
        for (Theater.Seat seat : list)
        {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("=====================================================================================================");
    }

    //This was older code used
    //This is a versus of the bubble sort
    //This takes less memory than a merge sort, but is considerably slower
//    public static void sortList(List<? extends Theater.Seat> list)
//    {
//        for (int i = 0; i < list.size() - 1; i++)
//        {
//            for (int j = i + 1; j < list.size(); j++)
//            {
//                if (list.get(i).compareTo(list.get(j)) > 0)
//                {
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
    //This was older code used
}


