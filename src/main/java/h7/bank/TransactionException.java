package h7.bank;

public class TransactionException extends Exception {
    public TransactionException(){
        super("Transaction isn't possible on one account");
    }
}
