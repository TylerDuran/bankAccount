import java.util.*;

public class BankAccount {

    // ----------- Attributes ----------------
    private double checkingBalance;
    private double savingsBalance;
    private static int numOfAccounts;
    private static double sumOfAccounts;



    // ----------- constructors ----------------
    public BankAccount() {
        numOfAccounts++;
    }

    // ----------- Getters----------------
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public static int getNumOfAccounts() {
        return numOfAccounts;
    }

    public static double getSumOfAccounts() {
        return sumOfAccounts;
    }


    // ----------- Other Methods ----------------
    // deposits 
    public void depositChecking(double depositChecking) {
        this.checkingBalance += depositChecking;
        sumOfAccounts += depositChecking;
    }

    public void depositSavings(double depositSavings) {
        this.savingsBalance += depositSavings;
        sumOfAccounts += depositSavings;
    }
    // withdraw 
    public void withdrawChecking(double withdrawChecking) {
        this.checkingBalance -= withdrawChecking;
        sumOfAccounts -= withdrawChecking;
    }

    public void withdrawSavings(double withdrawSavings) {
        this.savingsBalance -= withdrawSavings;
        sumOfAccounts -= withdrawSavings;
    }
}
// Create a method to see the total money from the checking and saving.