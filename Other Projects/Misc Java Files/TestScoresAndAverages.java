import java.util.Scanner;

public class TestScoresAndAverages{

public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	int numberOfScores = 5;
	double userScore = 0;
	double score1 = 0;
	double score2 = 0;
	double score3 = 0;
	double score4 = 0;
	double score5 = 0;

	for ( int currentScore = 1; currentScore <= numberOfScores; currentScore++){
			System.out.println("Please enter a score " + currentScore + ":" );

			userScore = input.nextDouble();

			if (currentScore == 1){
				score1 = userScore;
			} else if (currentScore == 2){
				score2 = userScore;
			} else if (currentScore == 3){
				score3 = userScore;
			} else if (currentScore == 4){
				score4 = userScore;
			} else if (currentScore == 5){
				score5 = userScore;
			}

		}
		System.out.println("Average: " + calcAverage(score1, score2, score3, score4, score5) + "  Grade: " + determineGrade(calcAverage(score1, score2, score3, score4, score5)));
}

public static String determineGrade(double avg){
String Grade = "";
if (avg < 60){
Grade = "F";
}
else if (avg <= 69 && avg >= 60){
Grade = "D";
}
else if (avg <= 79 && avg >= 70){
Grade = "C";
}
else if (avg <= 89 && avg >= 80){
Grade = "B";
}
else if (avg <= 100 && avg >= 90){
Grade = "A";
}

return Grade;
}


public static double calcAverage(double score1, double score2, double score3, double score4, double score5){

double avg = (score1 + score2 + score3 + score4 + score5) / 5;

return avg;
}

}



