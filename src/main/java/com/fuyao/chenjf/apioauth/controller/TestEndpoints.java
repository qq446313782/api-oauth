package com.fuyao.chenjf.apioauth.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestEndpoints {
    @GetMapping("/product/{id}")
    @ResponseBody
    public String getProduct(@PathVariable String id) {
        return "product id : " + id;
    }

    @GetMapping("/order/{id}")
    @ResponseBody
    public String getOrder(@PathVariable String id) {
        return "order id : " + id;
    }
}