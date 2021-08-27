import javax.swing.JOptionPane;

public class Population{

	public static void main(String[]args){

		String userInput;
		int startingNumberOfOrganisms;
		double userPercentageIncrease;
		int numberOfDays;
		double dailyPopulation;
		double percentageIncrease;
		String output = " ";

		userInput = JOptionPane.showInputDialog("Please enter the starting number of organisms: ");
		startingNumberOfOrganisms = Integer.parseInt(userInput);

		while(startingNumberOfOrganisms < 2){
			userInput = JOptionPane.showInputDialog("Error: Please enter a number, 2 or above.\n\n" + "Please enter the starting number of organisms(2 and above):");

			startingNumberOfOrganisms = Integer.parseInt(userInput);
		}

		userInput = JOptionPane.showInputDialog("Please enter the average daily increase as a percentage: ");
		userPercentageIncrease = Double.parseDouble(userInput);

		userInput = JOptionPane.showInputDialog("Please enter the number of days they'll multiply: ");
		numberOfDays = Integer.parseInt(userInput);

		while(numberOfDays < 1){
			userInput = JOptionPane.showInputDialog("Error: Please enter a positive number\n\n" +
								"Please enter the average daily population" +
								" increase as a percentage(Positive numbers) ");
			numberOfDays = Integer.parseInt(userInput);

		}

		dailyPopulation = startingNumberOfOrganisms;
		percentageIncrease = userPercentageIncrease / 100;

		for (int day = 1; day <= numberOfDays; day++){
			output += String.format(day + "%.0f\n", dailyPopulation);
			dailyPopulation = dailyPopulation + (percentageIncrease * dailyPopulation);
		}
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	}

}