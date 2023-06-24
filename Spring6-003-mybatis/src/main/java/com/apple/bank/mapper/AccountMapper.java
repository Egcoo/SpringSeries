package com.apple.bank.mapper;

import com.apple.bank.pojo.Account;

import java.util.List;

/**
 * @author Egcoo
 * @date 2023/6/24 - 14:28
 */
public interface AccountMapper {

    /**
     * 增加
     *
     * @param account
     * @return
     */
    int insert(Account account);

    /**
     * 删除
     *
     * @param account
     * @return
     */
    int deleteByActno(String account);

    /**
     * 修改
     *
     * @param account
     * @return
     */
    int update(Account account);

    /**
     * 查一个
     *
     * @param account
     * @return
     */
    Account selectByActno(String account);

    /**
     * 查所有
     *
     * @return
     */
    List<Account> selectAll();


}
