package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhanglei
 */
@Controller
@RequestMapping("/game")
public class GameController {

    @RequestMapping("/kid")
    public String Cat(){
        return "game/kid";
    }

}
