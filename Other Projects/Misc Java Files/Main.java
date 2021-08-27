import java.util.Scanner;
import java.io.*;

public class Main{

	public static void main(String[]args) throws IOException{

		Scanner input = new Scanner(System.in);

	String userFileName;
	String userContents;
	String userContentsFromFile;
	char userCharacter;
	int characterCount = 0;
	String userInputString;

	System.out.println("Please enter the name of a file: ");
	userFileName = input.nextLine();

	PrintWriter userWriteFile = new PrintWriter(userFileName);
	System.out.println(userFileName + " has been created" );

	System.out.println( "Please enter what you want to write in " + userFileName);
	userContents = input.nextLine();

	System.out.println(userContents + " has been written to " + userFileName);

	userWriteFile.close();

	File userCreatedFile = new File(userFileName);

	System.out.println("Checking to make sure " + userFileName + " exists...");

	if (!userCreatedFile.exists()) {
	System.out.println("File does not exist" );
	}else{
		System.out.println("Success! File exists. Reading from " + userFileName + " ..." );
		Scanner userCreatedFileToScan = new Scanner(userCreatedFile);
		userContentsFromFile = userCreatedFileToScan.nextLine();

		System.out.println("Please enter a character to count: ");
		userCharacter = input.nextLine().charAt(0);

			for (int index = 0; index < userContentsFromFile.length(); index++){
			if (userContentsFromFile.charAt(index) == userCharacter){
				characterCount = characterCount + 1;
			}
			userCreatedFileToScan.close();
			System.out.println(userCharacter + " appears in " + userContentsFromFile + " " + characterCount + " times");
		}

}
}
}