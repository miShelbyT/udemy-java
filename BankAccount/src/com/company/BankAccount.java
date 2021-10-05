package com.company;

public class BankAccount {
    private String acctNumber;
    private double acctBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
// **** the first constructor actually calls on the second constructor ***
    //gives default values if none are passed - note this()etc etc must be the first line in the "this/default" constructor
//   public BankAccount() {
//       this("123", 0.00, "Default Name", "Default Email", "Default Phone");
//   }

    // we don't have to pass defaults for every argument.
    public BankAccount(String acctNumber, String customerName, String customerEmail, String customerPhone) {
        this(acctNumber, 0.00, customerName, customerEmail, customerPhone);
    }


// constructor:
    public BankAccount(String acctNumber, double acctBalance, String customerName, String customerEmail, String customerPhone) {
        this.acctNumber = acctNumber;
        this.acctBalance = acctBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }


    // Cmd J or Code Generate for Getter and Setter auto create!
    public void setAcctNumber(String acctNumber){
        this.acctNumber = acctNumber;
    }

    public String getAcctNumber(){
        return this.acctNumber;
    }

    public void setAcctBalance(double acctBalance){
        this.acctBalance = acctBalance;
    }

    public double getAcctBalance(){
        return this.acctBalance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail(){
        return this.customerEmail;
    }

    public void setCustomerPhone(String customerPhone){
        this.customerPhone = customerPhone;
    }

    public String getCustomerPhone(){
        return this.customerPhone;
    }

    public void deposit(double depositAmount) {
        this.acctBalance += depositAmount;
        if(this.acctBalance >= 0.00)
            System.out.println("Your current balance is " + this.acctBalance);
    }

    public void withdraw(double withdrawalAmount) {
        if(this.acctBalance - withdrawalAmount >= 0) {
            this.acctBalance -= withdrawalAmount;
            System.out.println(this.customerName + ", your transaction has been processed and your current balance is " + this.acctBalance);
        } else System.out.println("Sorry you do not have enough funds for this transaction.");
    }


}
