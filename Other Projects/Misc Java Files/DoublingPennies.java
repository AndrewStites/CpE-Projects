import java.util.Scanner;

public class DoublingPennies{

	public static void main(String[]args){

	double penniesForDay;
	double penniesTotal = 0;
	int day = 0;

	while (day < 1){
		Scanner input = new Scanner(System.in);

		System.out.println("Please input a day: ");
			day = input.nextInt();

		}

	System.out.println("\nDay\tPennies Acquired\n---\t----------------");

	for (int i = 1; i <= day; i++){

			penniesForDay = (int)Math.pow( 2 , i - 1);
			System.out.println(i + "\t" + "$" + (double)penniesForDay / 100);
			penniesTotal = penniesTotal + penniesForDay;

		}


	System.out.println("------------------------");
	System.out.println("Total: " + "$" + (double)penniesTotal / 100);

	}

}