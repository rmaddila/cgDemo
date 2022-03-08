package com.capgemini.userDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication
public class UserDemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(UserDemoApplication.class, args);
    }

}
