import java.util.Scanner;

public class ThreeIntegers {

	public static void main(String[]args) {

		Scanner input = new Scanner(System.in);

		//Prompt the user
		System.out.println("Please enter three integers: ");
		System.out.print("Integer 1: ");
			int num1 = input.nextInt();
		System.out.print("Integer 2: ");
			int num2 = input.nextInt();
		System.out.print("Integer 3: ");
			int num3 = input.nextInt();
			int temp = 0;
		//if statements for the biggest number inputted
		/*if num1 is bigger than num2 then num2 equates to the value of num1. Then, if num2 is greater than num3, num3 equates to the value of num2.
			finally, if num1 is greater than num2 now that num2 has taken num3's value, then num1's value is taken by temp and then given to num2 while
			num1 equates to num2*/
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
			}
		if (num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
			}
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
			}


		//Display
		System.out.println(num1 + " " + num2 + " " + num3);






	}





}