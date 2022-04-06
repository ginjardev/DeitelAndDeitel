package com.maven.bank.dataStore;

import com.maven.bank.Account;
import com.maven.bank.Customer;
import com.maven.bank.bvnService.BankService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CustomerRepo {
    private static Map<Long, Customer> customers = new HashMap<>();

    public static Map<Long, Customer> getCustomers() {
        return customers;
    }

    private static void setCustomers(Map<Long, Customer> customers) {
        CustomerRepo.customers = customers;
    }

    private void initializeDatastore(){
        Customer john = new Customer();
        john.setBvn(BankService.generateBVN());
        john.setEmail("johndoe@gmail.com");
        john.setFirstName("John");
        john.setSurname("Doe");
        john.setPhone("0803507234");
        Account johnSavingsAccount = new Account(1, AccountType.SAVINGS);
        john.getAccounts().add(johnSavingsAccount);

        Account johnCurrentAccount = new Account(1, AccountType.CURRENT, new BigDecimal(5000000));
        john.getAccounts().add(johnCurrentAccount);
        customers.put(john.getBvn(), john);

        Customer jane = new Customer();
        jane.setBvn(BankService.generateBVN());
        jane.setEmail("janedoe@gmail.com");
        jane.setFirstName("Jane");
        jane.setSurname("Doe");
        jane.setPhone("0803507254");

        Account janeAccount = new Account(3, AccountType.SAVINGS);
        jane.getAccounts().add(johnSavingsAccount);
        customers.put(jane.getBvn(), jane);
    }




}
