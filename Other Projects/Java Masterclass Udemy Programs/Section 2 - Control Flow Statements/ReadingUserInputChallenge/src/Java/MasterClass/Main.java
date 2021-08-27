package Java.MasterClass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int count = 0;
        int numEntered;
        int sum = 0;


        while (true)
        {
            int order = count + 1;
            System.out.println("Enter number " + order + ":");
            boolean numCheck = input.hasNextInt();
            if (numCheck)
            {
                numEntered = input.nextInt();
                count++;
                sum += numEntered;

                if (count == 10)
                {
                    break;
                }

            } else
            {
                System.out.println("Invalid Number");
            }

            //handle end of line (enter key)
            input.nextLine();
        }

        System.out.println("sum = " + sum);
        input.close();

    }
}
