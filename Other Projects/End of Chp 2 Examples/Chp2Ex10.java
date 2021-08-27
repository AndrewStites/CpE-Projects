import java.util.Scanner;

public class Chp2Ex10 {
	public static void main(String[]args) {
	
	//Create a Scanner
	Scanner input = new Scanner(System.in);
	
	//Prompt user to input the neccessary items
	System.out.print("Enter the amount of water in kilograms: ");
	
	double waterAmount = input.nextDouble();
	
	System.out.print("Enter the intial temperature: ");
	
	double intTemp = input.nextDouble();
	
	System.out.print("Enter the final temperature: ");
	
	double finTemp = input.nextDouble();
	
	//Calculaitons
	
	double joules = (waterAmount * (finTemp - intTemp) * 4184);
	
	//Display
	
	System.out.println("The amount of energy needed in joules is " + joules);
	
	
	
	}



}