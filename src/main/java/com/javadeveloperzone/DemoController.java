package com.javadeveloperzone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping(value = "hello")
    public String hello(){
        return "Hello Honeywell. This is Spring boot Gradle Sample Project for POC";
    }
}
