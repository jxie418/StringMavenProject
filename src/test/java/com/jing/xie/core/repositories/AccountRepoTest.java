package com.jing.xie.core.repositories;

import com.jing.xie.core.entities.Account;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by JXie on 4/12/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/business-config.xml")
public class AccountRepoTest {

    @Autowired
    private  AccountRepo repo;

    private  Account account;
    @Before
    @Transactional
    @Rollback(false)

    public void setup() {
        account = new Account();
        account.setName("name");
        account.setPassword("password");
        repo.createAccount(account);
    }
    @Test
    @Transactional
    public void testFind(){
        assertNotNull(repo.findAccount(account.getId()));
    }
}
