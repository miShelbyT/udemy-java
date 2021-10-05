package com.company;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2021";
        String doubleAsString = "2021.1551";

        int num = Integer.parseInt(numberAsString);
        System.out.println(num % 2000);

        // double is data type. Double refers to the Double class
        double dub = Double.parseDouble(doubleAsString);
        System.out.println(dub + 100);
    }
}
