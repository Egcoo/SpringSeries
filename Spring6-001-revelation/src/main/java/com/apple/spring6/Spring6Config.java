package com.apple.spring6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Egcoo
 * @date 2023/6/21 - 15:55
 */

/**
 * 代替spring.xml 组件
 * 组件扫描
 * proxy-target-class="true" 表示强制使用CGLIB动态代理
 * proxy-target-class="false"这是默认值,表示接口使用JDK动态代理,反之使用CGLIB动态代理
 *
 * @author Egcoo
 */
@Configuration
@ComponentScan({"com.apple.spring6"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Spring6Config {
}
