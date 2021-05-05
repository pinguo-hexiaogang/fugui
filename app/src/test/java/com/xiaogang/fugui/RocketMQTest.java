package com.xiaogang.fugui;

import com.xiaogang.fugui.service.RocketMQProducerService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = FuguiApplication.class)
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles(profiles = {"dev"})
class RocketMQTest {
    @Autowired
    private RocketMQProducerService rocketMQProducerService;

    @Test
    void testSendSimpleTopicMsg() {
        rocketMQProducerService.sendSimpleTopicMsg();
    }

    @Test
    void testSendSimpleTopicPayload() {
        rocketMQProducerService.sendSimpleTopicPayload();
    }

}
