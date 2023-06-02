package com.apple.spring6.service;

import com.apple.spring6.dao.UserDao;

/**
 * @author Egcoo
 * @date 2023/6/2 - 19:49
 */
public class UserService {
    private UserDao userDao;

    /**
     * 这个set方法是IDEA生成，符合javabean规范
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void saveUser() {
        //保存用户信息到数据库
        userDao.insert();
    }

}
