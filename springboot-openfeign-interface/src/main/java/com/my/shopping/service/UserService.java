package com.my.shopping.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Gzy
 * @version 1.0
 * @Description
 * @date create on 2023/4/18
 */
@FeignClient(value = "shoppingspringboot-openfeign-interface-service")
@Service
public interface UserService {

    @GetMapping(value = "/user/getTestInfo")
    String getTestInfo();

}
