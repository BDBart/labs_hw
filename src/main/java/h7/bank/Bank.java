package h7.bank;

public class Bank {
    private BankAccount[] accounts = new BankAccount[10];
    private static final int startingAmount = 100;

    public void addAccount(BankAccount bac){
        for (int i = 0; i < accounts.length; i++){
            if (accounts[i] != null) continue;
            accounts[i] = bac;
        }
    }

    public void handleTransaction(int bc1, int bc2, int amount, TransactionType type){
        switch (type){
            case ADD:
                try {
                    accounts[bc2].substractFromBalance(amount);
                    System.out.println("Subtracted " + amount + " from bankaccountnumber: " + accounts[bc2]);
                    accounts[bc1].addToBalance(amount);
                    System.out.println("Added " + amount + " to bankaccountnumber: " + accounts[bc1]);
                } catch (BalanceException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case SUB:
                try {
                    accounts[bc1].substractFromBalance(amount);
                    System.out.println("Subtracted " + amount + " from bankaccountnumber: " + accounts[bc1]);
                    accounts[bc2].addToBalance(amount);
                    System.out.println("Added " + amount + " to bankaccountnumber: " + accounts[bc2]);
                } catch (BalanceException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default: break;
        }
    }

    public int getSumOfAllBankAccountBalances(){
        int sum = 0;
        for (int i = 0; i < accounts.length; i++){
            sum += accounts[i].getBalance();
            System.out.println("Sum of all the bankaccount balances is: " +  sum);
        }
        return sum;
    }

    public void printAllNumbersAndInterests(){
        for(BankAccount bacc : accounts){
            System.out.println("BankAccoutNumber: " + bacc.getNumber() + ". Interest: " + bacc.getInterest());
        }
    }
}
