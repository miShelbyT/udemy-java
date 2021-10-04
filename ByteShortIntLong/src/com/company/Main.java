package com.company;

public class Main {

    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE; // Integer is a wrapper class
        int myMaxIntValue = Integer.MAX_VALUE;
//
//        System.out.println("Integer Min Value = " + myMinIntValue); // -2147483648
//        System.out.println("Integer Max Value = " + myMaxIntValue);// 2147483647
//
//        System.out.println("busted max val = " + (myMaxIntValue + 1)); //leads to overflow
//        System.out.println("busted min val = " + (myMinIntValue - 1)); //leads to underflow

//        int myWrongInt = 2147483648; // too big to be an int datatype

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

//        System.out.println(myMinByteValue); // -128
//        System.out.println(myMaxByteValue); // 127

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

//        System.out.println(myMinShortValue); // -32768
//        System.out.println(myMaxShortValue); // 32767

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

//        System.out.println(myMinLongValue); // -9223372036854775808
//        System.out.println(myMaxLongValue); // 9223372036854775807

        long bigLongLiteralVal = 2147483650000L; // need to add L after val declaration
//        System.out.println(bigLongLiteralVal);

        int myTotal = (myMaxIntValue / 2);
//        System.out.println(myTotal);

//        byte myNewNewestByteVal = (myMinByteValue / 2);
//        causes a datatype error bc default datatype by Java is an int. int take up much more space than byte or short
        byte myNewestByteVal = (byte)(myMinByteValue / 2); // example of casting to resolve above error

//        short myNewShortVal = myMinShortValue / 2;  ditto same error as above. need to cast
        short myNewNewShortVal = (short)(myMinShortValue / 2);
//        System.out.println(myNewNewShortVal);

        byte byteChallenge = 10;
        short shortChallenge = 20;
        int intChallenge = 50;

        long longChallengeTotal = 50000 + 10 * (byteChallenge + shortChallenge + intChallenge);
        System.out.println(longChallengeTotal);
        // longs work well with ints and this is why we don't have to cast, above
        //bytes and shorts have much smaller width (memory space) than int. and long is wider than all of the rest


    }
}
