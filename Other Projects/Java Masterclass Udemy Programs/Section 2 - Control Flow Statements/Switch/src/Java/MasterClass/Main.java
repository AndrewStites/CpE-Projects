package Java.MasterClass;

public class Main {

    public static void main(String[] args) {
	    int value = 3;
	    if (value == 1)
        {
            System.out.println("Value was 1");
        }
	    else if (value == 2)
        {
            System.out.println("Value was 2");
        }
	    else
        {
            System.out.println("Value was not 1 or 2");
        }

	    int switchValue = 3;

	    switch (switchValue)
        {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, 4, or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;

        }

        char switchChar = 'E';

	    switch (switchChar)
        {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(switchChar + " is the letter");
                break;
            default:
                System.out.println("Letter Invalid");
                break;
        }

        String month = "January";
	    switch(month.toLowerCase())
        {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
