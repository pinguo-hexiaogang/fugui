package com.xiaogang.fugui;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.InputStream;

@SpringBootApplication
@Slf4j
public class FuguiApplication implements ApplicationRunner , BeanNameAware {

	public static void main(String[] args) {
		SpringApplication.run(FuguiApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
//		InputStream inputStream = FuguiApplication.class.getResourceAsStream("/templates/test.pdf");
////		File  testFile = new File(path);
////		boolean fileExist = testFile.exists();
//
//		log.debug("file exsit");
	}

	@Override
	public void setBeanName(String name) {
	    log.debug("FuguiApplication bean Name{}",name);
	}
}
