package com.apple.spring6.test;

import com.apple.spring6.Spring6Config;
import com.apple.spring6.biz.UserService;
import com.apple.spring6.biz.VipService;
import com.apple.spring6.service.AccountService;
import com.apple.spring6.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Egcoo
 * @date 2023/6/22 - 11:32
 */
public class testAop {

    @Test
    public void testSecurityLog() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Spring6Config.class);
        UserService userService = context.getBean("userService", UserService.class);
        VipService vipService = context.getBean("vipService", VipService.class);
        userService.saveUser();
        userService.updateUser();
        userService.deleteUser();
        userService.queryUser();
        vipService.queryVip();
        vipService.saveVip();
        vipService.updateVip();
        vipService.deleteVip();

    }

    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Spring6Config.class);
        OrderService oderService = context.getBean("orderService", OrderService.class);
        AccountService accountService = context.getBean("accountService", AccountService.class);
        oderService.generate();
        oderService.cancel();
        accountService.tansfer();
        accountService.withdraw();
    }
}
