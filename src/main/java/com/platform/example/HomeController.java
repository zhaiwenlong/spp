package com.platform.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-12-22 23:49
 **/
@Controller
public class HomeController {
    @RequestMapping("/hello")
    public String printHelloWorld() {
        return "readingList";
    }

    @RequestMapping("/helloo")
    public String printHelloWorld1() {
        return "hahaha";
    }
}
