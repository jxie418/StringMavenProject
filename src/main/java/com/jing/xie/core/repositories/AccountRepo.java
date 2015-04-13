package com.jing.xie.core.repositories;

import com.jing.xie.core.entities.Account;
import com.jing.xie.core.entities.Blog;

import java.util.List;

/**
 * Created by JXie on 4/12/2015.
 */
public interface AccountRepo {
    Account findAccount(Long id);
    Account createAccount(Account data);
    Blog createBlog(Long accountId, Blog data);
    List<Account> findAllAccounts();
    Account findAccountByName(String name);
}
