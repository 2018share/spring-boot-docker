package com.dianping.cip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * desc: 应用程序启动引导类
 * @author zhougaolei
 */
@RestController
//开启组件扫描和自动配置 @Configuration @ComponentScan @EnableAutoConfiguration
@SpringBootApplication
public class SpringBootDockerApplication {

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World, Hello Docker Spring Boot";
    }

	public static void main(String[] args) {
        //负责启动引导应用程序 可执行jar包
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}
}
