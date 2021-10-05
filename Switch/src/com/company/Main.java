package com.company;

public class Main {

    public static void main(String[] args) {
        int switchVal = 1;
        // switch statements can be used with byte, short, char and int

        switch (switchVal) {
            case 1: {
                System.out.println("value is 1");
                break;
                // could add multiple cases to one line. i.e., case 3:case 4:case 5:
            } case 5: {
                System.out.println("value is 5");
                break;
            } default:
                System.out.println("value is none of the above");
                break;
        }

        char charVar = 'G';
// cannot use double quotes here. We have to use single quotes
        switch(charVar) {
            case 'A': {
                System.out.println("Your variable is A");
                break;
            } case 'B': {
                System.out.println("Your variable is B");
                break;
            } case 'C': {
                System.out.println("Your variable is C");
                break;
            } case 'D': {
                System.out.println("Your variable is D");
                break;
            } case 'E': {
                System.out.println("Your variable is E");
                break;
            } default: {
                System.out.println("Char not found, pls try again");
                break;
            }
        }


    }
}
