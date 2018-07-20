package com.zsc.springQuartz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:ShaochaoZhao
 * @Description:
 * @Date:Create in 10:32 2018/7/18
 * @Modified By:
 **/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String test(){
        return "HELLO";
    }
}
