package Java.MasterClass;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;    //3 - 1
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; //2 + 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;    //20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    //the remainder of (4 % 3) = 1;
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result +2
        result += 2; //1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result = result + 10;
        result *= 10; // 3 * 10 = 30;
        System.out.println("3 * 10 = " + result);

        //result = result / 3;
        result /= 3; // 30 / 3 = 10;
        System.out.println("30 / 3 = " + result);

        //result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        //conditional operator
        boolean isAlien = false;
        if (isAlien == false)
        {
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of Aliens");
        }

        int topScore = 80;
        if (topScore != 100)
        {
            System.out.println("You got the high score!");
        }

        //logical and operator
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
        {
            System.out.println("Greater than second top score and less than 100");
        }

        //logical or operator
        if ((topScore > 90) || (secondTopScore <= 90))
        {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50)
        {
            System.out.println("This is true");
        }

        boolean isCar = false;
        //make sure to use an == when using a boolean
        //! makes isCar true
        if(isCar)
        {
            System.out.println("Leedle");
        }

        isCar = true;
        //ternary operator
        //first operand is the condition we are testing
        //the second operand is what to assign to wasCar if the first operand condition is true
        //the third operand is what to assign to wasCar if the first operand condition is false
        boolean wasCar = isCar ? true : false;

        if (wasCar)
        {
            System.out.println("wasCar is true");
        }

        double doubleVar = 20.00d;
        double doubleVar2 = 80.00d;

        double doubleSum = (doubleVar + doubleVar2) * 100.00d;
        System.out.println("doubleSum = " + doubleSum);
        double remainderOfSum = doubleSum % 40.00;
        System.out.println("remainderOfSum = " + remainderOfSum);



        boolean isRemainderSumZero = (remainderOfSum == 0) ? true : false;
        System.out.println(isRemainderSumZero);
        if (!isRemainderSumZero)
        {
            System.out.println("Got some remainder?");
        }

    }
}
