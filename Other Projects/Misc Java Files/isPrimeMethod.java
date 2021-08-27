import java.util.Scanner;

public class isPrimeMethod{

	public static void main(String[]args){

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a integer: ");
			int userNumber = input.nextInt();

			if (isPrime(userNumber) == true){
				System.out.println("It is Prime!!!");
		   }else{
			    System.out.println("It is NOT Prime!!!");
		   }

}

public static boolean isPrime(int userNumber){
	boolean isPrimeCheck = true;

		for (int i = 2; i < userNumber; i++){
			if (userNumber % i == 0){
			isPrimeCheck = false;
		}
	}
	return isPrimeCheck;
}
}