package com.my.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Gzy
 * @version 1.0
 * @Description
 * @date create on 2023/4/18
 */
@SpringBootApplication
public class ShoppingConsumerMain {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingConsumerMain.class,args);
        System.out.println("ShoppingConsumer消费者已启动..");
    }

}
