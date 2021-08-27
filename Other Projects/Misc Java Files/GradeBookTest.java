import java.util.Scanner;

public class GradeBookTest{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		String studentName;
		double studentScore;
		double[][] studentTestScores;

		final int NUMBER_OF_STUDENTS = 5;
		final int NUMBER_OF_TESTSCORES_PER_STUDENT = 4;

		GradeBook classOf2018 = new GradeBook( NUMBER_OF_STUDENTS, NUMBER_OF_TESTSCORE_PER_STUDENT);
		studentTestScores = classOf2018.getStudentTestScoresArray();

		for (int currentStudnetIndex = 0; currentStudentIndex < NUMBER_OF_STUDENTS; currentStudentIndex++){
			System.out.println("Please enter the name of student " + (currentStudentIndex + 1));
			studentName = input.nextLine();
			classOf2018.setStudentScore(studentName);

			for (int currentStudentScoreIndex = 0; currentStudentScoreIndex < NUMBER_OF_TESTSCORES_PER_STUDENT; currentStudentScoreIndex++){
				System.out.println("Please enter score " + (currentStudentScoreIndex + 1) + " of " + studentName);
				studentScore = input.nextDouble();

				while(studentScore < 0 || studentScore > 100){
					System.out.println("please enter a valid score " + (currentStudentScoreIndex + 1) + " of " + studentName);
					studentScore = input.nextDouble();

				}

				input.nextLine();
				classOf2018.setStudentScore(currentStudentIndex, currentStudentScoreIndex, studentScore);

		}

		}

		for (int currentStudnetIndex = 0; currentStudentIndex < NUMBER_OF_STUDENTS; currentStudentIndex++){
					System.out.println(classOf2018.getStudentName(currentStudentIndex) + " has scores ");
					studentAverage = classOf2018.calculateAverageTestScore(studentTestScores[currentStudentIndex])
					studentLetterGrade = classOf2018.getStudentLetterGrade(studentAverage);

					for (int currentStudentScoreIndex = 0; currentStudentScoreIndex < NUMBER_OF_TESTSCORES_PER_STUDENT; currentStudentScoreIndex++){
						if(currentStudentScoreIndex != NUMBER_OF_TESTSCORES_PER_STUDENT - 1){
							System.out.println(studentTestScores[currentStudentIndex][currentStudentIndex] + ", ");
						} else {
							System.out.println(studentTestScores[currentStudentIndex][currentStudentIndex] + " ");
						}

					}
					System.out.println( "with average " + studentAverage + ", letter grade " + studentLetterGrade);
					System.out.println();
	}
}