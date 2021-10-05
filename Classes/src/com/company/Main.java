package com.company;

//class
public class Main {

    //method
    public static void main(String[] args) {
        //we have to initialize new instance of Car class
        Car porsche = new Car();
        Car audi = new Car();
        //adding model and still abiding by private state variables as set in Car class
        //we can get before we set. This returns null by default.
        System.out.println(porsche.getModel());
        porsche.setModel("Carrera");
        audi.setModel("Q5");
        System.out.println(porsche.getModel());
        System.out.println(audi.getModel());
    }
}
