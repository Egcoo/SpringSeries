package com.apple.spring6.biz;

import org.springframework.stereotype.Service;

/**
 * @author Egcoo
 * @date 2023/6/22 - 11:45
 */
@Service
public class VipService {

    //增加用户
    public void saveVip() {
        System.out.println("增加vip用户");
    }

    public void updateVip() {
        System.out.println("修改vip用户");
    }

    public void deleteVip() {
        System.out.println("删除vip用户");
    }

    public void queryVip() {
        System.out.println("查询vip用户");
    }
}
