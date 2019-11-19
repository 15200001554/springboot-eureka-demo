package com.example.springbooteurekaserver03;

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
public class SpringbootEurekaServer03Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEurekaServer03Application.class, args);
    }

}
