public class CoinFlip {

	public static void main(String[]args) {
	
	
	//Generate the number
	double number = Math.random();
	
	//Confine tails and head
	if (number <= 1 && number >= 0.5)
		System.out.println("Tails");
	else
		System.out.println("Heads");
		
	
	
	
	}



}