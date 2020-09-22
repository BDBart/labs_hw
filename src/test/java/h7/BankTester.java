package h7;

import h7.bank.*;
import h7.person.Person;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankTester {

    @Test
    public void testWithdrawal() throws BalanceException {
        //given
        BankAccount bankAccount = new BankAccount(23432, 2000D);

        //when
        bankAccount.substractFromBalance(100D);
        double currentBalance = bankAccount.getBalance();

        //then
        assertEquals(100D, currentBalance, 1900D);
    }

    @Test(expected = BalanceException.class)
    public void testForBalanceException() throws BalanceException{
        BankAccount bankAccount = new BankAccount(23432, 2000D);
        bankAccount.substractFromBalance(2001D);
    }

    @Test
    public void testDeposit(){
        //given
        BankAccount bankAccount = new BankAccount(432, 2000D);

        //when
        bankAccount.addToBalance(100D);
        double currentBalance = bankAccount.getBalance();
        //then

        assertEquals(100D, currentBalance, 2100D);
    }

    @Test
    public void testAddAccountToBank() throws BankIsFullException {
        Bank bank = new Bank();
        BankAccount bankAccount = new BankAccount(1, 2000D);

        bank.addAccount(bankAccount);
    }

    @Test(expected = BankIsFullException.class)
    public void testBankIsFullException() throws BankIsFullException {
        Bank bank = new Bank();
        for (int i = 0; i < 10; i++){
            bank.addAccount(new BankAccount(i, 2000D));
        }
        BankAccount tooMuch = new BankAccount(123, 2039D);

        bank.addAccount(tooMuch);
    }

    @Test
    public void testTransactions() throws BankIsFullException, TransactionException {
        //given
        Bank bank = new Bank();
        BankAccount bankAccount1 = new BankAccount(554, 2000D);
        BankAccount bankAccount2 = new BankAccount(234, 2000D);
        bank.addAccount(bankAccount1);
        bank.addAccount(bankAccount2);

        //when1
        bank.handleTransaction(bankAccount1, bankAccount2, 20D, TransactionType.ADD);
        double currentBalance1 = bankAccount1.getBalance();
        double currentBalance2 = bankAccount2.getBalance();

        //then1
        assertEquals(20D, currentBalance1, 2020D);
        assertEquals(20D, currentBalance2, 1980D);


        //when2
        bank.handleTransaction(bankAccount1, bankAccount2, 30D, TransactionType.SUB);

        //then2
        assertEquals(30D, currentBalance1, 1990D);
        assertEquals(30D, currentBalance2, 2010D);
    }

    @Test(expected = TransactionException.class)
    public void testForTransactionException() throws TransactionException{
        Bank bank = new Bank();
        BankAccount bankAccount1 = new BankAccount(554, 2000D);

        bank.handleTransaction(bankAccount1, bankAccount1, 20D, TransactionType.ADD);
    }

    @Test
    public void testTotalAmountInBank() throws BankIsFullException {
        //given
        Bank bank = new Bank();
        BankAccount bankAccount1 = new BankAccount(1, 100D);
        BankAccount bankAccount2 = new BankAccount(2, 200D);
        BankAccount bankAccount3 = new BankAccount(3, 300D);
        bank.addAccount(bankAccount1);
        bank.addAccount(bankAccount2);
        bank.addAccount(bankAccount3);

        //when
        double sum = bank.getSumOfAllBankAccountBalances();

        //then
        assertEquals(600, sum, 0);
    }

    @Test
    public void testInterestCalculationOfBankAccount(){
        //given
        BankAccount bankAccount = new BankAccount(1, 200D);

        //when
        double interest = bankAccount.getInterest();

        //then
        assertEquals(204.8D, interest, 0.001);
    }

    @Test
    public void testForAllBankAccountNumbersAndTheirInterest() throws BankIsFullException {
        //given
        Bank bank = new Bank();
        for (int i = 0; i < 10; i++){
            bank.addAccount(new BankAccount(i, 36 * i));
        }

        //when
        bank.printAllNumbersAndInterests();
    }
}
