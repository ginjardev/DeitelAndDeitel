package com.maven.bank;

import com.maven.bank.dataStore.AccountType;

import java.math.BigDecimal;

public class Account {
    private long accountNumber;
    private AccountType typeOfAccount;
    private BigDecimal balance;
    private String accountPin;

    public Account(){

    }
    public Account(long accountNumber, AccountType accountType){
        this.accountNumber = accountNumber;
        typeOfAccount = accountType;
    }
    public Account(long accountNumber, AccountType accountType, BigDecimal balance){
        this.accountNumber = accountNumber;
        typeOfAccount = accountType;
        this.balance = balance;
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountType getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(AccountType typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getAccountPin() {
        return accountPin;
    }

    public void setAccountPin(String accountPin) {
        this.accountPin = accountPin;
    }
}
