package com.jing.xie.core.services.util;

import com.jing.xie.core.entities.Account;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JXie on 4/12/2015.
 */
public class AccountList {
    private List<Account> accounts = new ArrayList<Account>();

    public AccountList(List<Account> list) {
        this.accounts = list;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
