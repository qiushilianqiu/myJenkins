package com.jenkins.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping("/test")
    public String testJenKins() {
        return "欢迎测试jenkins！ ！！ , 当前版本为1.0.0";
    }
}
