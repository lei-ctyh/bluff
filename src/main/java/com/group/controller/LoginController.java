package com.group.controller;

import com.group.dto.AjaxResult;
import com.group.dto.LoginUserDto;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author zhanglei
 * @version 1.0.0
 * @ClassName LoginController.java
 * @Description 登录接口
 * @createTime 2023-09-09 13:20:00
 */

@RestController
@CrossOrigin
public class LoginController {
    @RequestMapping("game/login")
    public AjaxResult login(@RequestBody LoginUserDto loginUser) {
        System.out.println(loginUser);
        return AjaxResult.success();
    }
}
