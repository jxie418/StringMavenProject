package com.jing.xie.core.repositories.jpa;

import com.jing.xie.core.entities.Account;
import com.jing.xie.core.entities.Blog;
import com.jing.xie.core.repositories.AccountRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by JXie on 4/12/2015.
 */
@Repository
public class JpaAccountRepo implements AccountRepo{
    @PersistenceContext
    private EntityManager em;

    @Override
    public Account findAccount(Long id) {

        return em.find(Account.class,id);
    }

    @Override
    public Account createAccount(Account data) {
        em.persist(data);
        return data;
    }

    @Override
    public Blog createBlog(Long accountId, Blog data) {
        return null;
    }
    @Override
    public  List<Account> findAllAccounts(){
        Query query = em.createQuery("Select a from Account a");
        return query.getResultList();
    }

    @Override
    public Account findAccountByName(String name) {
        Query query = em.createQuery("Select a from Account a where a.name =?1");
        query.setParameter(1,name);
        List<Account> accounts = query.getResultList();
        if (accounts.size() == 0) {
            return null;
        } else {
            return accounts.get(0);
        }
    }
}
