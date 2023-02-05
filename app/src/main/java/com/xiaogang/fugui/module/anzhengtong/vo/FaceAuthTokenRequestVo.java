package com.xiaogang.fugui.module.anzhengtong.vo;

import lombok.Data;

/**
 * @author hexiaogang
 * @date 2023/2/1 3:32 下午
 */
@Data
public class FaceAuthTokenRequestVo {
    private String version;
    private String timestamp;
    private String account;
    private String idcard_name;
    private String idcard_number;
    private String return_url;
    private String query_code;
    private String purpose;
    private Boolean save_url_param;
    private String sign;
}
