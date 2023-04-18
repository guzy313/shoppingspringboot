package com.my.shopping.controller;

import com.my.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Gzy
 * @version 1.0
 * @Description
 * @date create on 2023/4/18
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping(value = "/user/getTestInfo")
    public String getTestInfo(){
        return userService.getTestInfo();
    }

}
