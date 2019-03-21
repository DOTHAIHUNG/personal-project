package com.league.bloglol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LolControler {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
