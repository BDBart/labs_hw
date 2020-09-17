package h7.bank;

public class BalanceException extends Exception {
    public BalanceException() {
        super("Balance is too low!");
    }
}
