package com.example.demo.exception;

import com.example.demo.enums.ResultEnum;

/**
 * Created by zuzhaoyue on 17/9/13.
 */
public class PersonException extends RuntimeException {
    private Integer code;

    public PersonException(String message) {
        super(message);
    }

    public PersonException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public PersonException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
