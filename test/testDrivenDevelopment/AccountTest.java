package testDrivenDevelopment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {
    Account userAccount = new Account();
    double userBalance = userAccount.balance = 0.00;
    int myPin = userAccount.pin = 1224;


    @Test
    @DisplayName("Deposit amount into user Account")
    void depositAmount(){
        userAccount.deposit(2000);
        assertEquals(2000, userAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit only positive amount in user Account")
    void depositPositiveAmount(){
        userAccount.deposit(-2000);
        assertEquals(0, userAccount.getBalance());
    }

    @Test
    @DisplayName("Check user Account Balance")
    void checkBalance(){
        userAccount.getBalance();
        assertEquals(userBalance, userAccount.getBalance());
    }

    @Test
    @DisplayName("User can withdraw from Account")
    void withdrawFromBalance(){
        userAccount.withdraw(1500, 1224);
        assertEquals( -1500, userAccount.getBalance() - 1500);
    }

    @Test
    @DisplayName("User must withdraw within balance")
    void withdrawWithinBalance() {
        userAccount.withdraw(1500, 1224);
        assertEquals(userBalance, userBalance);
    }

    @Test
    @DisplayName("User withdraws within balance with pin")
    void withdrawWithPin(){
        userAccount.withdraw(1500, 1224);
        assertEquals(userBalance, userAccount.getBalance());
    }


}
