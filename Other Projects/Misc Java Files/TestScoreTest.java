import java.util.Scanner;

public class TestScoresTest{
	public static void main(String[]args){

	TestScore student = new TestScore();

	Scanner input = new Scanner(System.in);

	System.out.print("Please enter the 1st score: ");
		double userScore1 = input.nextDouble();

	System.out.print("Please enter the 2nd score: ");
		double userScore2 = input.nextDouble();

	System.out.print("Please enter the 3rd score: ");
		double userScore3 = input.nextDouble();

	student.setScore1(userScore1);
	student.setScore2(userScore2);
	student.setScore3(userScore3);
	System.out.printf("The average of %.2f, %.2f and %.2f is %.2f", student.getScore1(), student.getScore2(), student.getScore3(), student.calculateAverage());

	}

}