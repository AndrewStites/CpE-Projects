package Java.MasterClass;

public class Main {

    public static void main(String[] args)
    {
     boolean gameOver = true;
     int score = 800;
     int levelCompleted = 5;
     int bonus = 100;

//     if (score < 5000 && score > 1000)
//     {
//         System.out.println("Your Score is 5000");
//     } else if (score < 1000)
//     {
//         System.out.println("Your Score is less than 5000");
//     } else
//     {
//         System.out.println("Got Here");
//     }

        //same as gameOver == true
        if (gameOver)
        {
            //the code here is in its own scope and variables here cannot be accessed from elsewhere
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;


        //same as gameOver == true
        if (gameOver)
        {
            //the code here is in its own scope and variables here cannot be accessed from elsewhere
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }




    }
}
