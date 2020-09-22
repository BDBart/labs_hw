package h9.bank9;

import h7.bank.BalanceException;
import h7.bank.BankIsFullException;
import h7.bank.TransactionException;
import h7.bank.TransactionType;

import java.util.Arrays;

public class Bank {
    private BankAccount[] accounts = new BankAccount[10];

    //toegevoegde constructor met alle property values
    public Bank(BankAccount[] accounts){
        this.accounts = accounts;
    }

    public void addAccount(BankAccount bac) throws BankIsFullException {
        for (int i = 0; i < accounts.length; i++){
            if (accounts[i] == null) {
                accounts[i] = bac;
                System.out.println("Succesfully added account");
                break;
            } else if(i == accounts.length -1 && accounts[i] != null) {
                throw new BankIsFullException();
            }
        }

    }

    public void handleTransaction(BankAccount ba1, BankAccount ba2, double amount, TransactionType type) throws TransactionException {
        if (ba1 != ba2){
            switch (type){
                case ADD:
                    try{
                        ba2.substractFromBalance(amount);
                        ba1.addToBalance(amount);
                    } catch (BalanceException e) {
                        System.out.println(e.getMessage());
                    }
                break;
                case SUB:
                    try{
                        ba1.substractFromBalance(amount);
                        ba2.addToBalance(amount);
                    } catch (BalanceException e) {
                        System.out.println(e.getMessage());
                    }
            }
        } else throw new TransactionException();

    }

    public double getSumOfAllBankAccountBalances(){
        int sum = 0;
        for (int i = 0; i < accounts.length; i++){
            if (accounts[i] == null) break;
            sum += accounts[i].getBalance();
        }
        System.out.println("Sum of all the bankaccount balances is: " +  sum);
        return sum;
    }

    public void printAllNumbersAndInterests(){
        for(BankAccount bacc : accounts){
            if (bacc != null) System.out.println("BankAccoutNumber: " + bacc.getNumber() + ". Interest: " + bacc.getInterest());
            else break;
        }
    }

    //Overriding de toString methode
    @Override
    public String toString(){
        //super methode(origineel) is:
        //return getClass().getName() + "@" + Integer.toHexString(hashCode());
        return "Dit object heeft properties: " + Arrays.toString(accounts);
        //geeft alleen maar een array vol met null waardes
    }
}
