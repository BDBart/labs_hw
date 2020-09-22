package h7.bank;

import h7.person.Person;

public class BankAccount {
    private int number;
    private double balance;
    private Person accountHolder;
    private static final double interestRate = 1.024f;

    //constructor
    public BankAccount(int number, double startBalance){
        this.number = number;
        this.balance = startBalance;
    }

    public BankAccount(int number, double startBalance, Person accountHolder){
        this.number = number;
        this.balance = startBalance;
        this.accountHolder = accountHolder;
    }

    public void addToBalance(double amount){
        balance += amount;
    }

    public void substractFromBalance(double amount) throws BalanceException{
        if (balance > amount) balance -= amount;
        else throw new BalanceException();
    }

    public double getBalance(){
        return balance;
    }

    public int getNumber(){
        return number;
    }

    public double getInterest(){
        return balance * interestRate;
    }

    public Person getAccountHolder(){
        return accountHolder;
    }

    public void setAccountHolder(Person person) { accountHolder = person; }
}
