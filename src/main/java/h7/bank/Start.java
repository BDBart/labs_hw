package h7.bank;

public class Start {
    public static void main(String[] args) {
        Bank b = new Bank();
        BankAccount bankAccount = new BankAccount(1, 200D);
        BankAccount bankAccount1 = new BankAccount(2, 200D);

        try {
            b.addAccount(bankAccount);
            b.addAccount(bankAccount1);
        } catch (BankIsFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            b.handleTransaction(bankAccount, bankAccount1, 100D, TransactionType.SUB);
        } catch (TransactionException e) {
            e.printStackTrace();
        }

        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount1.getBalance());
    }
}
