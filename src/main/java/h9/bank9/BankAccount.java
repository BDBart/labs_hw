package h9.bank9;

import h7.bank.BalanceException;
import h9.person9.Person;

public class BankAccount {
    private int number;
    private double balance;
    private Person accountHolder;
    private static final double interestRate = 1.024f;

    //constructor chaining--------------
    public BankAccount(int number) {
        this(number, 200D);
    }

    public BankAccount(int number, double balance) {
        this(number, balance, new Person("van der Geest"));
    }

    public BankAccount(int number, double balance, Person accountHolder) {
        this.number = number;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }
    //-----------------------------------

    public void addToBalance(double amount) {
        balance += amount;
    }

    public void substractFromBalance(double amount) throws BalanceException {
        if (balance > amount) balance -= amount;
        else throw new BalanceException();
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public double getInterest() {
        return balance * interestRate;
    }

    public Person getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Person person) {
        accountHolder = person;
    }

    //customized toString methode--------------------
    @Override
    public String toString() {
        return "Number: " + number
                + ". Balance: " + balance
                + ". AccountHolder: " + accountHolder.getLastName()
                + ". Age: " + accountHolder.getAge()
                + ". Gender: " + accountHolder.getGender();
    }
    //-----------------------------------------------
}