package com.learning;

public class BankAccount {
    static String bankName = "ABC Bank";  // static variable (common to all accounts)
    
    String accountHolder;   // non-static variable
    double balance;         // non-static variable

    // Constructor
    public BankAccount(String name, double initialBalance) {
        accountHolder = name;
        balance = initialBalance;
    }

    // Non-static method to display account info
    public void showAccountDetails() {
        System.out.println("Bank: " + bankName);      // accessing static variable
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    // Static method to show bank name
    public static void showBankName() {
        System.out.println("Welcome to " + bankName);
        // System.out.println(accountHolder);  Not allowed — non-static cannot be accessed here
    }

    public static void main(String[] args) {
        // Calling static method directly using class name
        BankAccount.showBankName();

        // Creating objects (accounts)
        BankAccount acc1 = new BankAccount("Ramu", 5000.0);
        BankAccount acc2 = new BankAccount("Ravi", 10000.0);

        // Accessing non-static method using objects
        acc1.showAccountDetails();
        acc2.showAccountDetails();
    }
}
