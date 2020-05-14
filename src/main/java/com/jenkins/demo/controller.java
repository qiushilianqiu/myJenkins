package com.jenkins.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping("/test")
    public String testJenKins() {
        return "欢迎测试jenkins！！！,第十次次次提交";
    }
}
