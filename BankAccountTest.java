import java.util.*;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount();
        BankAccount bank2 = new BankAccount();
        BankAccount bank3 = new BankAccount();
        BankAccount bank4 = new BankAccount();


    // deposits 
        bank1.depositChecking(100);
        bank1.depositChecking(355);
        bank1.depositSavings(350);
        System.out.println("Bank 1 Total Balance: " + bank1.getSumOfAccounts());

        bank2.depositChecking(300);
        bank2.depositSavings(550);
        System.out.println("Bank 2 Total Balance: " + bank2.getSumOfAccounts());

    // withdraw 
        bank1.withdrawChecking(11);
        bank1.withdrawChecking(12);
        bank1.withdrawSavings(35);
        System.out.println("Bank 1 Total Balance: " + bank1.getSumOfAccounts());

        bank2.withdrawChecking(15);
        bank2.withdrawSavings(55);
        System.out.println("Bank 2 Total Balance: " + bank2.getSumOfAccounts());
        System.out.println("Tatol Bank Accounts: " + BankAccount.getNumOfAccounts());

    }
}