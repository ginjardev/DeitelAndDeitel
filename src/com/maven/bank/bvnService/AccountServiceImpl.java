package com.maven.bank.bvnService;

import com.maven.bank.Account;
import com.maven.bank.Customer;
import com.maven.bank.dataStore.AccountType;
import com.maven.bank.dataStore.CustomerRepo;
import exceptions.MavenBankTransactionException;
import exceptions.MavensBankException;

import java.math.BigDecimal;

public class AccountServiceImpl implements AccountService{

    @Override
    public long openAccount(Customer customer, AccountType accountType) throws MavensBankException {
        if(customer == null || accountType == null){
            throw new MavensBankException("Customer and account required to open new account");
        }
        if(accountTypeExists(customer, accountType)){
            throw new MavensBankException("customer already has the requested account type");
        }
        Account newAccount = new Account();
        newAccount.setAccountNumber(BankService.generateAccountNumber());
        newAccount.setTypeOfAccount(accountType);
        customer.getAccounts().add(newAccount);

        CustomerRepo.getCustomers().put(customer.getBvn(), customer);
        return newAccount.getAccountNumber();
    }

    private boolean accountTypeExists(Customer customer, AccountType accountType){
        boolean accountTypesExits = false;
        for(Account customerAccount: customer.getAccounts()){
            if(customerAccount.getTypeOfAccount() == accountType){
                accountTypesExits = true;
                break;
            }
        }
        return accountTypesExits;
    }

    @Override
    public BigDecimal deposit(BigDecimal amount, long accountNumber)throws MavenBankTransactionException {
        BigDecimal newBalance = BigDecimal.ZERO;
        return newBalance;
    }

    @Override
    public Account findAccount(long accountNumber) throws MavensBankException{
        Account foundAccount = null;
        boolean accountFound = false;
        for (Customer customer: CustomerRepo.getCustomers().values()) {
            for (Account account: customer.getAccounts()) {
                if(account.getAccountNumber() == accountNumber){
                    foundAccount = account;
                    accountFound = true;
                    break;
                }
            }
            if(accountFound) break;
        }
        return foundAccount;
    }
}
