package com.company;

public class Main {

    public static void main(String[] args) {
        char myChar = 'S'; //char is NOT a string! it is one character
        char myUnicode = '\u0470'; // unicode allows for over 65,000 char options
        boolean myTruthy = true;
        boolean myOtherBool = false;

        System.out.println(myChar);
        System.out.println(myUnicode);
        System.out.println(myOtherBool);
    }
}
