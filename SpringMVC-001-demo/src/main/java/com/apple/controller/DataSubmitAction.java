package com.apple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Egcoo
 * @date 2023/7/11 - 16:45
 */
@Controller
public class DataSubmitAction {

    /**
     * @param myname
     * @return
     */
    @RequestMapping("/one.action")
    public String one(String myname, int age) {
        System.out.println("myname =" + myname + ",age =" + age);
        return "main";
    }
}
