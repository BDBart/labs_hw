package h9.bank9;

public class Start {
    public static void main(String[] args) {
        Bank b = new Bank(new BankAccount[10]);
        BankAccount bacc = new BankAccount(1);

        System.out.println("Bank toString geeft: " + b.toString());
        System.out.println("BankAccount toString geeft: " + bacc.toString());

    }
}
