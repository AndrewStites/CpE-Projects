public class TestScore{
private double score1;
private double score2;
private double score3;

public double getScore1(){
	return score1;
}

public double getScore2(){
	return score2;
}

public double getScore3(){
	return score3;
}

public void setScore1(double scoreGiven1){
	score1 = scoreGiven1;
}

public void setScore2(double scoreGiven2){
	score2 = scoreGiven2;
}

public void setScore3(double scoreGiven3){
	score3 = scoreGiven3;
}

public double calculateAverage(){
	return (score1 + score2 + score3) / 3;
}

public TestScore(){
	score1 = 0.0;
	score2 = 0.0;
	score3 = 0.0;
}
}