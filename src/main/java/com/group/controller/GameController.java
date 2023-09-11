package com.group.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

@Controller
public class GameController {
    /**
     * 所有资源放行
     * @param request
     * @return
     */

    @RequestMapping("/game/gamehall.html")
    public String Cat(HttpServletRequest request) {
        String uri = request.getRequestURI();
        System.out.println(uri);
        return "game/gameHall";
    }

}
