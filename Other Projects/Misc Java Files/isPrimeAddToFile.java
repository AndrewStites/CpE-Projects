import java.util.Scanner;
import java.io.*;

public class isPrimeAddToFile{

	public static void main(String[]args) throws IOException{

		Scanner input = new Scanner(System.in);

			String userFileName;
			String userContents;

			System.out.println("Please enter the name of a file: ");
			userFileName = input.nextLine();

			PrintWriter userWriteFile = new PrintWriter(userFileName);
			System.out.println("\n" + userFileName + " has been created" );


		for (int i = 2; i <= 100; i++){
			if (isPrime(i) == true){

				int number = i;
				String numberAsString = String.valueOf(number);

				userContents = numberAsString;

				userWriteFile.println(userContents);
				System.out.println("\n" + userContents + " has been written to " + userFileName);
		   }

	   }
				userWriteFile.close();
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