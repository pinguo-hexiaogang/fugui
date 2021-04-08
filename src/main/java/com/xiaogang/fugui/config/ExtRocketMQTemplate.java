package com.xiaogang.fugui.config;

import org.apache.rocketmq.spring.annotation.ExtRocketMQTemplateConfiguration;
import org.apache.rocketmq.spring.core.RocketMQTemplate;

/**
 * @author hexiaogang
 * @date 2021/4/7 9:57 上午
 */
@ExtRocketMQTemplateConfiguration(nameServer = "${fugui.rocketmq.extNameServer}",group = "${fugui.rocketmq.producer.group}")
public class ExtRocketMQTemplate extends RocketMQTemplate {
}
