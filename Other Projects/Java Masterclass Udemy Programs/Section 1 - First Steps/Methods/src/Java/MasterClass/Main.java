package Java.MasterClass;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Fuckie", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Fuckie", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Fuckie", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Fuckie", highScorePosition);


    }

    public static void displayHighScorePosition(String name, int highScoreRank)
    {
        System.out.println(name + " managed to get into position " + highScoreRank + " on the High Score Table!");
    }

    public static int calculateHighScorePosition(int playerScore)
    {
//        if (playerScore >= 1000)
//        {
//            return 1;
//        }
//        else if (playerScore >= 500)
//        {
//            return 2;
//        }
//        else if (playerScore >= 100)
//        {
//            return 3;
//        }
//
//        return 4;

        int position = 4; // assuming position 4 will be returned

        if (playerScore >= 1000)
        {
            position = 1;
        }
        else if (playerScore >= 500)
        {
            position = 2;
        }
        else if (playerScore >= 100)
        {
            position = 3;
        }

        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {

        //same as gameOver == true
        if (gameOver)
        {
            //the code here is in its own scope and variables here cannot be accessed from elsewhere
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;

            //java only needs one return statement. so , if this is true then this one runs and not the one below
            return finalScore;
        }

        //negative one means error so it is used to declare that a logical error occurred
        return -1;


    }

}
