package com.jing.xie.core.services;

import com.jing.xie.core.entities.Account;
import com.jing.xie.core.entities.Blog;
import com.jing.xie.core.services.util.AccountList;
import com.jing.xie.core.services.util.BlogList;

/**
 * Created by JXie on 4/12/2015.
 */
public interface AccountService {
    public Account findAccount(Long id);
    public Account createAccount(Account data);
    public Blog createBlog(Long accountId, Blog data);
    public BlogList findBlogsByAccount(Long accountId);
    public AccountList findAllAccounts();
    public Account findByAccountName(String name);
}
