package com.capgemini.userDemo.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@ComponentScan(basePackages = "com.capgemini.userDemo")
@EnableJpaRepositories(basePackages = "com.capgemini.userDemo.repository")
@EntityScan(basePackages = "com.capgemini.userDemo.model")
public class AppConfiguration {

}
