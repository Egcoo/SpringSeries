package com.apple.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Egcoo
 * @date 2023/6/2 - 19:46
 */
public class UserDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);


    public void insert() {
        //System.out.println("数据库正在保存用户信息");
        //使用 log4j2 框架
        logger.info("数据库正在保存用户信息");
    }

}
