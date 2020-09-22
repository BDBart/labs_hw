package h7.bank;

public class BankIsFullException extends Exception {
    public BankIsFullException(){
        super("No room for new accounts");
    }
}
