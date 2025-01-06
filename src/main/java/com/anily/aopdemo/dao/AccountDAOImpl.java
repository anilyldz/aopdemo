package com.anily.aopdemo.dao;

import com.anily.aopdemo.Account;
import org.springframework.stereotype.Repository;

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
}
