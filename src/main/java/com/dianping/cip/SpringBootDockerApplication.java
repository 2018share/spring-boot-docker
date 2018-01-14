package com.dianping.cip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主应用入口
 * @author zhougaolei
 */
@RestController
@SpringBootApplication
public class SpringBootDockerApplication {

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World, Hello Docker Spring Boot";
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}
}
