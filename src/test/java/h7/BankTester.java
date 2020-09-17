package h7;

import h7.bank.BalanceException;
import h7.bank.Bank;
import h7.bank.BankAccount;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankTester {

    @Test
    public void testWithdrawal() throws BalanceException {
        //given
        Bank bank = new Bank();
        BankAccount bankAccount = new BankAccount(23432, 2000D);
        bank.addAccount(bankAccount);

        //when
        bankAccount.substractFromBalance(100D);
        double currentBalance = bankAccount.getBalance();

        //then
        assertEquals(100D, currentBalance, 1900D);
    }

    @Test
    public void testDeposit(){
        //given

        //when

        //then
    }

    @Test
    public void testTransactions(){
        //given

        //when

        //then
    }

    @Test
    public void testTotalAmountInBank(){
        //given

        //when

        //then
    }

    @Test
    public void testInterestCalculationOfBankAccount(){
        //given

        //when

        //then
    }

    @Test(expected = BalanceException.class)
    public void testForBalanceExceptionWhenBalanceTooLowWhenWithdrawing() throws BalanceException{
        //given

        //when

        //then
    }

    @Test
    public void testIterarionForAllBankAccountNumbersAndTheirInterest(){
        //given

        //when

        //then
    }
}
