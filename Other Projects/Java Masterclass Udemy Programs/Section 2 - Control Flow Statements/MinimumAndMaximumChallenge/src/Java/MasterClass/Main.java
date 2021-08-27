package Java.MasterClass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;
        int numberEntered;

        while(true)
        {
            System.out.println("Enter number: ");
            boolean numCheck = input.hasNextInt();

            if (numCheck)
            {
                numberEntered = input.nextInt();

                if (first)
                {
                    first = false;
                    max = numberEntered;
                    min = numberEntered;
                }
                if(numberEntered > max)
                {
                    max = numberEntered;
                }

               if(numberEntered < min)
               {
                   min = numberEntered;
               }



            } else
            {
                break;
            }
            //handle input
            input.nextLine();
        }

        System.out.println("The minimum number is " + min + " and the maximum number is " + max);
        input.close();
    }
}
