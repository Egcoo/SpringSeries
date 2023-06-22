package com.apple.spring6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Egcoo
 * @date 2023/6/22 - 11:25
 */
@Configuration
@ComponentScan({"com.apple.spring6.service", "com.apple.spring6.biz"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Spring6Config {
}

