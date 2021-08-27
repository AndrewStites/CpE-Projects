import javax.swing.JOptionPane;

public class RainfallTest{
	public static void fillArrayWithUserDetails(double[]arrayGiven){
		String userInputString;
		double userMonthlyRainfallFigure;
		
		for (int index = 0; index < arrayGiven.length; index++){
			userInputString = JOptionPane.showInputDialog("Please enter rainfall figures for month " + (index + 1));
			userMonthlyRainfallFigure = Double.parseDouble(userInputString);
			arrayGiven[index] = userMonthlyRainfallFigure;
		}
	
	}
	
	public static void main(String[]args){
		
		final int MONTHS_IN_A_YEAR = 12;
		double [] rainfallStats = new double [MONTHS_IN_A_YEAR];
		
		fillArrayWithUserDetails(rainfallStats);
		
		Rainfall rainfallData = new Rainfall(rainfallStats);
		
	userOutputString = String.format("Total rainfall: %f\nAverage monthly rainfall" + ": %f\nMonth with most rain: %d\nMonth with least rain: %d",
		rainfallData.getTotalRainfall(),
		rainfallData.getAverageRainfall(),
		rainfallData.getMostRainMonth(),
		rainfallData.getLeastRainMonth());
	
	JOptionPane.showMessageDialog(null, userOutputString );
	
	System.exit(0);
	}
}