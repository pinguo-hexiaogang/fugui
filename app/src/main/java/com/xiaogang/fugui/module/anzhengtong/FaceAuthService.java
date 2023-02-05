package com.xiaogang.fugui.module.anzhengtong;

import com.google.common.collect.Lists;
import com.xiaogang.fugui.module.anzhengtong.vo.FaceAuthTokenRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

/**
 * @author hexiaogang
 * @date 2023/2/1 3:30 下午
 */
@Service
public class FaceAuthService {
    @Autowired
    private RestTemplate restTemplate;

    public void getFaceAuthToken() {
        FaceAuthTokenRequestVo requestVo = new FaceAuthTokenRequestVo();
        requestVo.setVersion("1.0");
        requestVo.setTimestamp(String.valueOf(new Date().getTime()));
        requestVo.setAccount("vWBCwlJ1poxh");
        requestVo.setIdcard_name("何小刚");
        requestVo.setIdcard_number("510921198712152035");
        requestVo.setReturn_url("https://lw-app-st-zzcscec3b.tabe.com.cn/index.html");
        requestVo.setQuery_code("1");
        requestVo.setPurpose("ok");
        requestVo.setSave_url_param(true);
        // 签名
        List<String> signList = Lists.newLinkedList();
        signList.add(requestVo.getVersion());
        signList.add(requestVo.getTimestamp());
        signList.add(requestVo.getAccount());
        signList.add("mplJqQpDMVDn");
        signList.add(requestVo.getIdcard_name());
        signList.add(requestVo.getIdcard_number());
        signList.add(requestVo.getReturn_url());
        signList.add(requestVo.getQuery_code());
        signList.add(requestVo.getPurpose());
        signList.add(requestVo.getSave_url_param().toString());
        String sign = SignUtil.sign(signList);
        requestVo.setSign(sign);

        // 请求token
        ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://testyqt.easysign.cn:8028/APIService/api/v1/face/getToken", requestVo, String.class);
        String result = responseEntity.getBody();
        System.out.println(result);
    }
}
