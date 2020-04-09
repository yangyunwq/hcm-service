package com.pharmakeyring.hcm.hcmservice.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yangyun
 * @date 2020-04-09 11:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Output {

    //http状态码
    private int code;

    //返回信息
    private String msg;

    //返回的数据
    private Object data;

    public Output(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
