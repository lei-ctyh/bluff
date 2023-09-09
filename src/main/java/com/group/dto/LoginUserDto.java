package com.group.dto;

/**
 * @author zhanglei
 * @version 1.0.0
 * @ClassName LoginUserDto.java
 * @Description TODO
 * @createTime 2023-09-09 14:48:00
 */
public class LoginUserDto {
    private String username;
    private String password;
    private String captcha;

    public LoginUserDto() {
    }

    public LoginUserDto(String username, String password, String captcha) {
        this.username = username;
        this.password = password;
        this.captcha = captcha;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}
