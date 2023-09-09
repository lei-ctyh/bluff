package com.group.dto;

import com.group.enmus.ResultEnum;

import java.io.Serializable;

/**
 * @author zhanglei
 */
public class AjaxResult implements Serializable{

    private ResultEnum code;
    private String msg;
    private Object data;

    public AjaxResult() {
    }

    public AjaxResult(ResultEnum code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static AjaxResult success() {
        return new AjaxResult(ResultEnum.SUCCESS, "请求成功", null);
    }
    public static AjaxResult error() {
        return new AjaxResult(ResultEnum.FAIL, "响应失败", null);
    }

    public ResultEnum getCode() {
        return code;
    }

    public void setCode(ResultEnum code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"code\":")
                .append(code);
        sb.append(",\"msg\":\"")
                .append(msg).append('\"');
        sb.append(",\"data\":")
                .append(data);
        sb.append('}');
        return sb.toString();
    }
}
