package com.anily.aopdemo.dao;

import com.anily.aopdemo.Account;

import java.util.List;

public interface AccountDAO {

    void addAccount(Account account);

    void addAccountVIP(Account account, boolean vipFlag);

    String getName();

    void setName(String name);

    String getServiceCode();

    void setServiceCode(String serviceCode);

    List<Account> findAccounts();

    List<Account> findAccounts(boolean excFlag);
}
