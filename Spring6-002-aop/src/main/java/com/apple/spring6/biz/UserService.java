package com.apple.spring6.biz;

import org.springframework.stereotype.Service;

/**
 * @author Egcoo
 * @date 2023/6/22 - 11:42
 */
@Service
public class UserService {

    //增加用户
    public void saveUser() {
        System.out.println("增加用户");
    }

    public void updateUser() {
        System.out.println("修改用户");
    }

    public void deleteUser() {
        System.out.println("删除用户");
    }

    public void queryUser() {
        System.out.println("查询用户");
    }
}
