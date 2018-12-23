package com.platform.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-12-22 23:49
 **/
@RestController
public class HomeController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String printHelloWorld() {
        return "hello world!";
    }
}
