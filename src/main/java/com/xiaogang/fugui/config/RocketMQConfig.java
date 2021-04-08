package com.xiaogang.fugui.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author hexiaogang
 * @date 2021/4/7 10:10 上午
 */
@ConfigurationProperties(prefix = "fugui.rocketmq")
@Data
@Component
public class RocketMQConfig {
    /**
     * name server
     */
    private String extNameServer;

    /**
     * 简单topic
     */
    private String simpleTopic;
}
