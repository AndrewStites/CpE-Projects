import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[]args) {
	
	//Create a Scanner
	Scanner input = new Scanner(System.in);
	
	//Prompt the user
	System.out.print("Please enter a year: ");
		int year = input.nextInt();
		
	//Determine the correct Zodiac
	switch (year % 12) {
		case 0: System.out.println("monkey"); break;
		case 1: System.out.println("rooster"); break;
		case 2: System.out.println("dog"); break;
		case 3: System.out.println("pig"); break;
		case 4: System.out.println("rat"); break;
		case 5: System.out.println("ox"); break;
		case 6: System.out.println("tigger"); break;
		case 7: System.out.println("rabbit"); break;
		case 8: System.out.println("dragon"); break;
		case 9: System.out.println("snake"); break;
		case 10: System.out.println("horse"); break;
		case 11: System.out.println("sheep"); break;
		
		}
	
	
	}



}