package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount newCustomer = new BankAccount("10", 0.00, "Shelby Talbert", "mi.shelbyrose@gmail", "123-456-789");
//        newCustomer.setCustomerName("Shelby Talbert");
        System.out.println("Welcome to Chase, your account name is " + newCustomer.getCustomerName() + " and your account number is " + newCustomer.getAcctNumber());

//        newCustomer.setCustomerPhone("123-456-789");
        System.out.println("The phone number listed on your account is " + newCustomer.getCustomerPhone());

//        newCustomer.setCustomerEmail("mi.shelbyrose@gmail");
        System.out.println("The email listed on your account is " + newCustomer.getCustomerEmail());

        System.out.println("your beginning balance is " + newCustomer.getAcctBalance());
        newCustomer.deposit(100000);
        System.out.println(newCustomer.getAcctBalance());

        newCustomer.withdraw(2000);
        newCustomer.withdraw(10000);
        newCustomer.withdraw(200000);
        newCustomer.withdraw(88000);

//        newCustomer.setAcctNumber("10");
        BankAccount ChrisCustomer = new BankAccount("123", "Christopher", "nyctalbert@gmail", "123-456-789");
        System.out.println(ChrisCustomer.getAcctBalance());

        VIPCustomer verySpecialCustomer = new VIPCustomer();
        System.out.println(verySpecialCustomer.getName());

        VIPCustomer veryFamousCustomer = new VIPCustomer("Fancy Pants", 10000000, "doesntuseemail.com");
        System.out.println(veryFamousCustomer.getName());
        System.out.println(veryFamousCustomer.getEmailAddress());
        System.out.println(veryFamousCustomer.getCreditLimit());


    }


}
