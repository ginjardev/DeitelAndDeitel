package chapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditLimitCalculatorTest {
    CreditLimitCalculator creditLimitCalculator;
    @BeforeEach
    void setUp() {
        creditLimitCalculator = new CreditLimitCalculator();
    }

    @Test
    void createCreditLimitCalculatorObject(){
        assertNotNull(creditLimitCalculator);
    }

    @Test
    void checkCustomerAccountNumber(){
        assertEquals(0, creditLimitCalculator.getAccountNumber());
    }

    @Test
    void checkCustomerAccountBalance(){
        creditLimitCalculator.customerStartBalance(500);
        assertEquals(500, creditLimitCalculator.getStartAccountBalance());
    }

    @Test
    void checkTotalItemsCharged(){
        creditLimitCalculator.totalItemsCharges(23);
        assertEquals(23, creditLimitCalculator.getTotalItemsCharged());
    }

    @Test
    void checkCustomerHasCredit(){
        creditLimitCalculator.customerCredit(47);
        assertEquals(47, creditLimitCalculator.getCustomerCredit());
    }

    @Test
    void checkCustomerCreditLimit(){
        creditLimitCalculator.setCustomerCreditLimit(235);
        assertEquals(235, creditLimitCalculator.getCustomerCreditLimit());
    }

    @Test
    void checkCustomerNewBalance(){
        creditLimitCalculator.customerStartBalance(500);
        creditLimitCalculator.totalItemsCharges(120);
        creditLimitCalculator.customerCredit(100);
        assertEquals(520, creditLimitCalculator.getNewBalance());
    }

    @Test
    void checkCustomerHasExceededCreditLimit(){
        creditLimitCalculator.customerStartBalance(300);
        creditLimitCalculator.totalItemsCharges(120);
        creditLimitCalculator.customerCredit(100);
        creditLimitCalculator.setCustomerCreditLimit(200);
        assertEquals("credit limit exceeded", creditLimitCalculator.creditLimitExceeded());
    }
}
