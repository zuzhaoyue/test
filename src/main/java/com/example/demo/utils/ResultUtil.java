package com.example.demo.utils;

import com.example.demo.model.Result;

/**
 * Created by zuzhaoyue on 17/9/13.
 */
public class ResultUtil {
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setData(object);
        result.setMsg("成功");
        return result;
    }
    public static Result success(){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        return result;
    }
    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return  result;
    }
}
