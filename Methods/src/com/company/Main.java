package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(false, 800, 5, 100);
        int otherHighScore = calculateScore(true, 10000, 8, 200);

        // here we are printing out the return value of the functions as called above
        System.out.println("Your final score was " + highScore);
        System.out.println("Your final score was " + otherHighScore);

        int highScorePosition = (calculateHighScorePosition(1500));
        displayHighScorePosition("Yaddy", highScorePosition);

        highScorePosition = (calculateHighScorePosition(900));
        displayHighScorePosition("Jim", highScorePosition);

        highScorePosition = (calculateHighScorePosition(400));
        displayHighScorePosition("Alex", highScorePosition);

        highScorePosition = (calculateHighScorePosition(50));
        displayHighScorePosition("John", highScorePosition);
    }
// void in the function means Java will know not to return anything
//    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("your final score was " + finalScore + "!!!");
//        }
//    }

    // in the method declaration we are now saying we should return an integer (int)
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        return playerScore > 1000 ? 1 : playerScore > 500 ? 2 : playerScore > 100 ? 3 : 4;
    }


}
