package com.webcloud.boot.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description : The hello controller.
 *
 * @author : LiangCL
 * @version : 2019/12/22
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, SpringBoot!";
    }
}
