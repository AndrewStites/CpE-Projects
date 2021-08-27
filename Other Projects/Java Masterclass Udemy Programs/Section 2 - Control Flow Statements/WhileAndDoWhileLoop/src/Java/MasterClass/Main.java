package Java.MasterClass;

public class Main {

    public static void main(String[] args) {
//	    int count = 0;
//	    while(count != 5)
//        {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//	    //the do while executes at least once
//	    do {
//            System.out.println("Count value is " + count);
//            count++;
//
//            if (count > 100)
//            {
//                break;
//            }
//        } while (count != 6);

	    int number = 4;
	    int finishNumber = 20;
	    int count = 0;


	    while (number <= finishNumber)
        {
            number++;
                if (!isEvenNumber(number)) {

                    continue;
                }
            System.out.println("Even Number " + number);

                count++;

            if (count > 4)
            {
                break;
            }
        }
    }

    public static boolean isEvenNumber (int number)
    {
        return (number % 2) == 0;
    }
}
