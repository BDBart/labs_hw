package h7.bank;

public class DuplicateAccountNumberException extends Exception {
    public DuplicateAccountNumberException(){
        super("Account number is already taken");
    }
}
