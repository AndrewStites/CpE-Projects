package Java.MasterClass;

public class Main {

    public static void main(String[] args) {
        //System.out.println(calculateInterest(10000.0, 2.0));
        //Init
        //Termination
        //Increment
//        for(int i = 0; i < 5; i++)
//        {
//            System.out.println("Loop " + i + " hello");
//        }

        for (int i = 2; i <= 8; i++)
        {
            //String.format("%.2f, double) makes the double print with two zeros after the floating point
            //System.out.println(String.format("%.2f", calculateInterest(10000.0, i)));
        }

        for (int i = 8; i >= 2; i--)
        {
            //System.out.println(String.format("%.2f", calculateInterest(10000.0, i)));
        }
        int counter = 0;

        for (int i = 23; i <= 47; i++)
        {
            if (isPrime(i))
            {
                counter++;
                System.out.println(i + " is a prime number");
            }

            if (counter == 3)
            {
                System.out.println("Exiting Loop");
                break;
            }

        }

    }

    public static boolean isPrime(int n)
    {
        if (n == 1)
        {
            return false;
        }

        //n/2 -> Math.sqrt
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount * (interestRate / 100));
    }
}
