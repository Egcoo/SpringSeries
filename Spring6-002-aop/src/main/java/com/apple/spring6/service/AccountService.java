package com.apple.spring6.service;

import org.springframework.stereotype.Service;

/**
 * @author Egcoo
 * @date 2023/6/22 - 11:22
 */
@Service
public class AccountService {
    /**
     * 转账的业务方法
     */
    public void tansfer() {
        System.out.println("银行账户正在完成转账操作");
    }

    /**
     * 取款的业务方法
     */
    public void withdraw() {
        System.out.println("取款的业务方法");
    }

}
