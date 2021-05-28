package com.beiwu.graph.data.center.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangshaofeng
 * @date 2021/5/28
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/index")
    public String index(){
        return "demo data";
    }
}
