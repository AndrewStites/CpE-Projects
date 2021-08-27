package Java.MasterClass;

public class Main {

    public static void main(String[] args) {

        int counter = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(i + " fits the conditions");
                sum += i;
                counter++;
            }

            if (counter == 5)
            {
                System.out.println("The sum = " + sum);
                break;
            }
        }


    }
}
