package Java.MasterClass;

import java.util.Scanner;

public class Main {

    //Types of nested classes

    //Static nested classes--used to associate a class with its outer class; identical to a top layer class. It can't access the non static methods or members of outer class without a instance of that class.
    //Non-static nested class--an inner class
    //Local class--an inner class defined inside of a scope block; usually a method
    //Anonymous class--a nested class without a class name

    private static Scanner input = new Scanner(System.in);
    private static Button buttonPrint = new Button("print");

    public static void main(String[] args) {
//        //local class
//       class ClickListener implements  Button.OnClickListener
//       {
//           public ClickListener()
//           {
//               System.out.println("I've been attacked");
//           }
//
//           @Override
//           public void onClick(String title) {
//               System.out.println(title + " was clicked");
//           }
//       }
//
//        buttonPrint.setOnClickListener(new ClickListener());

        //Anonymous class
        //IntelliJ will implement an anonymous class for you if your interface is setup
        buttonPrint.setOnClickListener((new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }));
       listen();




//	    GearBox mcLaren = new GearBox(6);
//
//	    mcLaren.operateClutch(true);
//	    mcLaren.changeGear(1);
//	    mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));

	    //this accesses the innerclass that is in GearBox
        //the syntax is weird for inner classes
//	    GearBox.Gear first = mcLaren.new Gear(1, 12.3);
//	    //GearBox.Gear second = new GearBox.Gear();
//	    //GearBox.Gear third = new mcLaren.Gear(3,)
//        System.out.println(first.driveSpeed(1000));

    }

    private static void listen()
    {
        boolean quit = false;
        while (!quit)
        {
            int choice = input.nextInt();
            input.nextLine();
            switch (choice)
            {
                case 0:
                    quit = true;
                    break;
                case 1:
                    buttonPrint.onClick();
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
