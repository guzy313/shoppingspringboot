package com.my.shopping.listener;

import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.annotation.SelectorType;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author Gzy
 * @version 1.0
 * @Description
 * @date create on 2023/4/18
 */
@RocketMQMessageListener(topic = "springboot-rocketmq",//订阅主题
        consumerGroup = "${rocketmq.consumer.group}",//消费者群组
        consumeMode = ConsumeMode.CONCURRENTLY, //指定消费模式,默认为并发消费
        selectorType = SelectorType.TAG,//过滤类型
        selectorExpression = "*"//过滤条件
)
@Component
public class ConsumerListener implements RocketMQListener<String>{

    @Override
    public void onMessage(String s) {
        System.out.println("接收到的消息:" + s);
    }
}
