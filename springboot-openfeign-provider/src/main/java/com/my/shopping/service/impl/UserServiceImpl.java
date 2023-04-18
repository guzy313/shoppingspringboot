package com.my.shopping.service.impl;

import com.my.shopping.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Gzy
 * @version 1.0
 * @Description
 * @date create on 2023/4/18
 */
@Service
public class UserServiceImpl implements UserService {


    @Override
    public String getTestInfo() {
        return "testInfo";
    }
}
