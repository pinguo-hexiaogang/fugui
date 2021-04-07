package com.xiaogang.fugui.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author hexiaogang
 * @date 2020/8/1
 */
@RestController
@RequestMapping("/api/hello")
public class HelloController {
    private Logger logger = LoggerFactory.getLogger(HelloController.class.getSimpleName());

    @Autowired
    private HelloService helloService;

    @GetMapping("/print")
    public String helloWorld() {
        logger.debug("{}hello log:", "小刚");
        helloService.helloService();
        return "hello world";
    }
}
