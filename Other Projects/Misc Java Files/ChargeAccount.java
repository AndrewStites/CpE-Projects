public class ChargeAccount{
	private int[] chargeAccountNumbers = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152, 4562555, 5552012, 5050552, 7815877, 1250155, 1005231, 6545231, 3852085, 7576651, 7881200, 4581002};

	public boolean checkNumberForPresence(int numberGiven){
		for(int index = 0; index < chargeAccountNumbers.length; index++) {
			if(numberGiven == chargeAccountNumbers[index]){
				return true;
			}
		}
		return false;
	}
	public ChargeAccount(){

	}
}