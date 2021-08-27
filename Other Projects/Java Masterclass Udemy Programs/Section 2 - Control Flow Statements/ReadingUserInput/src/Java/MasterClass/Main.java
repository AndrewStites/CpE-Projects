package Java.MasterClass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        //hasNextInt() checks for a number
        boolean hasNextInt = input.hasNextInt();

        if (hasNextInt)
        {
            int yearOfBirth = input.nextInt();
            input.nextLine(); //handle next line character (enter key)

            System.out.println("Enter your name: " );
            String name = input.nextLine();
            int age = 2020 - yearOfBirth;

            if (age >= 0 && age <= 100)
            {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            }else
            {
                System.out.println("Invalid Year Of Birth");
            }
        } else
        {
            System.out.println("Unable to parse year of birth.");
        }
        input.close();
    }
}
