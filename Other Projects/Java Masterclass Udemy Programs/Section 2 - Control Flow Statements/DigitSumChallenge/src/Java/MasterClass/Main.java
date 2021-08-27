package Java.MasterClass;

public class Main {

    public static void main(String[] args) {

        System.out.println("The sum of the digits is " + sumDigits(125));

    }

//    public static int sumDigits(int number)
//    {
//        if (number >= 10)
//        {
//
//            while (number > 0) {
//
//                int sum = 0;
//                int operand = number % 10;
//                sum += operand;
//                number /= 10;
//
//                return sum;
//            }
//
//
//        }
//
//        return -1;
//
//    }

    public static int sumDigits(int number)
    {
        if (number <= 10)
        {
            return -1;
        }

        //put the variable that is going to be returned on the outside of loop/conditional statement
        int sum = 0;

        while(number > 0) {
            //Extraction
            int digit = number % 10;
            sum += digit;

            //Drop the last digit
            number /= 10;
        }

        //make sure to place this out of the loop so the loop can continue more than once
        return sum;

    }
}
