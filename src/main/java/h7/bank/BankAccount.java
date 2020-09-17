package h7.bank;

public class BankAccount {
    private int number;
    private double balance;
    private static final double interestRate = 1.024f;

    //constructor
    public BankAccount(int number, double startBalance){
        this.number = number;
        this.balance = startBalance;
    }

    public void addToBalance(double amount){
        balance += amount;
    }

    public void substractFromBalance(double amount) throws BalanceException{
        System.out.println(balance);
        System.out.println(amount);
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
}
