package com.anily.aopdemo.dao;

import com.anily.aopdemo.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{

    @Override
    public void addAccount(Account account) {
        System.out.println(getClass() + ": ADDING AN ACCOUNT ACCOUNTDAO");
    }

    @Override
    public void addAccountVIP(Account account, boolean vipFlag) {
        System.out.println(getClass() + ": ADDING AN ACCOUNT ACCOUNTDAO WITH VIPFLAG");
    }
}
