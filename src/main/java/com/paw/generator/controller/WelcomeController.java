package com.paw.generator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Rubble
 * Created on 2020/3/27
 */
@Controller
public class WelcomeController {

    @GetMapping("/")
    public String home(){
        return "index";
    }
}
