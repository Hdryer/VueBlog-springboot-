package com.bindada.common.lang;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {
    private int code;   //200是正常，非200表示异常
    private String msg;
    private Object data;

    //返回成功结果
    public static  Result success(Object data){
        return success(200,"操作成功",data);
    }

    public static Result success(int code,String msg,Object data){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    //返回失败结果
    public static Result fail(String msg){

        return fail(400,msg,null);
    }

    //失败
    public static Result fail(String msg,Object data){

        return fail(400,msg,data);
    }

    public static Result fail(int code,String msg,Object data){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
