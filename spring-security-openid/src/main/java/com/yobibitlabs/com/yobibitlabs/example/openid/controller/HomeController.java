package com.yobibitlabs.com.yobibitlabs.example.openid.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public final String home() {
        final String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return "Welcome, " + username;
    }
}
