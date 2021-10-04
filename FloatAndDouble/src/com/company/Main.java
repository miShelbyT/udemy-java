package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min:" + myMinFloatValue);
        System.out.println("Float max:" + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min:" + myMinDoubleValue);
        System.out.println("Double max:" + myMaxDoubleValue);

        int myIntValue = 5 / 2; // this truncates number to 2 (from 2.5)
        float myFloatVal = 5f / 3f; //  if using decimals you must use f for float (bc double is Java's default)
//        float myFloatVal = (float) 5.25;  or you can cast, although this isn't commonly used
        double myDoubleVal = 5d / 3d;
        System.out.println(myDoubleVal);
        // IF we are using whole numbers, it is good practice to declare f or d after float or double but not required

        System.out.println("doing some maths " + myIntValue);
        System.out.println("doing some maths " + myFloatVal);
        System.out.println("doing some maths " + myDoubleVal);

        // challenge. create var with appropriate type to store lbs
        double pounds = 200d;
        double conversionRate = 0.45359237;
        //write conversion math to covert to kgs, store the result in appropriate datatype
        double convertedKgFromPounds = pounds * conversionRate;
        // print out the result
        System.out.println(convertedKgFromPounds);
    }
}
