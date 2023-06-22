package com.apple.spring6.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Egcoo
 * @date 2023/6/22 - 11:46
 */
@Component
@Aspect
public class SecurityAspect {

    @Before("execution(* com.apple.spring6.biz..*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        //获取系统时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowTime = sdf.format(new Date());
        System.out.println("当前时间:" + nowTime + "张三 ：" + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
    }
}
