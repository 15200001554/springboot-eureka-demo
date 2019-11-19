package com.example.springbooteurekaserver01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * @author
 * 启动一个服务注册中心
 * 只需要一个注解@EnableEurekaServer
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringbootEurekaServer01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEurekaServer01Application.class, args);
    }

}
