package com.maven.bank.bvnService;

import com.maven.bank.Account;
import com.maven.bank.Customer;
import com.maven.bank.dataStore.AccountType;
import exceptions.MavenBankTransactionException;
import exceptions.MavensBankException;

import java.math.BigDecimal;

public interface AccountService {
    public long openAccount(Customer customer, AccountType accountType) throws MavensBankException;
    public BigDecimal deposit(BigDecimal amount, long accountNumber)throws MavenBankTransactionException;
    public Account findAccount(long accountNumber) throws MavensBankException;
}
