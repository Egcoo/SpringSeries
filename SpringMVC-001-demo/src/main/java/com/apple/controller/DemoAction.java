package com.apple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Egcoo
 * @date 2023/7/1 - 18:57
 */
@Controller
public class DemoAction {

    /**
     * **
     * 以前的Servlet的规范
     * protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
     * action中所有的功能实现都是由方法来完成的
     * action方法的规范
     * 1)访问权限是public
     * 2)方法的返回值任意
     * 3)方法名称任意
     * response) throws ServletException, IOException {}
     * 4)方法可以没有参数,如果有可是任意类型
     * 5)要使用@RequestMapping注解来声明一个访问的路径(名称)
     */

    @RequestMapping("/demo.action")
    public String demo() {
        System.out.println("服务器被访问到了.......");
        //可以直接跳到/admin/main.jsp页面上
        return "main";

    }
}