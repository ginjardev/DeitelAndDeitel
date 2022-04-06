package com.maven.bank.bvnService;

import com.maven.bank.Account;
import com.maven.bank.Customer;
import com.maven.bank.dataStore.AccountType;
import com.maven.bank.dataStore.CustomerRepo;
import exceptions.MavenBankTransactionException;
import exceptions.MavensBankException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountServiceImplTest {
    private AccountService accountService;
    Customer abu;
    Customer bessie;
    Account abuAccount;
    Account bessieAccount;

    @BeforeEach
    void setUp(){
        accountService = new AccountServiceImpl();
        abu = new Customer();
        abu.setBvn(BankService.generateBVN());
        abu.setEmail("johndoe@gmail.com");
        abu.setFirstName("Abu");
        abu.setSurname("Doe");
        abu.setPhone("0803507234");

        accountService = new AccountServiceImpl();
        bessie = new Customer();
        bessie.setBvn(BankService.generateBVN());
        bessie.setEmail("bessiedoe@gmail.com");
        bessie.setFirstName("bessie");
        bessie.setSurname("Doe");
        bessie.setPhone("0803507254");
    }
    @AfterEach
    void tearDown(){
        accountService = new AccountServiceImpl();
        abu = new Customer();
        abu.setBvn(BankService.generateBVN());
        abu.setEmail("johndoe@gmail.com");
        abu.setFirstName("Abu");
        abu.setSurname("Doe");
        abu.setPhone("0803507234");

        accountService = new AccountServiceImpl();
        bessie = new Customer();
        bessie.setBvn(BankService.generateBVN());
        bessie.setEmail("bessiedoe@gmail.com");
        bessie.setFirstName("bessie");
        bessie.setSurname("Doe");
        bessie.setPhone("0803507254");
    }
    @Test
    void openAccountForSavingsAccount(){
        assertTrue(abu.getAccounts().isEmpty());
        assertTrue(CustomerRepo.getCustomers().isEmpty());
        assertEquals(3, BankService.getCurrentAccountNumber());
        assertFalse(CustomerRepo.getCustomers().containsKey(abu.getBvn()));

        try{
            long newAccountNumber = accountService.openAccount(abu, AccountType.SAVINGS);

            assertFalse(CustomerRepo.getCustomers().isEmpty());
            assertEquals(4, BankService.getCurrentAccountNumber());
            assertTrue(CustomerRepo.getCustomers().containsKey(abu.getBvn()));
            assertFalse(abu.getAccounts().isEmpty());
            assertEquals(newAccountNumber, abu.getAccounts().get(0).getAccountNumber());
        }catch (MavensBankException ex){
            ex.printStackTrace();
        }


    }

    @Test
    void openAccountWithNoCustomer(){
        assertThrows(MavensBankException.class,
                ()-> accountService.openAccount(null, AccountType.SAVINGS));
    }

    @Test
    void openAccountWithNoAccountType(){
        assertThrows(MavensBankException.class,
                ()-> accountService.openAccount(abu, null));
    }



    @Test
    void openTheSameTypeOfAccountForTheSameCustomer(){ //
        try{
            long newAccountNumber = accountService.openAccount(abu, AccountType.SAVINGS);
            assertFalse(CustomerRepo.getCustomers().isEmpty());
            assertEquals(4, BankService.getCurrentAccountNumber());
            assertTrue(CustomerRepo.getCustomers().containsKey(abu.getBvn()));
            assertEquals(1, abu.getAccounts().size());
            assertFalse(abu.getAccounts().isEmpty());
            assertEquals(newAccountNumber, abu.getAccounts().get(0).getAccountNumber());

            newAccountNumber = accountService.openAccount(abu,AccountType.SAVINGS);
            assertEquals(4,BankService.getCurrentAccountNumber());
            assertEquals(1, abu.getAccounts().size());
            assertEquals(newAccountNumber, abu.getAccounts().get(0).getAccountNumber());

        }catch (MavensBankException exception){
            exception.printStackTrace();
        }
        assertThrows(MavensBankException.class, ()-> accountService.openAccount(abu,AccountType.SAVINGS));
    }

    @Test
    void openDifferentTypesOfAccountForDifferentCustomer(){
        try{
            long newAccountNumber = accountService.openAccount(abu, AccountType.SAVINGS);
            assertFalse(CustomerRepo.getCustomers().isEmpty());
            assertEquals(4,BankService.getCurrentAccountNumber());
            assertTrue(CustomerRepo.getCustomers().containsKey(abu.getBvn()));
            assertEquals(1, abu.getAccounts().size());
            assertFalse(abu.getAccounts().isEmpty());
            assertEquals(newAccountNumber, abu.getAccounts().get(0).getAccountNumber());

            newAccountNumber = accountService.openAccount(bessie, AccountType.CURRENT);
            assertEquals(5, BankService.getCurrentAccountNumber());
            assertEquals(1, bessie.getAccounts().size());
            assertEquals(newAccountNumber, bessie.getAccounts().get(0).getAccountNumber());
        }catch (MavensBankException ex){
            ex.printStackTrace();
        }
    }

    @Test
    void openAccountForCurrentAccount(){
        assertTrue(abu.getAccounts().isEmpty());
        assertTrue(CustomerRepo.getCustomers().isEmpty());
        assertEquals(0, BankService.getCurrentAccountNumber());
        assertFalse(CustomerRepo.getCustomers().containsKey(abu.getBvn()));

        try{
            long newAccountNumber = accountService.openAccount(abu, AccountType.CURRENT);

            assertFalse(CustomerRepo.getCustomers().isEmpty());
            assertEquals(1, BankService.getCurrentAccountNumber());
            assertTrue(CustomerRepo.getCustomers().containsKey(abu.getBvn()));
            assertFalse(abu.getAccounts().isEmpty());
            assertEquals(newAccountNumber, abu.getAccounts().get(0).getAccountNumber());
        }catch (MavensBankException ex){
            ex.printStackTrace();
        }
    }

    @Test
    void openDifferentTypeOfAccountForSameCustomer(){
        try{
            long newAccountNumber = accountService.openAccount(abu, AccountType.CURRENT);

            assertFalse(CustomerRepo.getCustomers().isEmpty());
            assertEquals(1, BankService.getCurrentAccountNumber());
            assertTrue(CustomerRepo.getCustomers().containsKey(abu.getBvn()));
            assertEquals(1, abu.getAccounts().size());
            assertFalse(abu.getAccounts().isEmpty());
            assertEquals(newAccountNumber, abu.getAccounts().get(0).getAccountNumber());

            newAccountNumber = accountService.openAccount(abu, AccountType.SAVINGS);
            assertEquals(2, BankService.getCurrentAccountNumber());
            assertEquals(2, abu.getAccounts().size());
            assertEquals(newAccountNumber, abu.getAccounts().get(1).getAccountNumber());
        }catch (MavensBankException ex){
            ex.printStackTrace();
        }
    }

    @Test
    void openAccountForSavingsAccountForNewCustomer(){
        assertTrue(abu.getAccounts().isEmpty());
        assertTrue(CustomerRepo.getCustomers().isEmpty());
        assertEquals(3, BankService.getCurrentAccountNumber());
        assertFalse(CustomerRepo.getCustomers().containsKey(abu.getBvn()));

        try{
            long newAccountNumber = accountService.openAccount(abu, AccountType.SAVINGS);

            assertFalse(CustomerRepo.getCustomers().isEmpty());
            assertEquals(4, BankService.getCurrentAccountNumber());
            assertTrue(CustomerRepo.getCustomers().containsKey(abu.getBvn()));
            assertFalse(abu.getAccounts().isEmpty());
            assertEquals(newAccountNumber, abu.getAccounts().get(0).getAccountNumber());

            newAccountNumber = accountService.openAccount(bessie, AccountType.SAVINGS);
            assertEquals(5, BankService.getCurrentAccountNumber());
            assertEquals(2, CustomerRepo.getCustomers().size());
            assertTrue(CustomerRepo.getCustomers().containsKey(bessie.getBvn()));
            assertFalse(bessie.getAccounts().isEmpty());
            assertEquals(newAccountNumber, bessie.getAccounts().get(0).getAccountNumber());
        }catch (MavensBankException ex){
            ex.printStackTrace();
        }


    }

    @Test
    void deposit() throws MavensBankException {
        try{
            long newAccountNumber = accountService.openAccount(abu, AccountType.SAVINGS);
            assertFalse(CustomerRepo.getCustomers().isEmpty());
            assertNull(abu.getAccounts().get(0).getBalance());

            long accountNumber = abu.getAccounts().get(0).getAccountNumber();
            BigDecimal accountBalance = accountService.deposit(new BigDecimal(5000), accountNumber);
            assertNotNull(abu.getAccounts().get(0).getBalance());
        }catch(MavenBankTransactionException ex){
            ex.printStackTrace();
        }catch (MavensBankException ex){
            ex.printStackTrace();
        }
    }

    @Test
    void findAccount(){
        try{
            long newAccountNumber = accountService.openAccount(abu,AccountType.SAVINGS);
            newAccountNumber = accountService.openAccount(abu, AccountType.CURRENT);
            newAccountNumber = accountService.openAccount(bessie, AccountType.SAVINGS);

        }catch(MavensBankException ex){
            ex.printStackTrace();
        }
    }




}