package com.maven.bank;

import com.maven.bank.bvnService.BankService;
import com.maven.bank.dataStore.AccountType;
import com.maven.bank.dataStore.CustomerRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class AccountTest {
    Customer john;
    Account johnAccount;
    @BeforeEach
    void setUp(){
       john = new Customer();
       johnAccount = new Account();
    }

    @Test
    void openAccount(){
        john.setBvn(BankService.generateBVN());
        john.setEmail("johndoe@gmail.com");
        john.setFirstName("John");
        john.setSurname("Doe");
        john.setPhone("0803507234");
        johnAccount.setAccountNumber(BankService.generateAccountNumber());
        johnAccount.setTypeOfAccount(AccountType.SAVINGS);
        //johnAccount.setBalance(new BigDecimal(5000));
        johnAccount.setAccountPin("1000");
        john.getAccounts().add(johnAccount);
        assertTrue(CustomerRepo.getCustomers().isEmpty());
    }
}
