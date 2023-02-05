package com.xiaogang.fugui;

import com.xiaogang.fugui.module.anzhengtong.FaceAuthService;
import com.xiaogang.fugui.module.anzhengtong.idcard;
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
@ActiveProfiles("dev")
class FuguiApplicationTests {
	@Autowired
	private FaceAuthService faceAuthService;
	@Autowired
	private com.xiaogang.fugui.module.anzhengtong.idcard idcard;
	@Test
	void test() {
		//faceAuthService.getFaceAuthToken();
		idcard.idcard_new();

	}

}
