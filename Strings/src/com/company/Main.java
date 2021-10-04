package com.company;

public class Main {

    public static void main(String[] args) {
	    // primitive datatypes:byte, short, int, long, float, double, char, boolean
        // byte is half of short, short is half of int, int is half of long (in width / bits)
        // float is half of double (in width / bits)

        String myString = "Hey this is a cool string";
        String myNewString = myString + " I'm not even kidding," + " \u00A9 2021";
        System.out.println(myNewString);

        String numberString = "250.55";
        int newInt = 50;
        System.out.println(numberString + newInt); //coerces int into String type, and a new String has been created.
    }
}
