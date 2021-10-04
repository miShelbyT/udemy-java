package com.company;

public class Main {
    public static void main(String[] args) {
        int myVar = 50;
        myVar++;
        System.out.println(myVar);
        // this is a statement => int myVar = 50;
        // this is also a statement => myVar++; as is this => System.out.println(myVar);

        //we can auto format code using Code / Reformat Code or shortcut Alt/Cmd/L (start/alt/L on my logitech keyboard)

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore + "!!!");
        }
        int secondScore = 10000;
        levelCompleted = 8;
        bonus = 200;


        if (gameOver) {
            int finalScore = secondScore + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore + "!!!");
        }


    }
}
