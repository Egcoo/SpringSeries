package com.apple.spring6.service;

import org.springframework.stereotype.Service;

/**
 * @author Egcoo
 * @date 2023/6/22 - 11:22
 */
@Service
public class OrderService {
    /**
     * 生成订单的业务方法
     */
    public void generate() {
        System.out.println("生成订单的业务方法");
    }

    /**
     * 取消订单的业务方法
     */
    public void cancel() {
        System.out.println("取消订单的业务方法");
    }
}
