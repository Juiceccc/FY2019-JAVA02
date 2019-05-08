package com.neuedu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class HelloController {

    @Value("${limit.minMoney}")
    private BigDecimal minMoney;
    @Value("${limit.maxMoney}")
    private BigDecimal maxMoney;

    @RequestMapping(value="/hello")
    public String Hello(){
        return "最少"+minMoney+"最多"+maxMoney;
    }
}
