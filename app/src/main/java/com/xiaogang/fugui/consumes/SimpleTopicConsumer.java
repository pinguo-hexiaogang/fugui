package com.xiaogang.fugui.consumes;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * @author hexiaogang
 * @date 2021/4/7 3:49 下午
 */
@Service
@RocketMQMessageListener(nameServer = "${fugui.rocketmq.extNameServer}",
        topic = "${fugui.rocketmq.simple-topic}",
        consumerGroup = "${fugui.rocketmq.consumer.group}")
@Slf4j
public class SimpleTopicConsumer implements RocketMQListener<String> {
    @Override
    public void onMessage(String message) {
        log.debug("receive message:{}", message);
    }
}
