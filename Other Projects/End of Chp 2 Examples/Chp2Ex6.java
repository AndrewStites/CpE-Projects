import java.util.Scanner;

public class Chp2Ex6 {

	public static void main (String[]args) {

	//Create a Scanner
	Scanner input = new Scanner(System.in);

	System.out.print("Please input an integer between 0 and 1000: ");

	int mainNumb = input.nextInt();

	//Calculations
	/*I had a lot of trouble finding the right algorithm to put this in motion. Planning/Software Design is crucial to working out bugs in your head and on paper before
	diving into the code. So, time to explain what below is all about in the best way possible: First, the task at hand was to take an integer inputed by the user and add all
	the indvidual integers. Second, well, me doing it. I had to first get a variable to be the main number inputed (labeled "mainNumb" up top). Then, use that number and disect it.
	The book I am using (Intro to Java Programming) gave me a hint regarding the use of the % operator with 10 to extract each digit indivually. However, that worked well for the ones' section.
	The book gave me another hint entailing the use of the / operator with 10 to drop the number down placeholder (for instance, 932 -> 93). Using the int datatype aided in not having any (for this situation)
	pesky floating numbers. I utilized those wonderful tips and contructed the pattern you see below. Starting with using mainNumb with the % to give me an indivdual number from the original. It takes
	numbers from right to left. So, if we are using the number "932" as mainNumb, it would go like so:

	numb1 would equal 2

	newMainNumb would equal 93

	numb2 would equal 3

	newMainNumb would equal 9

	numb3 would equal 9

	newMainNumb would equal 0

	numb4 would 0*/

	int numb1 = mainNumb % 10;

	int newMainNumb = mainNumb / 10;

	int numb2 = newMainNumb % 10;

	 newMainNumb = newMainNumb / 10;

	int numb3 = newMainNumb % 10;

	 newMainNumb = newMainNumb / 10;

	int numb4 = newMainNumb % 10;

	int total = numb1 + numb2 + numb3 + numb4;

	//Display
	System.out.println("the sum is " + total);


	}

}