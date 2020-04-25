package com.example.boot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
//@SpringBootApplication can replace @EnableAutoConfiguration and @ComponentScan
public class App {
    public static void main(String[] args) {
//        SpringApplication.run(App.class, args); //Default method

        // Disable the Springboot logo in console
//        SpringApplicationBuilder builder = new SpringApplicationBuilder(App.class);
//        builder.bannerMode(Banner.Mode.OFF).run(args);

        // Switch among different profiles instead of using 'application.properties'
        SpringApplicationBuilder builder = new SpringApplicationBuilder((App.class));
        builder.application().setAdditionalProfiles("dev");
        builder.run(args);

    }
}
