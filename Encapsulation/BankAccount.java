package com.oop.encapsulation;

class BankAccount {
	
    private double balance; // Private variable - hidden

    // Public setter with validation
    public void setdeposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setdeposit(500.0);
        // System.out.println(account.balance); // Error: balance is private
         System.out.println("Balance: " + account.getBalance()); 
    }
}