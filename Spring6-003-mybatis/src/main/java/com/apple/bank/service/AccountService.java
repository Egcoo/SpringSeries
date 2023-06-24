package com.apple.bank.service;

import com.apple.bank.pojo.Account;

import java.util.List;

/**
 * @author Egcoo
 * @date 2023/6/24 - 14:54
 */
public interface AccountService {

    /**
     * 开户
     *
     * @param act
     * @return
     */
    int save(Account act);

    /**
     * 注销
     *
     * @param actno
     * @return
     */
    int deleteByActno(String actno);

    /**
     * 修改
     *
     * @param account
     * @return
     */
    int modify(Account account);

    /**
     * 查一个
     *
     * @param actno
     * @return
     */
    Account getByActno(String actno);

    /**
     * 查所有
     *
     * @return
     */
    List<Account> getAll();

    /**
     * 转账
     *
     * @param fromActno
     * @param toActno
     * @param money
     */
    void transfer(String fromActno, String toActno, double money);
}


