package com.xiaogang.fugui.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author yssl
 */
@Service
@Slf4j
public class HelloService {
    public void helloService() {
        log.debug("service");
    }
}
