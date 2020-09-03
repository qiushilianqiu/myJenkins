package com.jenkins.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping("/test")
    public String testJenKins() {

        System.out.println("欢迎关岭小伙访问。。。。。");
        return "欢迎测试jenkins！ ！！ , 当前版本为1.0.4";
    }
}
