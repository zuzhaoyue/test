package com.example.demo.handle;

import com.example.demo.exception.PersonException;
import com.example.demo.model.Result;
import com.example.demo.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zuzhaoyue on 17/9/13.
 */
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof PersonException){
            PersonException personException = (PersonException) e;
            return ResultUtil.error(personException.getCode(),personException.getMessage());
        }else {
            return ResultUtil.error(-1, "未知错误:"+e.getMessage());
        }
    }
}
