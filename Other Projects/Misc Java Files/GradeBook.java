import java.util.ArrayListt;

public class GradeBook{
	private ArrayList <String> studentNames = new ArrayList <String> ();
	private char [] studentLetterGrades = {'A', 'C', 'B', 'D', 'F'};
	private double [][]studentTestScores;

	public String getStudentName(int studentIndex);
}

public double calculateAverageTestScore(double[]studentTestScores){
	double studentTestScoresTotal = 0;
	double studentTestScoresAverage;

	for (int currentStudentTestScore = 0; currentStudentTestScore < studentTestScore.length; currentStudentTestScore++){
		studentTestScoresTotal = studentTestScoresTotal + studentTestScores{currentStudentTestScore};
	}

	studentTestScoresAverage = studentTestScoresTotal / studentTestScores.length;
	return studentTestScoresAverage;
}

public char getStudentLetterGrade( double studentTestScoreAverage) {
	char studentLetterGrade = 'Z';

	if (studentTestScoreAverage < 60){
		studentLetterGrade = 'F';
	}else if(studentTestScoreAverage < 70){
		studentLetterGrade = 'D';
	}else if(studentTestScoreAverage < 80){
		studentLetterGrade = 'C';
	}else if(studentTestScoreAverage < 90){
		studentLetterGrade = 'B';
	}else if(studentTestScoreAverage <= 100){
		studentLetterGrade = 'A';
	}

	return studentLetterGrade;
}

public void setStudentName( String studentName){
		studentNames.add(studentNames)
	}

public void setStudentScore(int studentIndex, int scoreIndex, double studentScore){
		studentTestScores[studentIndex][scoreIndex] = studentScore;
	}

public double [][] getStudentTestScoresArray(){
		return studentTestScores;
	}

public GradeBook(int numberOfStudents, int numberOfTestScoresPerStudent){
	studentTestScores = new double[numberOfStudents][numberOfTestScoresPerStudent];
}
}