package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        // the = operator assigns the value, the + operator adds the operands to the right and left
        int prevResult = result;
        System.out.println(prevResult + prevResult);

        result /= result;

        System.out.println(result);

        boolean isAlien = false;
        if(isAlien == false) { // false == false evaluates to true (not truthy but true)
            System.out.println("It is not an alien!");
            System.out.println("whew.....");
        }// if we were to put a semi-colon after if statement,
            // Java would think the following statement has nothing to do with conditional
        else
            System.out.println("Yup, alien.");

        int topScore = 90;
        if(topScore >= 100) {
            System.out.println("woohoo!!!!");
        } else System.out.println("better luck next time");

        if(topScore == 90 || topScore == 100) {
            System.out.println("good job you got an A!");
        }

        boolean isCar = false;
        if(isCar) {
            System.out.println("this is a car");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar) System.out.println("this is a vehicle");

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient >= 18) ? true : false; // can use extra parens to add clarity
        if(isEighteenOrOver) {
            System.out.println("go get a beer!");
        }

        double firstAnswer = 20.00;
        System.out.println(firstAnswer);
        double secondAnswer = 80.00;
        double thirdAnswer = (firstAnswer + secondAnswer) * 100.00;
        double fourthAnswer = thirdAnswer % 40.00;
        boolean fifthAnswer = (fourthAnswer == 0) ? true : false;
        System.out.println(fifthAnswer);
        if(!fifthAnswer){
            System.out.println("got some remainder");
        }


    }
}
