package com.example.demo.enums;

/**
 * Created by zuzhaoyue on 17/9/14.
 */
public enum ResultEnum {

    UNKNOEN_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    TOO_LITTLE(101,"你还太小"),
    TOO_OLD(102,"你太老了")
    ;


    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
