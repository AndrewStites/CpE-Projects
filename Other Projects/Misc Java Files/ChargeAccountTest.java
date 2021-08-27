import javax.swing.JOptionPane;

public class ChargeAccountTest{
	public static void main(String[]args){
		ChargeAccount numberSet = new ChargeAccount();
		String userInputString;
		int userNumber;

		userInputString = JOptionPane.showInputDialog("Please enter a number");
		userNumber = Integer.parseInt(userInputString);

		if(numberSet.checkNumberForPresence(userNumber)){
			JOptionPane.showMessageDialog(null, "The number " + userNumber + " is a valid account number");
		}else{
			JOptionPane.showMessageDialog(null, "The number " + userNumber + " is NOT a valid account number");
		}
	System.exit(0);
	}
}