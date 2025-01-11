package com.anily.aopdemo.dao;

import com.anily.aopdemo.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountDAOImpl implements AccountDAO{

    private String name;

    private String serviceCode;

    @Override
    public void addAccount(Account account) {
        System.out.println(getClass() + ": ADDING AN ACCOUNT ACCOUNTDAO");
    }

    @Override
    public void addAccountVIP(Account account, boolean vipFlag) {
        System.out.println(getClass() + ": ADDING AN ACCOUNT ACCOUNTDAO WITH VIPFLAG");
    }

    public String getName() {
        System.out.println(getClass() + ": getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + ": setName()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass() + ": getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + ": setServiceCode()");
        this.serviceCode = serviceCode;
    }

    @Override
    public List<Account> findAccounts() {
        List<Account> accounts = new ArrayList<>();

        Account account1 = new Account("John", "Bronze");
        Account account2 = new Account("Peter", "Silver");
        Account account3 = new Account("Robert", "Platinum");

        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);

        return accounts;
    }
}
