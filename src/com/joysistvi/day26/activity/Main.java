package com.joysistvi.day26.activity;

public class Main {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("1001", "Juan Dela Cruz", 5000);
        CheckingAccount checkingAccount = new CheckingAccount("2001", "Maria Santos", 1000);

        System.out.println("=== Savings Account ===");
        testAccount(savingsAccount);

        System.out.println("\n=== Checking  Account ===");
        testAccount(checkingAccount);

        System.out.println("\n=== Savings Transactions ===");
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(5800);
        savingsAccount.deposit(500, "Birthday gift");
        savingsAccount.withdraw(1500, "Rent");

        System.out.println("\n=== Checking Transactions ===");
        checkingAccount.withdraw(2500);
        checkingAccount.withdraw(1000);

        System.out.println("\n=== Transfer (Savings to Checking) ===");
        savingsAccount.transfer(checkingAccount, 1000);

        System.out.println("\n=== Interest ===");
        savingsAccount.addInterest();
    }

    public static void testAccount(Account account) {

        account.displayAccountInfo();
    }

}

/*
    OOP CONCEPTS:

    1. Encapsulation:
       Account - private data members, getters, setters,
       and protected setBalance().

    2. Inheritance:
       SavingsAccount extends Account.
       CheckingAccount extends Account.

    3. Polymorphism (Overriding):
       SavingsAccount and CheckingAccount:
       displayAccountInfo(), deposit(), withdraw(), and transfer().

    4. Polymorphism (Overloading):
       SavingsAccount and CheckingAccount:
       deposit(double amount) and deposit(double amount, String remarks).
       withdraw(double amount) and withdraw(double amount, String remarks).

    5. Abstraction (Abstract Class):
       Account - abstract class and displayAccountInfo().

    6. Abstraction (Interfaces):
       Transaction, Transferable, InterestBearing, and Overdraftable.

    7. Constants:
       SavingsAccount - MIN_BALANCE.
       InterestBearing - INTEREST_RATE.
       Overdraftable - OVERDRAFT_LIMIT.
*/
