package com.group.enmus;

/**
 * @author zhanglei
 * @version 1.0.0
 * @ClassName enmusa.java
 * @Description TODO
 * @createTime 2023-09-09 13:32:00
 */

public enum  ResultEnum {
    /**
     * 成功
     */
    SUCCESS(200),
    /**
     * 失败
     */
    FAIL(400),
    /**
     * 接口不存在
     */
    NOT_FOUND(404),
    /**
     * 服务器内部错误
     */
    INTERNAL_SERVER_ERROR(500);
    public int code;
    ResultEnum(int code) {
        this.code = code;
    }
}
