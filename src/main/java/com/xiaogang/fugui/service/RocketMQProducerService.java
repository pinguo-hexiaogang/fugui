package com.xiaogang.fugui.service;

import com.xiaogang.fugui.config.ExtRocketMQTemplate;
import com.xiaogang.fugui.config.RocketMQConfig;
import com.xiaogang.fugui.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.SendResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

/**
 * @author hexiaogang
 * @date 2021/4/7 10:01 上午
 */
@Slf4j
@Service
public class RocketMQProducerService {

    @Autowired
    private ExtRocketMQTemplate rocketMQTemplate;

    @Autowired
    private RocketMQConfig rocketMQConfig;

    public void sendSimpleTopicMsg() {
        SendResult sendResult = rocketMQTemplate.syncSend(rocketMQConfig.getSimpleTopic(), "hello rocket!");
        log.debug("send message:{}", sendResult);
    }

    public void sendSimpleTopicPayload() {
        UserDto userDto = new UserDto();
        userDto.setNickName("xiaogang");
        userDto.setUserName("hexiaogang");
        SendResult sendResult = rocketMQTemplate.syncSend(rocketMQConfig.getSimpleTopic(),
                MessageBuilder.withPayload(userDto).setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON_VALUE).build())
                ;
        log.debug("send message:{}", sendResult);
    }
}
