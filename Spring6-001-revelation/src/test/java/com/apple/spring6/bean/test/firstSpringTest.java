package com.apple.spring6.bean.test;

import com.apple.spring6.bean.User;
import com.apple.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ author Egcoo
 * @ date 2023/6/2 - 13:55
 */
public class firstSpringTest {

    @Test
    public void testSpringCode() {
        //第一步:获取Spring容器对象。
        //ApplicationContext翻译为:应用上下文。其实就是Spring容器。
        //ApplicationContext是一个接口。
        //ApplicationContext接口下有很多实现类。其中有一个实现类叫做:ClassPathXmlApplicationContext
        //ClassPathXmlApplicationContext专门从类路径当中加载spring配置文件的一个Spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //第二步：根据bean的id从Spring容器中获取这个对象
        User userBean = (User) context.getBean("userBean");
        System.out.println(userBean);
    }

    @Test
    public void testSetDI() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = context.getBean("userServiceBean", UserService.class);
        userService.saveUser();

    }
}
